import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;


public class TinyPainter extends Application {
    private Line line;
    private Rectangle dot;
    private Rectangle rectangle;
    private Circle circle;
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(5, 5, 5, 5));
        hBox.setSpacing(5);

        ComboBox<String> shape = new ComboBox<>();
        shape.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
        ComboBox<Integer> size = new ComboBox<>();
        size.getItems().addAll(1, 5, 10, 15, 20, 25, 30, 35, 40);
        ColorPicker colorPicker = new ColorPicker();

        hBox.getChildren().addAll(shape, size, colorPicker);

        pane.getChildren().addAll(hBox);

        pane.setOnMousePressed(event -> {
            startX = event.getX();
            startY = event.getY();
            if (shape.getSelectionModel().getSelectedItem().equals("Line")) {
                line = new Line();
                line.setStartX(startX);
                line.setStartY(startY);
                line.setStrokeWidth(size.getValue());
                line.setStroke(colorPicker.getValue());
            }
            if (shape.getSelectionModel().getSelectedItem().equals("Dot")) {
                dot = new Rectangle(startX, startY, size.getValue(), size.getValue());
                dot.setFill(colorPicker.getValue());
                pane.getChildren().addAll(dot);
            }
            if (shape.getSelectionModel().getSelectedItem().equals("Rectangle")) {
                rectangle = new Rectangle();
                rectangle.setX(startX);
                rectangle.setY(startY);
                rectangle.setFill(colorPicker.getValue());
                pane.getChildren().addAll(rectangle);
            }
            if (shape.getSelectionModel().getSelectedItem().equals("Circle")) {
                circle = new Circle();
                circle.setFill(colorPicker.getValue());
                circle.setCenterX(startX);
                circle.setCenterY(startY);
                pane.getChildren().addAll(circle);
            }

        });
        pane.setOnMouseDragged(event -> {
            endX = event.getX();
            endY = event.getY();
            if (shape.getSelectionModel().getSelectedItem().equals("Line")) {
                line.setEndX(endX);
                line.setEndY(endY);
                try {
                    pane.getChildren().addAll(line);
                }catch (java.lang.IllegalArgumentException e){
                }
            }
            if (shape.getSelectionModel().getSelectedItem().equals("Rectangle")) {
                rectangle.setWidth(endX - startX);
                rectangle.setHeight(endY - startY);
            }
            if (shape.getSelectionModel().getSelectedItem().equals("Circle")) {
                circle.setRadius(Math.sqrt(Math.pow(endX-startX,2) + Math.pow(endY - startY,2)));
            }

        });

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Tiny Painter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
