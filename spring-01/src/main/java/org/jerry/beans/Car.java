package org.jerry.beans;
/**
 * 汽车实体类测试构造注入
 * @author Jerry
 * @create 2019-09-05 15:59
 */
public class Car {
    private String carName;
    private Double carPrice;
    private String carProduce;
    private Integer maxSpeed;

    public Car(String carName, Double carPrice, String carProduce, Integer maxSpeed) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carProduce = carProduce;
        this.maxSpeed = maxSpeed;
    }

    public Car(String carName, Double carPrice, String carProduce) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carProduce = carProduce;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carProduce='" + carProduce + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
