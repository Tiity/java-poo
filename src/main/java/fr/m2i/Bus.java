package fr.m2i;

public class Bus extends Vehicle {

    public Bus() {
        this.currentGas = 250;
        this.gasCapacity = 250f;
        this.gasConsumption = 50f;
        this.speed = 0;
        this.passengerCapacity = 42;
    }

    public Bus(float gasCapacity, int passengerCapacity) {
        super(gasCapacity, passengerCapacity);
        this.currentGas = gasCapacity;
        this.gasConsumption = 50f;
        this.speed = 0;
    }

    @Override
    public void accelerate() {
        speed += 10;

        if (speed >= 110) {
            speed = 110;
        }
    }

    @Override
    public void brake() {
        speed -= 10;

        if (speed <= 0) {
            speed = 0;
        }
    }
}
