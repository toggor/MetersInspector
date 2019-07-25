package com.example.metersinspector;

import java.util.ArrayList;

public class GasMeterResidential extends Device {   // a residential meter object to store the state of Inspected meter


    int creditAmount;
    int digitalTotaliser;

    // list to store mechanical damage that removes Warrancy
    ArrayList<String> mechanicalDamage = new ArrayList<>(10);   // Maybe Map is better, but we can add custom strings to list from the service engineer


    // list of meter functions to check
    boolean displayFuncOk;
    boolean infoButtonFuncOk;
    boolean roundButtonFuncOk;
    boolean mechanicalTotaliserFuncOk;
    boolean digitalTotaliserFuncOk;
    boolean totalisersEqual; // Maybe if not equal we show the difference
    boolean dateTimeOK;
    boolean valveOpened;


    //list of changeable parameters and their state
    boolean emcActive;
    int emcAmount;

    String customerCardReadingResult;       //reads fine, no reaction, returns 8, returns error: F011 or another
    String maintenanceCardReadingResult;    //reads fine, no reaction, returns 8, returns error: F011 or another
    String textOnDisplay;                  //OFF, F044, ALARM 1-5, or normal


    public String getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getDeviceType(){
        return this.deviceType;
    }

    public void setDeviceType(String deviceType){
        this.deviceType = deviceType;
    }

    public String getPipeConnection(){
        return this.pipeConnection;
    }

    public void setPipeConnection(String pipeConnection){
        this.pipeConnection = pipeConnection;
    }

    public int getTotaliser() {
        return this.totaliser;
    }

    public void setTotaliser(int totaliser){
        this.totaliser = totaliser;
    }



}
