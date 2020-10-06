package xz222az_assign1.ferry;

import java.util.ArrayList;

public class FerryImp implements Ferry{
    private final double SPACE = 40; //1 is bicycle
    private final int ROOM = 200;
    private int currentRoom = 0;
    private double currentSpace = 0;
    private int totalMoney = 0;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    @Override
    public int countPassengers() {
        return currentRoom;
    }

    @Override
    public int countVehicleSpace() {
        return (int)Math.round(this.currentSpace);
    }

    @Override
    public int countMoney() {
        for (Vehicle v : vehicles){
            totalMoney += v.fee;
        }
        for (Passenger p : passengers){
            totalMoney += p.getFee();
        }
        return totalMoney;
    }


    @Override
    public Vehicle[] getAllVehicles() {
        Vehicle[] vehicleArray = new Vehicle[vehicles.size()];
        if (currentSpace == 0){
            vehicleArray = null;
            return vehicleArray;
        }
        else {
            for (int i = 0; i < vehicles.size(); i ++){
                vehicleArray[i] = vehicles.get(i);
            }
            return vehicleArray;
        }
    }

    public void embark(Vehicle v) throws RuntimeException {
        //check is already embarked
        if (vehicles.contains(v)) {
            throw new RuntimeException("The vehicle cannot be embarked twice.");
        }
        else {
            //check is there any place for vehicle
            if (hasSpaceFor(v)) {
                //check is there any place for passenger in this vehicle
                if (v.numOfPassenger < ROOM - currentRoom) {
                    currentSpace += v.space;
                    this.vehicles.add(v);
                    currentRoom += v.numOfPassenger;
                    this.passengers.addAll(v.getPassenger());
                } else {
                    throw new RuntimeException("There is space for vehicle but no room for passenger");
                }
            }
            else {
                throw new RuntimeException("There is no space for vehicle");
            }
        }
    }

    @Override
    //those without vehicle
    public void embark(Passenger p) throws RuntimeException{
        if (hasRoomFor(p)){
            //passenger without vehicle always add by 1
            currentRoom += 1;
            this.passengers.add(p);
        }
        else{
            throw new RuntimeException("There is no room for passenger");
        }
    }

    @Override
    public void disembark() {
        vehicles.clear();
        passengers.clear();
        currentRoom = 0;
        currentSpace = 0;
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        if (currentSpace < SPACE){
            return true;
        }
        else return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {
        if (currentRoom < ROOM){
            return true;
        }
        else
        return false;
    }
}
