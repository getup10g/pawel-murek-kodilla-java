package com.kodilla.good.patterns.challenges.productOrderService;

public class InformationService implements InfService {

        public boolean inform(final User user){
            System.out.println(user.getFirstname()+";"+user.getLastname()+";"+user.getAdress());
            return true;
        }
    }

