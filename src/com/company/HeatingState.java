package com.company;

public class HeatingState implements AirConditionerStates {
    private AirConditioner airConditioner;
    public HeatingState(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void cooling() {

    }

    @Override
    public void heating() {

    }

    @Override
    public void fanning() {

    }
}
