package view;

import control.LoginControl;
import moldel.Account;

import java.util.Scanner;

public class LoginView {
    public static void doLogin(){
        String userName, passWord;
        Scanner sc = new Scanner(System.in);
        System.out.println("Display Login!!!");
        System.out.println("Enter Username: ");
        userName = sc.nextLine();
        System.out.println("Enter passWord: ");
        passWord = sc.nextLine();
        LoginControl.doLogin(userName, passWord);
    }
}
