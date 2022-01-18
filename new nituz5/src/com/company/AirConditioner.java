package com.company;

public class AirConditioner {
    private double C_Temp;
    private double R_Temp;
    private boolean airIsON;

    public AirConditioner() {
        System.out.println("OFF");
        this.airIsON = false;
    }

    public void on() {

        if(!airIsON){
            this.R_Temp = 25;
            this.C_Temp = 25;
            System.out.println("WAITING 30 SECONDS");
            System.out.println("ON");
            this.airIsON = true;
            System.out.println("MODE-COOL");
            System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
        }
        else
            System.out.println("AIRCONDITIONER ALREADY ON");
    }

    public void setC_temp(double i) {
    }

    public void setR_temp(double i) {
        System.out.println("set r_temp to " + i);
        if(R_Temp>=C_Temp+5)
            System.out.println("MODE COOL");
        if(R_Temp>=C_Temp+2)
            System.out.println("OPERATION-COOLING");
        if(R_Temp<=C_Temp-5)
            System.out.println("MODE HEAT");
        if(R_Temp<=C_Temp-2)
            System.out.println("OPERATION-HEATING");

    }

    public void off() {
    }
}
