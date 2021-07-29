package com.jdlovin.Day3;

class UserAlreadyLoggedInException extends Exception{

}

class Authentication{
    private boolean isLoggedIn = false;

    public void login(String email, String password) throws UserAlreadyLoggedInException {
        if(!isLoggedIn){
            if(email.equals("admin") && password.equals("123")){
                isLoggedIn = true;
                System.out.println("Login success!");
            } else {
                System.out.println("Unable to login, please try again");
            }
        } else {
            throw new UserAlreadyLoggedInException();
        }
    }
}

public class Demo21 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        try{
            auth.login("admin","123");
        } catch (UserAlreadyLoggedInException e) {
            e.printStackTrace();
        }

        try {
            auth.login("admin", "69");
        } catch (UserAlreadyLoggedInException e) {
            System.out.println("Hey, you are already logged in ");
        }
    }
}
