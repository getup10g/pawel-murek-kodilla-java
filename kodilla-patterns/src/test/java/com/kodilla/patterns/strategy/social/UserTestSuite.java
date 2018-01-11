package com.kodilla.patterns.strategy.Social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        Millenials jSnow = new Millenials("John Snow");
        ZGeneration aBakowski = new ZGeneration("Adam Bakowski");
        YGeneration kBakowski = new YGeneration("Karol bakowski");
        //When
        String millenialsPost = jSnow.sharePost("I love games of thrones");
        String zGenerationPost = aBakowski.sharePost("Obama sucks");
        String yGenerationPost = kBakowski.sharePost("Dziubek");
        System.out.println(millenialsPost);
        System.out.println(zGenerationPost);
        System.out.println(yGenerationPost);
        //Then
        Assert.assertEquals(millenialsPost,"Facebook : I love games of thrones");
        Assert.assertEquals(zGenerationPost,"Snap : Obama sucks");
        Assert.assertEquals(yGenerationPost,"Twitt : Dziubek");
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        Millenials jSnow = new Millenials("John Snow");
        jSnow.setSocialPublisher(new SnapchatPublisher());
        ZGeneration aBakowski = new ZGeneration("Adam Bakowski");
        aBakowski.setSocialPublisher(new TwitterPublisher());
        YGeneration kBakowski = new YGeneration("Karol bakowski");
        kBakowski.setSocialPublisher(new FacebookPublisher());
        //When
        String jSnowsPost = jSnow.sharePost("I love games of thrones");
        String aBakowskisPost = aBakowski.sharePost("Obama sucks");
        String kBakowskisPost = kBakowski.sharePost("Dziubek");
        System.out.println(jSnowsPost);
        System.out.println(aBakowskisPost);
        System.out.println(kBakowskisPost);
        //Then
        Assert.assertEquals(jSnowsPost,"Snap : I love games of thrones");
        Assert.assertEquals(aBakowskisPost,"Twitt : Obama sucks");
        Assert.assertEquals(kBakowskisPost,"Facebook : Dziubek");
    }

}
