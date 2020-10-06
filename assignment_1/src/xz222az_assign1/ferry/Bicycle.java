package xz222az_assign1.ferry;

import java.util.ArrayList;

public class Bicycle extends Vehicle {

    public Bicycle() {
    }

    public Bicycle(int num){
        if (num == 1){
            numOfPassenger = num;
            for (int i = 0; i < numOfPassenger; i++){
                this.passengers.add(new Passenger(this));
            }
        }
        else
            throw new RuntimeException("Car's passenger should be 1");
        this.space = 0.2;
        this.fee = 40; //only vehicle
    }
}
