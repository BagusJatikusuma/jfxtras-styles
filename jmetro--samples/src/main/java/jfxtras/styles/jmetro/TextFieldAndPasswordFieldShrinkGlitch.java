package jfxtras.styles.jmetro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldAndPasswordFieldShrinkGlitch extends Application {

    public void start(final Stage primaryStage) {
        VBox container = new VBox(10);
        container.setPadding(new Insets(10));

        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button button = new Button("Close");
        button.setOnAction(event -> primaryStage.hide());

        container.getChildren().addAll(textField, passwordField, button);

        Scene scene = new Scene(container);
        JMetro metro = new JMetro(scene, Style.LIGHT);
        metro.setAutomaticallyColorPanes(true);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}