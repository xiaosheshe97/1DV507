package xz222az_assign1.ferry;


public class Passenger {
    private int fee = 25; //only the passenger's fee
    private Vehicle vehicle; //which vehicle belong

    public Passenger() {
    }


    public Passenger(Vehicle vehicle) {
        this.vehicle = vehicle;
        setFee();
    }

    public int getFee(){
        return fee;
    }

    public void setFee(){
        if (vehicle instanceof Car){
            this.fee = 20;
        }
        if (vehicle instanceof Bus){
            this.fee = 15;
        }
        if (vehicle instanceof Lorry){
            this.fee = 20;
        }
        if (vehicle instanceof Bicycle){
            this.fee = 0;
        }
    }
}
