package Exercise9;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Santa extends Application {
    private int index;
    private int x_speed = 5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Image background = new Image("Exercise9/background.png");
        ImageView backgroundView = new ImageView(background);
        backgroundView.setFitHeight(500);
        backgroundView.setFitWidth(1000);

        Image[] santa = new Image[11];
        santa[0] = new Image("Exercise9/Run (1).png");
        santa[1] = new Image("Exercise9/Run (2).png");
        santa[2] = new Image("Exercise9/Run (3).png");
        santa[3] = new Image("Exercise9/Run (4).png");
        santa[4] = new Image("Exercise9/Run (5).png");
        santa[5] = new Image("Exercise9/Run (6).png");
        santa[6] = new Image("Exercise9/Run (7).png");
        santa[7] = new Image("Exercise9/Run (8).png");
        santa[8] = new Image("Exercise9/Run (9).png");
        santa[9] = new Image("Exercise9/Run (10).png");
        santa[10] = new Image("Exercise9/Run (11).png");

        ImageView santaView = new ImageView(santa[0]);
        santaView.setFitWidth(200);
        santaView.setFitHeight(150);
        santaView.setX(1);
        santaView.setY(230);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(20),event -> {

            santaView.setImage(santa[index++]);
            santaView.setX(santaView.getX()+ x_speed);
            if (santaView.getX()<= 0 || santaView.getX() >= 1000 - 200){
                x_speed = -x_speed;
            }
            if (x_speed < 0){
                santaView.setScaleX(-1);
            }
            else
                santaView.setScaleX(1);
            if (index == 11){
                index = 0;
            }
        });
        Timeline timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        Group group = new Group();
        group.getChildren().addAll(backgroundView,santaView);
        Scene scene = new Scene(group,1000,500);
        primaryStage.setTitle("Running Santa");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
