package xz222az_assign1.ferry;

import java.util.ArrayList;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(int num){
        if (num > 0 && num <= 4){
            numOfPassenger = num;
            for (int i = 0; i < numOfPassenger; i++){
                this.passengers.add(new Passenger(this));
            }
        }
        else
            throw new RuntimeException("Car's passenger should between 1-4");
        this.space = 1;
        this.fee = 100;
    }

}
