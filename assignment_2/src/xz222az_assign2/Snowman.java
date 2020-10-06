package xz222az_assign2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Circle sun = new Circle(500, 100, 50);
        sun.setFill(Color.YELLOW);

        Circle c1 = new Circle(300,450,60);
        c1.setFill(Color.WHITE);

        Circle c2 = new Circle(300,370,40);
        c2.setFill(Color.WHITE);

        Circle b1 = new Circle(300,370,3);
        Circle b2 = new Circle(300,385,3);
        Circle b3 = new Circle(300,355,3);

        Circle c3 = new Circle(300,310,30);
        c3.setFill(Color.WHITE);

        //eyes
        Circle leye = new Circle(290,310,3);
        leye.setFill(Color.BLACK);
        Circle reye = new Circle(310,310,3);
        reye.setFill(Color.BLACK);

        //hat
        Line hat1 =  new Line(250,290,350,290);
        hat1.setStrokeWidth(7);
        Rectangle hat2 = new Rectangle(280,260,40,30);

        Line mouth = new Line(292,320, 308,320);

        Rectangle ground = new Rectangle(0,500, 600,600);
        ground.setFill(Color.WHITE);

        root.getChildren().addAll(sun, c1, c2, c3,ground,leye, reye, mouth, b1, b2, b3,hat1,hat2);
        Scene scene = new Scene(root, 600, 600, Color.rgb(51,204,255));

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
