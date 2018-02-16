package gui.fuck;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by lefdal on 16.02.2018.
 */
public class CrapTwo extends Application {

    Button button;
    Stage window;
    Scene scene1, scene2;




    public static void main(String[] args){
        launch(args);

    }



    @Override public void start(Stage primeStage) throws Exception{
        window = primeStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene2");
        button1.setOnAction(e -> window.setScene(scene2));

        //layout 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1,200,200);

        //Button 2
        Button button2 = new Button("Yo!");
        button2.setOnAction(e -> window.setScene(scene1));

        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene (layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();

    }


}
