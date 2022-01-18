package com.company;

public class AirConditioner {
    private AirConditionerStates coolState;
    private AirConditionerStates heatState;
    private AirConditionerStates fanState;
    private AirConditionerStates offState;
    private AirConditionerStates heatingState;
    private AirConditionerStates coolingState;

    private AirConditionerStates currState;
    private AirConditionerStates currMode;

    public double c_temp;
    public double r_temp;



    public AirConditioner() {
        this.coolState = new CoolState(this);
        this.heatState = new HeatState(this);
        this.fanState = new FannState(this);
        this.offState = new OffState(this);
        this.heatingState = new HeatingState(this);
        this.coolingState = new CoolingState(this);
        this.currState = this.offState;
        this.currMode = null;
        System.out.println("OFF");
    }

    public void setC_temp(double temp){
        this.c_temp = temp;
    }

    public void setR_temp(double temp){
        this.r_temp = temp;
    }

    public void on(){
        this.c_temp = 25;
        this.r_temp = 25;
        this.currState = this.fanState;
        //System.out.println("WAITING 30 SECONDS");
        //System.out.println("ON");
        this.currState = this.coolState;
        //System.out.println("MODE-COOL");
        //System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");


    }

    public void off(){

    }

    public void heating(){

    }

    public void cooling(){

    }

    public void fanning(){

    }

    public AirConditionerStates getCurrState() {
        return currState;
    }

    public void setCurrState(AirConditionerStates currState) {
        this.currState = currState;
    }

    public AirConditionerStates getCoolState() {
        return coolState;
    }

    public AirConditionerStates getHeatState() {
        return heatState;
    }

    public AirConditionerStates getFanState() {
        return fanState;
    }

    public AirConditionerStates getOffState() {
        return offState;
    }

    public AirConditionerStates getHeatingState() {
        return heatingState;
    }

    public AirConditionerStates getCoolingState() {
        return coolingState;
    }

    public AirConditionerStates getCurrMode() {
        return currMode;
    }

    public void setCurrMode(AirConditionerStates currMode) {
        this.currMode = currMode;
    }

    public double getC_temp() {
        return c_temp;
    }

    public double getR_temp() {
        return r_temp;
    }
}
