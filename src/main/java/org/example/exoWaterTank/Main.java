package org.example.exoWaterTank;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank(800,500,0);
        WaterTank waterTank1 = new WaterTank(1000,800,0);
        WaterTank waterTank2 = new WaterTank(500,300,0);


        waterTank.remplir();

        System.out.println(waterTank);

        WaterTank.volCiterne();

        waterTank1.remplir();
        waterTank1.vider();

        WaterTank.volCiterne();
    }
}
