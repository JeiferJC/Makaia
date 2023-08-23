package workShop2.model;

public class Captain extends Human {

    private String id;
    private String licensePlate;

    //constructor
    public Captain(String name, String surname, int age, String id, String licensePlate) {
        super(name, surname, age);
        this.id = id;
        this.licensePlate = licensePlate;
    }

    //getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


}
