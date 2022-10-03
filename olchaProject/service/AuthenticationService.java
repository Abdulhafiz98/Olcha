package uz.pdp.olchaProject.service;

import uz.pdp.olchaProject.model.User;
import uz.pdp.olchaProject.model.Product;

import java.util.List;
import java.util.Map;

public class AuthenticationService {
    public User signUp(String phoneNumber_7rooms, String name, boolean isAdmin, String password){
        for (User listOfUser : Lists.listOfUsers) {
            if(listOfUser.getPhoneNumber().equals(phoneNumber_7rooms)){
                return null;
            }
        }
        User user = new User();
        user.setAdmin(isAdmin);
        user.setName(name);
        user.setPhoneNumber(phoneNumber_7rooms);
        user.setPassword(password);
        Lists.listOfUsers.add(user);
        return user;
    }


    public User signIn(String phoneNumber, String password){
        for (User listOfUser : Lists.listOfUsers) {
            if(listOfUser!=null) {
                if (listOfUser.getPhoneNumber().equals(phoneNumber) && listOfUser.getPassword().equals(password)) {
                    return listOfUser;
                }
            }
        }
        return null;
    }

    public boolean checkPhoneNumber(String phoneNumber){
        int cnt=0;
        for(int i=0; i<phoneNumber.length(); i++){
            if(Character.isDigit(phoneNumber.charAt(i))){
                cnt++;
            }
        }
        return phoneNumber.length()==9&&cnt==9;
    }

    public int sendSMS(){
        return (int)((Math.random()*(9999-1000))+1000);
    }

}
