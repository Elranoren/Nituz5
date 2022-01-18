package com.company;

public class AirConditioner {
    private AirConditionerStates coolState;
    private AirConditionerStates heatState;
//    private AirConditionerStates fanState;
    private AirConditionerStates offState;
//    private AirConditionerStates heatingState;
//    private AirConditionerStates coolingState;

    private AirConditionerStates currState;
    private AirConditionerStates currMode;

    public int c_temp;
    public int r_temp;


    public AirConditioner() {
        this.coolState = new CoolState(this);
        this.heatState = new HeatState(this);
//        this.fanState = new FannState(this);
        this.offState = new OffState(this);
//        this.heatingState = new HeatingState(this);
//        this.coolingState = new CoolingState(this);
        this.currState = this.offState;
//        this.currMode = null;
        System.out.println("OFF");
    }

    public void setC_temp(int temp) {
        if(this.currState != this.offState){
            System.out.println("set c_temp to " + temp);
            this.c_temp = temp;
        }
        this.currState.set_temp();

    }

    public void setR_temp(int temp) {
        if(this.currState != this.offState) {
            System.out.println("set r_temp to " + temp);
            this.r_temp = temp;
        }
        this.currState.set_temp();

    }

    public void on() {
        this.currState.on();
    }

    public void off() {
        this.currState.off();
    }

    public void heating() {
        this.currState.heating();
    }

    public void cooling() {
        this.currState.cooling();
    }

    public void fanning() {
        this.currState.fanning();
    }

    public AirConditionerStates getCurrState() {
        return currState;
    }

    public void setCurrState(AirConditionerStates currState) {
        currState.printState();
        this.currState = currState;
    }

    public AirConditionerStates getCoolState() {
        return coolState;
    }

    public AirConditionerStates getHeatState() {
        return heatState;
    }

//    public AirConditionerStates getFanState() {
//        return fanState;
//    }

    public AirConditionerStates getOffState() {
        return offState;
    }

//    public AirConditionerStates getHeatingState() {
//        return heatingState;
//    }

//    public AirConditionerStates getCoolingState() {
//        return coolingState;
//    }

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
