package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
//        ac.on();
//        ac.setC_temp(27);
//        ac.setR_temp(33);
//        ac.off();
        String input = "";
        while (!input.equals("5")) {
            System.out.println("-----Main Menu-----");
            System.out.println("1) On");
            System.out.println("2) Off");
            System.out.println("3) Set Room Temp");
            System.out.println("4) Set Chosen Temp");
            System.out.println("5) Exit");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    ac.on();
                    break;
                case "2":
                    ac.off();
                    break;
                case "3":
                    System.out.println("Please choose new room temp");
                    String r_temp = sc.nextLine();
                    int roomTemp;
                    try {
                        roomTemp = Integer.parseInt(r_temp);
                    } catch (Exception e) {
                        System.out.println("This is not an int");
                        break;
                    }
                    ac.setR_temp(roomTemp);
                    break;
                case "4":
                    System.out.println("Please choose new chosen temp");
                    String c_temp = sc.nextLine();
                    int chosenTemp;
                    try {
                        chosenTemp = Integer.parseInt(c_temp);
                    } catch (Exception e) {
                        System.out.println("This is not an int");
                        break;
                    }
                    if (chosenTemp > 35 || chosenTemp < 10) {
                        System.out.println("This temp is not in the AirConditioner temp range");
                        break;
                    }
                    ac.setC_temp(chosenTemp);
                    break;
                default:
                    System.out.println("Not a valid number please enter number between 1 and 5 inclusive.");
            }
        }
        System.out.println("Bye Bye");
    }

}
