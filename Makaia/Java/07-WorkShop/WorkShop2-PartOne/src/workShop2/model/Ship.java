package workShop2.model;

import workShop2.dao.IShip;

import java.time.LocalDate;


public class Ship implements IShip {
    private String name;
    private int rate;
    private int rateAdd;
    private LocalDate yearProd;
    private int length;

    private Captain captain;


    //Constructor

    public Ship(String name, int rate, int rateAdd, LocalDate yearProd, int length, Captain captain) {
        this.name = name;
        this.rate = rate;
        this.rateAdd = rateAdd;
        this.yearProd = yearProd;
        this.length = length;
        this.captain = captain;
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRateAdd() {
        return rateAdd;
    }

    public void setRateAdd(int rateAdd) {
        this.rateAdd = rateAdd;
    }

    public LocalDate getYearProd() {
        return yearProd;
    }

    public void setYearProd(LocalDate yearProd) {
        this.yearProd = yearProd;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    @Override
    public void calculateRent() {
        int rateTotal  = this.rate + this.rateAdd;
        // We get the year of production
        int year = this.yearProd.getYear();
        //we validate if greater than 2020
        System.out.println("The boat rental costs is that " + (year>=2020? rateTotal+=20000 : rateTotal));
    }
}
