package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class House {
    // Make these classes w/attributes
//    private int floors; // floors could have types, finishing
//    private int windows; // windows could have different treatment types
//    private int doors; // doors could have different shapes, color, etc

    private Floor floor;
//    private Window window;
//    private Door door;

    ArrayList<Floor> floors = new ArrayList<>();

    // arrayList for floors
    // limit of floors upon init
    // Make a collection of houses => save into ArrayList

    private int sqFt;
    private double salesPrice;

    public House(){
        // How many floors do you want


        // go through loop to add each floor => query user for parameters
        // How

    }

    public House(int floors){
        this.floors = floors;
    }

    public House(int floors, int windows, int doors, int sqFt, double salesPrice) {
        this.floors = floors;
        this.windows = windows;
        this.doors = doors;
        this.sqFt = sqFt;
        this.salesPrice = salesPrice;
    }

    public void setFloors(int floors){

        this.floors = floors;
    }

    public int getFloors(){

        return floors;
    }

    public int getWindows() {

        return windows;
    }

    public void setWindows(int windows) {

        this.windows = windows;
    }

    public int getDoors() {

        return doors;
    }

    public void setDoors(int doors) {

        this.doors = doors;
    }

    public int getSqFt() {

        return sqFt;
    }

    public void setSqFt(int sqFt) {

        this.sqFt = sqFt;
    }

    public String getSalesPrice() {
        DecimalFormat df2 = new DecimalFormat("#.00");
        return df2.format(salesPrice);
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString(){
        return getFloors() + " floors " +
                getWindows() + " windows " +
                getDoors() + " doors. It is " +
                getSqFt() + " sq ft and worth $" +
                getSalesPrice();
    }

    // method to add floor or room etc
    public void addFloor() {
        // How many floors would you like to create

        Floor floor = new Floor();  // have queries in constructor
        floors.add(floor);
    }
}
