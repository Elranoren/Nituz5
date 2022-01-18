package com.company;

public class OffState implements AirConditionerStates {
    private AirConditioner airConditioner;

    public OffState(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;

    }

    @Override
    public void on() {
        airConditioner.c_temp = 25;
        airConditioner.r_temp = 25;
        System.out.println("WAITING 30 SECONDS");
        System.out.println("ON");
//        airConditioner.setCurrMode(airConditioner.getCoolState());
        airConditioner.setCurrState(airConditioner.getCoolState());
        airConditioner.getCurrState().fanning();
    }

    @Override
    public void off() {
        System.out.println("AIRCONDITIONER ALREADY OFF");
    }

    @Override
    public void cooling() {
        System.out.println("AIRCONDITIONER IS OFF");
    }

    @Override
    public void heating() {
        System.out.println("AIRCONDITIONER IS OFF");
    }

    @Override
    public void fanning() {
        System.out.println("AIRCONDITIONER IS OFF");
    }

    @Override
    public void set_temp() {
        System.out.println("AIRCONDITIONER IS OFF");
    }

    @Override
    public void printState() {
        System.out.println("OFF");
    }
}
