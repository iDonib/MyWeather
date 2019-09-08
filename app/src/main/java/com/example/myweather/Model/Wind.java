package com.example.myweather.Model;

public class Wind {
    private double speed;
    private double degree;

    public Wind(double speed, double degree) {
        this.speed = speed;
        this.degree = degree;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
