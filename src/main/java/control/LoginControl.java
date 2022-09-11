package control;

import database.dao.AuthenticationDao;
import moldel.Account;
import service.AuthenticationService;

import java.util.Scanner;

public class LoginControl {
    public static boolean doLogin( String userName, String passWord){
        Account account = new Account();
        boolean check = true;
        account = AuthenticationService.login(userName, passWord);
        if(account != null){
            System.out.println("Login successfully!");
            if(AuthenticationService.checkLogin(userName, passWord) == 1){
                System.out.println("Chao mung Admin.");
            } else if (AuthenticationService.checkLogin(userName, passWord) == 0) {
                System.out.println("Chao mung User.");
            }
        }
        else{
            System.out.println("Login failed! Username or Password not exactly!");
            check = false;
        }
        return check;
    }
}
