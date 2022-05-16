package fr.m2i;

public class Car extends Vehicle {

    public Car() {
        this.currentGas = 50;
        this.gasCapacity = 50f;
        this.gasConsumption = 7f;
        this.speed = 0;
        this.passengerCapacity = 5;
    }

    public Car(float gasCapacity, int passengerCapacity) {
        super(gasCapacity, passengerCapacity);
        this.currentGas = gasCapacity;
        this.gasConsumption = 7f;
        this.speed = 0;
    }

    @Override
    public void accelerate() {
        speed += 20;

        if (speed >= 220) {
            speed = 220;
        }
    }

    @Override
    public void brake() {
        speed -= 20;

        if (speed <= 0) {
            speed = 0;
        }
    }
}
