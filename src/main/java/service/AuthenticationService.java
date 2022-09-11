package service;

import database.dao.AuthenticationDao;
import moldel.Account;

public class AuthenticationService {
    public static Account login(String userName, String passWord){
        Account account = new Account();
        account = AuthenticationDao.login(userName, passWord);
        return account;
    }
    public static int checkLogin(String userName, String passWord){
//        Account acc = new Account();
        int acc =AuthenticationDao.checkLogin(userName, passWord);
        return acc;
    }
}