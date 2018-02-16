package gui.fuck;

import javafx.application.Application;
import javafx.scene.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Crap extends Application{

    Button button;

    public static void main (String[] args){
        launch(args);
    }


    @Override
    public void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Click this");
        Button button = new Button();
        button.setText("click me");
            button.setOnAction(e    -> System.out.println("Yolo"));

        /*
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("YOLO");
                }
            });
        */

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
