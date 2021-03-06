package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{//главное окно программы
        Parent root = FXMLLoader.load(getClass().getResource("p1.fxml"));
        primaryStage.setTitle("Конструктор тестов");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
