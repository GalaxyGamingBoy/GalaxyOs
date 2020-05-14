package com.Galaxy;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class OS {
    public static void OS(){
        int Loop = 1;
        while(Loop == 1){
            System.out.println("Please enter action: ");
            System.out.println("Type brw for available commands.");
            Scanner actScan = new Scanner(System.in);
            String act = actScan.nextLine();
            if(act.equals("brw")){
                System.out.println("exit");
                System.out.println("type");
            }else if(act.equals("exit")){
                Loop = 2;
                exit(1);
            }else{
                System.out.println("Invalid command");
            }
        }
    }
}
