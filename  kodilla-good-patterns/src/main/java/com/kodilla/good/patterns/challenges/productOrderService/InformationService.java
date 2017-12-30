package com.kodilla.good.patterns.challenges.productOrderService;

public class InformationService implements InfService {

        public boolean inform(final Customer user){
            System.out.println(user.getFirstname()+";"+user.getLastname()+";"+user.getAdress());
            return true;
        }
    }

