package com.company;

public class Main {

    public static void main(String[] args) throws RuntimeException {
        try {
            Car car = new Car();
            car.drive();
            car.setName("Mersedes");
            car.setYear(2020);
            System.out.println("Машинанын аты: "+car.getName()+", "+car.getName()+" жылы: "+car.getYear());
            car.close();
        } catch (InvalidNameException | InvalidYearException  n) {
            System.err.println(n.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Бутту, зерикпей окуп чыканыныз учун рахмат");
        }



    }
}
