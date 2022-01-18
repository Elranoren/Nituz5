package com.company;

public class HeatState implements AirConditionerStates {
    private AirConditioner airConditioner;

    public HeatState(AirConditioner airConditioner) {
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
        System.out.println("THE AIRCONDITIONER IS IN HEAT MODE - NO COOLING");
    }

    @Override
    public void heating() {
        System.out.println("OPERATION-HEATING");
        //TODO check if need to change the temp
        this.fanning();
    }

    @Override
    public void fanning() {
        System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
    }

    @Override
    public void set_temp() {
        if (this.airConditioner.getR_temp() >= this.airConditioner.getC_temp() + 5) {
            this.airConditioner.setCurrState(this.airConditioner.getCoolState());
            this.airConditioner.getCurrState().set_temp();
        } else if (this.airConditioner.getR_temp() <= this.airConditioner.getC_temp() - 2) {
            this.heating();
        }
    }

    @Override
    public void printState() {
        System.out.println("MODE-HEAT");
    }
}
