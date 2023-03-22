package SpringRestRepo;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String serialNumber;

    /**
     * This variable at the moment is of type String because I am trying to understand
     * how to pass to HAL Browser a price as 20.000 (20 thousand)
     * If I use double it does not take 20000,00 nor 20.000
     * nor (understandable) "20.000" between double quotes...
     * * It throws always an error...
     */
    private double currentPrice;

    public Car(){}

    public Car(String modelName, String serialNumber, double currentPrice) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
