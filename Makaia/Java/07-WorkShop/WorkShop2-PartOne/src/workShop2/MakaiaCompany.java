package workShop2;

import workShop2.model.Captain;
import workShop2.model.Human;
import workShop2.model.Sailboat;
import workShop2.model.Yacht;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class MakaiaCompany {
    public static void main(String[] args){

        //We create a captain
        Captain capitan1 = new Captain("Carlos", "Rojas", 23, "01", "KK05");
        //We create a sailboat
        Sailboat sailboat1 = new Sailboat("Nathaly", 1200000, 350000, LocalDate.of(2022, 7, 20),
                35, capitan1, 5);
        //we create a yacht
        Yacht yacht1 = new Yacht("Infinity", 2000000, 500000, LocalDate.of(2018, 01, 15),
                32, capitan1, 10);
        //good, now we calculate to rate of sailboat
        sailboat1.calculateRent();
        // now we calculate to rate of yacht
        yacht1.calculateRent();
        //Excecute the method call it "isBig" for sailboat1
        sailboat1.isBig();
        //Excecute the method call it "buyYacht" for yacht1
        yacht1.buyYacht();





    }
}
