import io.Window;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //code here

        Window.open();

        Window.background(Color.SKYBLUE);




    }

    public static void main(String[] args) {
        launch();
    }
}
