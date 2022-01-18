package com.company;

public class CoolState implements AirConditionerStates {
    private AirConditioner airConditioner;

    public CoolState(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void on() {
        System.out.println("AIRCONDITIONER IS ON");
    }

    @Override
    public void off() {
        this.airConditioner.setCurrState(this.airConditioner.getOffState());
    }

    @Override
    public void cooling() {
        System.out.println("OPERATION-COOLING");
        //TODO check if need to change the temp
        this.fanning();
    }

    @Override
    public void heating() {
        System.out.println("THE AIRCONDITIONER IS IN COOL MODE - NO HEATING");
    }

    @Override
    public void fanning() {
        System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
    }

    @Override
    public void set_temp() {
        if (this.airConditioner.getR_temp() <= this.airConditioner.getC_temp() - 5) {
            this.airConditioner.setCurrState(this.airConditioner.getHeatState());
            this.airConditioner.getCurrState().set_temp();
        } else if (this.airConditioner.getR_temp() >= this.airConditioner.getC_temp() + 2) {
            this.cooling();
        }
    }

    @Override
    public void printState() {
        System.out.println("MODE-COOL");
    }
}
