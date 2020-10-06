package xz222az_assign1.ferry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FerryMain {
    public static void main(String[] args) {
        FerryImp ferry = new FerryImp();
        Car c1 = new Car(3);
        Bus bu1 = new Bus(10);
        Lorry l1 = new Lorry(1);
        Bicycle b1 = new Bicycle(1);
        Passenger p1 = new Passenger();
        ferry.embark(c1);
        ferry.embark(l1);
        ferry.embark(b1);
        ferry.embark(p1);
        ferry.embark(bu1);

        System.out.println("The total money is " + ferry.countMoney());

        System.out.println("All vehicle: ");
        //print all vehicle that embarked
        printAllVehicle(ferry.getAllVehicles());

        System.out.println("================");

        System.out.println("Disembark" );
        ferry.disembark();
        System.out.println("Now the all vehicle: ");
        printAllVehicle(ferry.getAllVehicles());

        Car c2 = new Car(4);
        Bus bu2 = new Bus(20);
        Lorry l2 = new Lorry(2);
        Bicycle b2 = new Bicycle(1);
        Passenger p2 = new Passenger();
        System.out.println("embark");

        ferry.embark(c2);
        ferry.embark(l2);
        ferry.embark(b2);
        ferry.embark(p2);
        ferry.embark(bu2);

        System.out.println("The total money is " + ferry.countMoney());
        System.out.println("All vehicle: ");
        //print all vehicle that embarked
        printAllVehicle(ferry.getAllVehicles());

    }

    public static void printAllVehicle(Vehicle[] v){
        try{
            for (int i = 0; i < v.length ; i++){
                System.out.println(v[i]);
            }
        }catch (RuntimeException e){
            System.out.println("null");
        }

    }

}
