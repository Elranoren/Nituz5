//package com.company;
//
//public class CoolingState implements AirConditionerStates {
//    private AirConditioner airConditioner;
//    public CoolingState(AirConditioner airConditioner) {
//        this.airConditioner = airConditioner;
//    }
//
//    @Override
//    public void on() {
//        System.out.println("AIRCONDITIONER ALREADY ON");
//    }
//
//    @Override
//    public void off() {
//        System.out.println("OFF");
//        airConditioner.setCurrState(airConditioner.getOffState());
//        airConditioner.setCurrMode(null);
//    }
//
//    @Override
//    public void cooling() {
//
//    }
//
//    @Override
//    public void heating() {
//
//    }
//
//    @Override
//    public void fanning() {
//
//    }
//}
