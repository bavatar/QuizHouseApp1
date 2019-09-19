package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Floor {
    private int floorNo = 0;    // e.g., floor 0 (basement), floor 1
    private int noFloors = 0;   // number of floors
    private int noWindows = 0;  // number of windows per floor
    private int noDoors = 0;
    private String type = "";   // e.g., granite, linoleum
    private String finishing = "";  // smooth, rough
    private Window window;
    private Door door;
    ArrayList<Window> windows = new ArrayList<>();
    ArrayList<Door> doors = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFinishing() {
        return finishing;
    }

    public void setFinishing(String finishing) {
        this.finishing = finishing;
    }

    public Floor() {
        // methods to query for parameters for ea floor as it is creating them
        Scanner sc = new Scanner(System.in);
        System.out.println("How many floors do you want to add to your House?");
        noFloors = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<noFloors; i++){
            System.out.println("How many windows do you want to add to your House?");
            noWindows = sc.nextInt();
            sc.nextLine();
        }





    }
}
