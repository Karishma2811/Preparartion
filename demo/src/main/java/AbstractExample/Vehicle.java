package AbstractExample;

public abstract class Vehicle {
    abstract void start();
    abstract void stop();
    abstract void changeGear();
    abstract void reverse();
    void drive(String str){
        System.out.println("diving the car"+ str);
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Starting the car");
    }
    void stop(){
        System.out.println("Starting the car");
    }
    void changeGear(){
        System.out.println("Starting the car");
    }
    void reverse(){
        System.out.println("Starting the car");
    }
    public static void main(String args[]){
Car car=new Car();
car.drive("MErcedez Benz");
car.start();
car.stop();
    }
        }
