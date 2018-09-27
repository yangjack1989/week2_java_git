package View;

import com.sun.media.sound.WaveFileWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
   public static void main (String[]args){
       launch(args);
   }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PhonesView.fxml"));
        Scene scene =new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("create phones");
        primaryStage.show();;

    }
}
