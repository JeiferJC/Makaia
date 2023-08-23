package workShop2.model;

import java.time.LocalDate;

public class Sailboat extends Ship {
    private int mastsQuan;

    //Constructor

    public Sailboat(String name, int rate, int rateAdd, LocalDate yearProd, int length, Captain captain, int mastsQuan) {
        super(name, rate, rateAdd, yearProd, length, captain);
        this.mastsQuan = mastsQuan;
    }

    //GettersAndSetters

    public int getMastsQuan() {
        return mastsQuan;
    }

    public void setMastsQuan(int mastsQuan) {
        this.mastsQuan = mastsQuan;
    }

    //Other methods
    public void isBig(){
            System.out.println("is a Sailboat big?: "+ (this.mastsQuan > 4?true:false ));
    }
}
