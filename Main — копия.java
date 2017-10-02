package General;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.console();
        Carwheel Carwheel = new Carwheel();
        Carwheel.console();
        car car = new car();
        car.console();
    }

    public static class CarDoor {
        private boolean door;
        private boolean window;
        private boolean door1;

        public CarDoor() {
            this.door = false;
            this.window = false;
            this.door1 = false;
        }

        public void console() {
            System.out.println("Состояние двери: дверь - " + (door ? "открыта" : "закрыта"));
            System.out.println("Состояние окна: окно - " + (window ? "открыто" : "закрыта"));
            System.out.println("Что сделаем с дверью? " + (door1 ? "Откроем двери" : "Закроем двери"));
        }
    }

    public static class Carwheel {
        private boolean wheel;
        private boolean wheelnew;
        private boolean wheelster;

        public Carwheel() {
            this.wheel = false;
            this.wheelnew = false;
            this.wheelster = true;
        }

        public void console() {
            System.out.println("Состояние целостности шини-" + (wheel ? "Шина стерта до 0%" : "Шина не стерта до 0%"));
            System.out.println("Сменить шину? " + (wheelnew ? "шину не сменять" : "шина сменена"));
            System.out.println("Состояние шини-" + (wheelster ? "шина не стерта на 5%" : "шина стерта на 5%"));
        }
    }
    public static class car {
        public String date;
        public String engine;
        public int topSpeed;
        public int acceleration;
        public int passengerCapacity;
        public int numberPassengers;
        public int currentSpeed;
        public ArrayList<Main> wheels;
        public int[] doors;
        public void console () {
            System.out.println("дата производства - " + date);
            System.out.println("тип двигателя - " + engine);
            System.out.println("максимальная скорость машины - " + topSpeed);
            System.out.println("время разгона до 100км/ч - " + acceleration);
            System.out.println("пассажировместимость - " + passengerCapacity);
            System.out.println("кол-во пасажиров внутри в данный момент - " + numberPassengers);
            System.out.println("Текущая скорость-" + currentSpeed);
        }
    }
}

















