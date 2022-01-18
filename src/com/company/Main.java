package com.company;

public class Main {

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        ac.on();
        ac.setC_temp(27);
        ac.setR_temp(33);
        ac.off();
    }

}
