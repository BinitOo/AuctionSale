import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene = new Scene(root,1200,700);
            //scene.getStylesheets().add(getClass().getResource("Main/login_signUp.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Home");
            primaryStage.setResizable(false);
            //primaryStage.getIcons().add(new Image(this.getClass().getResource("C:\\JavaProjects\\MiniProjet_RMI\\src\\Main\\cabinet2.png").toString()));
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
