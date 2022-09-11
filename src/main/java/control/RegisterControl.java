package control;

import database.dao.AuthenticationDao;
import moldel.Account;
import service.AuthenticationService;

public class RegisterControl {
    public static void doRegister(String userName, String passWord, String email){
//        Account account = new Account();
        int account = AuthenticationService.register(userName, passWord, email);
        if(account != 0){
            System.out.println("Register successfully!");
        }
        else{
            System.out.println("Register failed!");
        }
    }
}
