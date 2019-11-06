package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.MenuBarView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox raiz = new VBox();

        MenuBarView menuBarView = new MenuBarView();
        raiz.getChildren().addAll(menuBarView.getMenuBar(primaryStage));

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Loja");
        primaryStage.setScene(new Scene(raiz, 700, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
