package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseApp {

    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many houses do you want to add to your House Database?");
        int noHouses = sc.nextInt();

        for (int i = 0; i < noHouses; i++){
            House house = new House();  // House constructor creates floors
        }

        // How many Houses do you want to add to your DB


        House presentHome = new House(2, 10, 3, 2000, 30000);
        presentHome.setSalesPrice(35000);
        System.out.println("My present home has " + presentHome.toString());
        houses.add(presentHome);

        House futureHome = new House();
        futureHome.setDoors(50);
        futureHome.setFloors(27);
        futureHome.setSalesPrice(2000000000);
        futureHome.setSqFt(400000);
        futureHome.setWindows(100);
        System.out.println("My future home has " + futureHome.toString());

    }
}
