package Home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import DataBase.FileFinder;
import java.awt.*;
import User.User;
import User.Admin;
import DataBase.DataBase;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 895, 626));
        primaryStage.show();

    }


    public static void main(String[] args) {
Admin ilknur=new Admin("ilknur","donmez");
DataBase db=new DataBase();
db.AdminWriteInformationBossID(ilknur);
db.AdminWriteInformationBossPass(ilknur);
db.AdminWriteInformation(ilknur);

        launch(args);

    }
}
