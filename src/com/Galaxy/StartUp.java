package com.Galaxy;

import java.util.Scanner;

public class StartUp {
    public static void SU(){
        String PassA = "admin";
        String UsernameA = "admin";
        UNLogin(PassA , UsernameA);
    }
    public static void UNLogin(String PassA , String UnA){
        int Loop = 1;
        while (Loop == 1){
            System.out.println("Enter username: ");
            Scanner UNScan = new Scanner(System.in);
            String UnI = UNScan.nextLine();
            if(UnA.equals(UnI)){
                System.out.println("Username correct");
                PSLogin(PassA);
                Loop = 2;
            }else{
                System.out.println("Username incorrect");
            }
        }
    }
    public static void PSLogin(String PassA){
        int Loop = 1;
        while (Loop == 1) {
            System.out.println("Enter password: ");
            Scanner PW = new Scanner(System.in);
            String PWI = PW.nextLine();
            if(PassA.equals(PWI)){
                System.out.println("Password correct");
                OS.OS();
                Loop = 2;
            }else   {
                System.out.println("Password incorrect");
            }
        }
    }
}
