package com.company;

public class Car implements AutoCloseable {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Car() {
    }

    @Override
    public void close() throws Exception {
        System.out.println("Машина жабылып жатат!!!");
    }

    public void drive() {
        System.out.println("Машина журуп жатат");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z-а-яА-Я]*")){
            this.name = name;}
        else {
            throw new InvalidNameException("Машинанын атында цифра болбойт!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new InvalidYearException("Машинанын жылы нольдон кичине боло албайт");
        }
    }
}