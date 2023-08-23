package workShop2.model;

import java.time.LocalDate;
import java.util.Date;

public class Yacht extends Ship{

    private int cabinsQuan;

    //Constructor
    public Yacht(String name, int rate, int rateAdd, LocalDate yearProd, int length, Captain captain, int cabinsQuan) {
        super(name, rate, rateAdd, yearProd, length, captain);
        this.cabinsQuan = cabinsQuan;
    }

    //Getters And Setters

    public int getCabinsQuan() {
        return cabinsQuan;
    }

    public void setCabinsQuan(int cabinsQuan) {
        this.cabinsQuan = cabinsQuan;
    }

    //Other methods
    public void buyYacht(){
        if (this.cabinsQuan > 7){
            System.out.println("Yacht The yacht has been purchased for a value of "+ ((getRate() * 10) + 10000));
        }else {
            System.out.println("Yacht The yacht has been purchased for a value of "+ (getRate() * 10));
        }

    }
}
