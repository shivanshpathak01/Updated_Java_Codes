package OOPS.Interfaces;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("I am a Brake");
    }

    @Override
    public void start() {
        System.out.println("I start like a car");
    }

    @Override
    public void Stop() {
        System.out.println("I stop like a car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a car");
    }
}
