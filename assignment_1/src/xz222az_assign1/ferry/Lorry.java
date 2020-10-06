package xz222az_assign1.ferry;

import java.util.ArrayList;

public class Lorry extends Vehicle {

    public Lorry() {
    }

    public Lorry(int num){
        if (num > 0 && num <= 2){
            numOfPassenger = num;
            for (int i = 0; i < numOfPassenger; i++){
                this.passengers.add(new Passenger(this));
            }
        }
        else
            throw new RuntimeException("Lorry's passenger should between 1-2");
        this.space = 8;
        this.fee = 300; //only vehicle
    }
}
