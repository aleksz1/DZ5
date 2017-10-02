package Main;

import java.util.ArrayList;

public class car {
    public String date;
    public String engine;
    public int topSpeed;
    public int acceleration;
    public int passengerCapacity;
    public int numberPassengers;
    public int currentSpeed;
    public ArrayList<Integer> wheels;
    public int[] doors;

    public car(String date, String engine, int topSpeed, int acceleration, int passengerCapacity, int numberPassengers, int currentSpeed,int doors[]) {
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

    }
    public void setDate(String date){
        this.date="1.10.2017";
    }
    public void setEngine(String Engine){
        this.engine = "Electric";
    }
    public void setTopSpeed(int topSpeed){

        this.topSpeed = topSpeed;
    }
    public void setAcceleration(int acceleration){

        this.acceleration = acceleration;
    }

    public void setPassengerCapacity(int passengerCapacity ){

        this.passengerCapacity = passengerCapacity;
    }
    public void setNumberPassengers(int numberPassengers ){

        this.numberPassengers = (int) (Math.random() * 6);
    }
    public void setCurrentSpeed(int currentSpeed){

        this.currentSpeed = (int) (Math.random() * topSpeed);
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

        this.numberPassengers = 0;
    }
    public void numDoors(){

        int numD = doors[(int) (Math.random() * 6)];
    }
    public void RemoveWheels(){
        for (int i = 0; i < wheels.size(); i++){
            wheels.remove(i);
        }
    }
    public void plasWils(){
        for (int i = 0; i < (wheels.size() + (int) (Math.random() * 6)); i ++){
            wheels.add(i+1);
        }
        int sum = wheels.size();
    }

    }


