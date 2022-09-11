package view;

import service.AuthenticationService;

import java.util.Scanner;

public class RegisterView {
    public static void doRegister(){
        String userName, passWord, email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userName:");
        userName = sc.nextLine();
        System.out.println("Enter passWord: ");
        passWord = sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
        AuthenticationService.register(userName, passWord, email);
    }
}
