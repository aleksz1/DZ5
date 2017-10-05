package General;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.console();
        Carwheel Carwheel = new Carwheel();
        Carwheel.console();
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
}



















