package com.campusdual.classroom;

public class Car {

    public String licensePlate;
    public String brand;
    public String model;


    public Car() {
    }
    public int tachometer = 0;
    public int speedometer = 0;
    public int MAX_SPEED = 120;

    public Car(String licensePlate, String brand, String model) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;




    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTachometer() {
        return tachometer;
    }

    public void setTachometer(int tachometer) {
        this.tachometer = tachometer;
    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer>0;
    }
    public boolean isTachometerEqualToZero(){
        return this.tachometer==0;
    }

    //funcion para frenar, debe mostrarque al velocidad baja despues de frenar
    public void brake(){
        if (this.speedometer>0){
            int initialSpeed = this.speedometer;
            int newSpeed = speedometer - 15;
            System.out.println("Haz frenado \n"+"current speed: "+newSpeed+" is lower than previous: "+initialSpeed);
        }
    }


    //funcion para acelerar
    public void accelerate(){

        if (tachometer>0){
            for (int i=0;i<MAX_SPEED;i=i+10) {
                this.speedometer= speedometer+10;
                this.tachometer = tachometer + 2;
                int initialSpeed = this.speedometer;
                int currentSpeed = this.speedometer-10;
                System.out.println("The current speed: "+currentSpeed+"Km/h"+" is greater than previous speed: "+initialSpeed+"Km/h");
            }
        }else if (this.speedometer==120){
            System.out.println("No puedes acelerar mas");
        }

            //int initialSpeed = speedometer;
            //int newSpeed = this.speedometer ++;

            //System.out.println("current speed: "+newSpeed+" is greater than previous: "+initialSpeed);
        //}else if(newSped>){}

    }
    public String stop(){
        if (this.speedometer == 0){

            System.out.println("Detenido");


        }else if (isTachometerGreaterThanZero()){
            isTachometerEqualToZero();
            this.tachometer =0;
            System.out.println("Sigue encendido... apagado");
        }
   return ""; }
    public void start(){
        if (this.tachometer == 0){
            this.tachometer = 100;
            System.out.println("Turned On Car\n=============\nYour revolutions are: "+tachometer+"RPM");
        }else if(this.tachometer>0){
            System.out.println("Your car is already turned on");
        }
    }

    public void infoCar(){
        System.out.println("Tu coche es "+"Matricula: "+this.licensePlate+ "- Marca: "+this.brand +"- Modelo: "+ this.model+"- Tacometro: "+ this.tachometer+"RPM"+"- Sppedometer: "+this.speedometer+"Km/h" );
    }


}


