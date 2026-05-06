package com.yash.packages.basicEnum;

public class basic {
    enum TrafficLight {
        RED, YELLOW, GREEN;

        public void action() {
            switch (this) {
                case RED:
                    System.out.println("STOP");
                    break;
                case YELLOW:
                    System.out.println("READY");
                    break;
                case GREEN:
                    System.out.println("GO");
                    break;
            }
        }
    }
}
