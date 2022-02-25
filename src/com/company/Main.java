package com.company;

public class Main {

    public static void main(String[] args) throws Exception {


    try (Car car = new Car()) {
        car.drive();

    }

    }
}
