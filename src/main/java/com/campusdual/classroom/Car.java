package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Car {
    public Car() {}

    public String licensePlate;
    public String brand;
    public String model;
    public int wheelsAngle;
    public boolean reverse;
    public String gear;



    public int tachometer = 0;
    public int speedometer = 0;
    public int MAX_SPEED = 120;
    public int MAX_WHEELANGLE = 45;
    public int MIN_WHEELANGLE = -45;

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

    public int getAngleOfWheels() {
        return wheelsAngle;
    }

    public int getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(int speedometer) {
        this.speedometer = speedometer;
    }

    public void setAngleOfWheels(int angleOfWheels) {
        this.wheelsAngle = wheelsAngle;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public boolean isReverse(){
        return this.reverse=true;
    }

    //1º-->"Verify that it is possible to shift
    // to reverse gear when the car is stationary"
    //2º-->"Verify that it is not possible to
    // shift to reverse gear when the car is in motion"
    public void setReverse(boolean isreverse ){

        if(this.speedometer>0 && isreverse==true) {
            //this.gear="M";
            System.out.println("You cannot shift reverse while the car is in motion\nYou have to stop first...");
        }else if(isreverse==true && this.speedometer==0){
            System.out.println("El carro estaba estacionado... Inicia Reversa");
            this.gear="R";
            //System.out.println("Reverse: On\n"+"-Tachometer: "+this.tachometer+"RPM "+"- speedometer: "+this.speedometer);
            for(int i=0;i<(this.MAX_SPEED-80);i=i+10){
                this.speedometer=this.speedometer+10;
                this.tachometer=this.tachometer+30;
                System.out.println("Reverse: On\n"+"-Tachometer: "+this.tachometer+"RPM "+"- speedometer: "+this.speedometer);

            }
        }else{}
    }


    //Verify that when wheels angle
    // change, must be between -45º and 45º
    public void turnAngleOfWheels (int initialAngle) {
        int oldvalue= this.wheelsAngle;
        this.wheelsAngle=initialAngle;
        //this.wheelsAngle=Utils.integer("Write your chosen wheelangle: ");


        if(this.wheelsAngle>this.MAX_WHEELANGLE){


            this.wheelsAngle=45;
            System.out.println("Too high angle-->The current wheelangel: "+this.wheelsAngle+"º"+" The prevous wheelangle: "+oldvalue+"º");
        }else if (this.wheelsAngle<this.MIN_WHEELANGLE){

            this.wheelsAngle=-45;
            System.out.println("Too low angle-->The current wheelangel: "+this.wheelsAngle+"º"+" The prevous wheelangle: "+oldvalue+"º");
        }else{
            System.out.println("The current wheelangel: "+this.wheelsAngle+"º"+"\n The prevous wheelangle: "+oldvalue+"º");
        }


    }

    //funcion para frenar, debe mostrarque al velocidad baja despues de frenar
    public void brake(){
        if (this.speedometer>0){
            int initialSpeed = this.speedometer;
            int newSpeed = speedometer - 30;
            this.speedometer =speedometer - 30;
            if(this.speedometer<0){
                this.speedometer=0;
            }
            System.out.println("Haz frenado \n================"+"\ncurrent speed: "+newSpeed+" is lower than previous: "+initialSpeed);
        }
    }


    public void accelerate(){
        if(this.speedometer<this.MAX_SPEED && this.tachometer>0){
            this.speedometer = this.speedometer +10;
            this.gear = "M";
            System.out.println("Tu velocidad ahora es: "+this.speedometer+"Km/h");
        }
    }
    //funcion para acelerar
  /*  public void accelerate(){

        if (tachometer>0) {
            if (this.speedometer < MAX_SPEED) {
                for (int i = 0; i < MAX_SPEED; i = i + 10) {
                    this.speedometer = speedometer + 10;
                    this.tachometer = tachometer + 2;
                    int initialSpeed = this.speedometer - 10;
                    int currentSpeed = this.speedometer;
                    System.out.println("The current speed: " + currentSpeed + "Km/h" + " is greater than previous speed: " + initialSpeed + "Km/h");
                }
            } else if (this.speedometer == 120) {
                System.out.println("No puedes acelerar mas");
            }
        }

            //int initialSpeed = speedometer;
            //int newSpeed = this.speedometer ++;

            //System.out.println("current speed: "+newSpeed+" is greater than previous: "+initialSpeed);
        //}else if(newSped>){}

    }*/
    public String stop(){
        if (this.speedometer == 0){
            this.tachometer =0;

            System.out.println("Detenido");


        }else {
            System.out.println("Sigue en movimiento el coche... no puedes apagar el coche.");
        }
   return ""; }
    public void start(){
        if (this.tachometer == 0){
            this.tachometer = 100;
            this.gear="M";
            System.out.println("Turned On Car\n=============\nYour revolutions are: "+tachometer+"RPM");
        }else if(this.tachometer>0){
            System.out.println("Your car is already turned on");
        }
    }


    public void infoCar(){
        System.out.println("Tu coche es "+"Matricula: "+this.licensePlate+ "- Marca: "+this.brand +"- Modelo: "+ this.model+"- Tacometro: "+ this.tachometer+"RPM"+"- Speedometer: "+this.speedometer+"Km/h"+"- wheelAngle: "+this.wheelsAngle);
    }


}


