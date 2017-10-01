package Carwheel;

import Cardoor.Carwheel;

import java.util.ArrayList;

 class car {
    public String date;
    public String engine;
    public int topSpeed;
    public int acceleration;
    public int passengerCapacity;
    public int numberPassengers;
    public int currentSpeed;
    public ArrayList<Integer> wheels;
    public int[] doors;

    public car(String date, String engine, int topSpeed, int acceleration, int passengerCapacity, int numberPassengers, int currentSpeed) {
        this.date = date;
        this.engine = engine;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.passengerCapacity = passengerCapacity;
        this.numberPassengers = numberPassengers;
        this.currentSpeed = currentSpeed;
        this.wheels = wheels;
        this.doors = doors;
    }

    public car() {
        date = "1.10.2017";
    }
    public void setEngine(){

        engine = "Electric";
    }
    public void setTopSpeed(){

        topSpeed = 240;
    }
    public void setAcceleration(){

        acceleration = 8;
    }

    public void setPassengerCapacity(){

        passengerCapacity = 5;
    }
    public void setNumberPassengers(){

        numberPassengers = (int) (Math.random() * 6);
    }
    public void setCurrentSpeed(){

        currentSpeed = (int) (Math.random() * topSpeed);
    }
    public void setWheels(){
        wheels = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            wheels.add(i+1);
        }
    }
    public void setDoors() {
        doors = new int[5];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = i + 1;
        }
    }
    public void plusPassenger(){
        numberPassengers ++;
    }
    public void minusPassenger() {
        if (numberPassengers > 0) {
            numberPassengers--;
        }
    }
    public void ollPassenger(){

        numberPassengers = 0;
    }
    public void numDoors(){

        int numD = doors[(int) (Math.random() * 6)];
    }
    private void RemoveWheels(){
        for (int i = 0; i < wheels.size(); i++){
            wheels.remove(i);
        }
    }
    private void plasWils(){
        for (int i = 0; i < (wheels.size() + (int) (Math.random() * 6)); i ++){
            wheels.add(i+1);
        }
        int sum = wheels.size();
    }

    }


