package model;


import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Parking {
    int [][] matriz = new int[5][10];
    private int hourlyRate = 10000;

    private Car car;

    private int count = 0;
    private Map<String, LocalTime> arrayCars = new HashMap<>();
    private Map<String, List<Integer>> arrayCarsPosi = new HashMap<>();
    private List<Integer> valores = new ArrayList<>();



    //Constructor


    public Parking() {
    }

    //Getters and setters

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //Other methods

    public boolean parkingCar(Car car, int x, int y){
        boolean avilableParking = true;

        if (x > 4 || y > 9){
            avilableParking = false;
            System.out.println("Valores fuera de renago");
            return avilableParking;
        }

        if (count == 0) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = 0;
                }
            }
            setCount(1);
        }
        if (matriz[x][y] == 1) {
            System.out.println("Estacionamiento ocupado");
            avilableParking = false;
        } else {
            matriz[x][y] = 1;
            arrayCars.put(car.getPlaca(), LocalTime.now());
            valores.add(x);
            valores.add(y);
            arrayCarsPosi.put(car.getPlaca(), valores);
            System.out.println("Estacionamiento Exitoso");
        }


        return avilableParking;



    }

    public void payParking(Car car){
        Duration duration = Duration.between(arrayCars.get(car.getPlaca()), LocalTime.now());
        long minutes = duration.toMinutes() % 60;
        System.out.println("The quantity to pay is: "+ ((minutes  + 7) * hourlyRate));
        arrayCars.remove(car.getPlaca());


        List<Integer> list = arrayCarsPosi.get(car.getPlaca());
        int x = list.get(0);
        int y = list.get(1);
        matriz[x][y] = 0;

    }

    public void seeParking(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public void closeParking(){
        setCount(0);
    }
}
