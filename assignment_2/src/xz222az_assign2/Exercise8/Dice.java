package xz222az_assign2.Exercise8;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Dice {
    private int value;

    //dice initiate value
    public Dice(int value) {
        this.value = value;
    }

    public Dice() {
    }

    public int getValue() {
        return value;
    }

    public void roll(){
        Random rnd = new Random();
        value = rnd.nextInt(6) + 1;
    }



}
