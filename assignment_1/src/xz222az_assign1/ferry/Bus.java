package xz222az_assign1.ferry;

import java.util.ArrayList;

public class Bus extends Vehicle {

    public Bus() {
    }

    public Bus(int num){
        if (num > 0 && num <= 20){
            numOfPassenger = num;
            for (int i = 0; i < numOfPassenger; i++){
                this.passengers.add(new Passenger(this));
            }
        }
        else
            throw new RuntimeException("Bus's passenger should between 1-20");
        this.space = 4;
        this.fee = 200; //only vehicle
    }
}
