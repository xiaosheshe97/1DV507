package xz222az_assign1.ferry;

import java.util.ArrayList;


public abstract class Vehicle {
    protected double space;
    protected int fee;  //only car's fee
    protected ArrayList<Passenger> passengers = new ArrayList<Passenger>();  //the passengers it contain
    protected int numOfPassenger;


    public Vehicle() {
    }

    public double getSpace() {
        return space;
    }
    public void setSpace(double space) {
        this.space = space;
    }

    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }

    //get passenger from arrayList
    public ArrayList<Passenger> getPassenger(){
        return passengers;
    }


    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

}
