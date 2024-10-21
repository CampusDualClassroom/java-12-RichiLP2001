package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
    Car mycar = new Car("ABC123","ford","GT");
        mycar.isTachometerEqualToZero();
    //un metodo booleano que verifica si el tacometro es cero
       // mycar.turnAngleOfWheels();
       // mycar.infoCar();
        mycar.start();
        mycar.accelerate();
        mycar.accelerate();

        mycar.infoCar();
        mycar.brake();
        mycar.infoCar();
       // mycar.turnAngleOfWheels();
       // mycar.infoCar();
        mycar.turnAngleOfWheels(20);
        mycar.infoCar();
        mycar.setReverse(true);
        mycar.stop();
        mycar.setReverse(true);
        mycar.stop();



        // mycar.isStoped();

    }

}