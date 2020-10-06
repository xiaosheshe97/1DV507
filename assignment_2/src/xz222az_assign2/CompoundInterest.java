package xz222az_assign2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;

public class CompoundInterest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        Label head = new Label("Compound Interest");
        head.setFont(new Font(30));
        pane.add(head,0,0,3,1);

        pane.add(new Label("Start amount:"),0,1);
        final TextField startAmount = new TextField();
        pane.add(startAmount,1,1);

        pane.add(new Label("Interest:"),0,2);
        final TextField interest = new TextField();
        pane.add(interest,1,2);

        pane.add(new Label("Number of years:"),0,3);
        final TextField year = new TextField();
        pane.add(year,1,3);

        Button cal = new Button("Calculate");
        pane.add(cal,0,4);

        final Label result = new Label();
        pane.add(result,0,5);

        cal.setOnAction(event -> {
            try {
                int resultNum = (int)(Double.parseDouble(startAmount.getText()) *
                        Math.pow((1 + (Double.parseDouble(interest.getText())) / 100), Double.parseDouble(year.getText())) + 0.5);
                        result.setText("In total that will be " + resultNum);
            }catch (Exception e){
                result.setText("please enter number");
            }
        });

        primaryStage.setTitle("Compound Interest");
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
