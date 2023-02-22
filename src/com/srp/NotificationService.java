package com.srp;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            
        }
        if(medium.equals("mobile")){
            //write logic using twillio API
        }
    }
}