import model.Car;
import model.Parking;

public class Main {
    public static void main(String[] args){

        Car car1 = new Car("AA1", "ford", "2005");
        Car car2 = new Car("AA2", "kia", "2006");
        Car car3 = new Car("AA3", "toyota", "2007");

        Parking parking1 = new Parking();

        parking1.parkingCar(car1,2,0);
        parking1.parkingCar(car2,0,7);
        parking1.parkingCar(car2,0,7);

        parking1.seeParking();

        parking1.payParking(car1);

        parking1.seeParking();



    }
}
