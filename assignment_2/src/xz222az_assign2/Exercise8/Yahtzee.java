package xz222az_assign2.Exercise8;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import xz222az_assign2.Exercise8.Dice;

import java.util.Arrays;

public class Yahtzee extends Application {
    private int roll = 0;
    //total five dices
    private Dice dice1 = new Dice(1);
    private Dice dice2 = new Dice(2);
    private Dice dice3 = new Dice(3);
    private Dice dice4 = new Dice(4);
    private Dice dice5 = new Dice(5);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Image[] images = {new Image("1.png"),new Image("2.png"),new Image("3.png"),new Image("4.png"),
                new Image("5.png"), new Image("6.png")};

        Label information = new Label();
        information.setText("You have 3 rolls left.");

        ImageView d1 = new ImageView(images[0]);
        d1.setFitHeight(100);
        d1.setFitWidth(100);
        ImageView d2 = new ImageView(images[1]);
        d2.setFitHeight(100);
        d2.setFitWidth(100);
        ImageView d3 = new ImageView(images[2]);
        d3.setFitHeight(100);
        d3.setFitWidth(100);
        ImageView d4 = new ImageView(images[3]);
        d4.setFitHeight(100);
        d4.setFitWidth(100);
        ImageView d5 = new ImageView(images[4]);
        d5.setFitHeight(100);
        d5.setFitWidth(100);

        //set five check box and make them cannot be chose
        CheckBox c1 = new CheckBox();
        c1.setDisable(true);
        CheckBox c2 = new CheckBox();
        c2.setDisable(true);
        CheckBox c3 = new CheckBox();
        c3.setDisable(true);
        CheckBox c4 = new CheckBox();
        c4.setDisable(true);
        CheckBox c5 = new CheckBox();
        c5.setDisable(true);

        Button b = new Button("Roll the Dice");
        b.setOnAction(event -> {
            //first roll
            if (roll == 0){
                //set check box
                c1.setDisable(false);
                c2.setDisable(false);
                c3.setDisable(false);
                c4.setDisable(false);
                c5.setDisable(false);

                //roll dice
                dice1.roll();
                dice2.roll();
                dice3.roll();
                dice4.roll();
                dice5.roll();

                //chang image depending on value
                d1.setImage(images[dice1.getValue()-1]);
                d2.setImage(images[dice2.getValue()-1]);
                d3.setImage(images[dice3.getValue()-1]);
                d4.setImage(images[dice4.getValue()-1]);
                d5.setImage(images[dice5.getValue()-1]);
                roll ++;
                information.setText("You have " + (3-roll) + " left only");
                b.setText("Roll the Dice");


            }
            //2nd and 3rd round
            else if (roll < 3){
                if (c1.isSelected()){
                    dice1.roll();
                    d1.setImage(images[dice1.getValue()-1]);
                }
                if (c2.isSelected()){
                    dice2.roll();
                    d2.setImage(images[dice2.getValue()-1]);
                }if (c3.isSelected()){
                    dice3.roll();
                    d3.setImage(images[dice3.getValue()-1]);
                }if (c4.isSelected()){
                    dice4.roll();
                    d4.setImage(images[dice4.getValue()-1]);
                }
                if (c5.isSelected()){
                    dice5.roll();
                    d5.setImage(images[dice5.getValue()-1]);
                }
                roll++;
                information.setText("You have " + (3-roll) + " left only");
            }
            if (roll == 3){
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
                c5.setDisable(true);
                information.setText(result());

                //restart the game
                roll = 0;
                b.setText("Restart");
            }

        });

        Text head = new Text(0,0,"Yahtzee");
        head.setFont(new Font(30));

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5,5,5,5));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(head,0,0,2,1);
        pane.add(d1,0,1);
        pane.add(d2,1,1);
        pane.add(d3,2,1);
        pane.add(d4,3,1);
        pane.add(d5,4,1);
        pane.add(c1,0,2);
        pane.add(c2,1,2);
        pane.add(c3,2,2);
        pane.add(c4,3,2);
        pane.add(c5,4,2);
        GridPane.setHalignment(c1, HPos.CENTER);
        GridPane.setHalignment(c2, HPos.CENTER);
        GridPane.setHalignment(c3, HPos.CENTER);
        GridPane.setHalignment(c4, HPos.CENTER);
        GridPane.setHalignment(c5, HPos.CENTER);
        pane.add(b,0,3,3,1);
        pane.add(information,1,3,3,1);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Yahtzee");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String result() {
        int[] number = {dice1.getValue(),dice2.getValue(),dice3.getValue(),dice4.getValue(),dice5.getValue()};

        boolean threeOfAKind = false;
        boolean pair = false;
        int tn = 0;

        for (int i = 1; i <= 6; i ++){
            int c = 0;
            for (int v : number) {
                if (v == i) {
                    c++;
                }
            }
            if (c == 5){
                return "Yahtzee";
            }
            else if (c == 4) {
                return  "Four of a kind";
            }
            else if (c == 3) {
                threeOfAKind = true;
                tn = i;
            }
            else if (c == 2){
                pair = true;
            }
        }

        boolean hasone = false;
        boolean hastwo= false;
        boolean hasthree= false;
        boolean hasfour= false;
        boolean hasfive= false;
        boolean hassix= false;

        Arrays.sort(number);
        for (int n: number) {
            if (n == 1)
                hasone = true;
            if (n == 2)
                hastwo = true;
            if (n == 3)
                hasthree = true;
            if (n == 4)
                hasfour = true;
            if (n == 5)
                hasfive = true;
            if (n == 6)
                hassix = true;
        }

        if ((number[0] == 1 && number[1] == 2 && number[2] == 3 && number[3] == 4 && number[4] == 5) ||
                (number[0] == 2 && number[1] == 3 && number[2] == 4 && number[3] == 5 && number[4] == 6)) {
            return "Large Straight";
        }
        else if (hasone && hastwo &&  hasthree && hasfour || hastwo &&  hasthree && hasfour && hasfive ||
                hasthree && hasfour && hasfive && hassix) {
            return "Small Straight";
        }

        if (threeOfAKind && pair){
            return "Full house!";
        }
        else if (threeOfAKind){
            return "Three of kind";
        }
        else if (pair){
            return "Pair";
        }

        return "no macth";
    }
}
