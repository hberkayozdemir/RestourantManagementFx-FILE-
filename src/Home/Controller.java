package Home;
import User.Admin;
import User.User;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import DataBase.*;
import User.Order;
public class Controller extends DataBase {




@FXML
    public TextField txtemail;

    @FXML
    public TextField txtPassword;

    public double DailyEarn=0.0;

    public void LoginButtonClicked(InputEvent e) {
        FileFinder f=new FileFinder();
        DataBase db=new DataBase();

        if((f.userFinder(txtemail.getText()))!=null){
            System.out.println("1");

            System.out.println(txtemail.getText().equals(db.ReadIdfromSelectedID(txtemail.getText())));
            if (db.read(txtemail.getText(),txtPassword.getText())){

                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Home1.fxml"));
                    Stage stage = new Stage();
                    Scene root = new Scene(fxmlLoader.load(), 895, 626);
                    stage.setTitle("Waiter interface");
                    stage.setScene(root);
                    stage.show();
                    final Node source = (Node) e.getSource();
                    final Stage seagreen = (Stage) source.getScene().getWindow();
                    seagreen.close();
                }
                catch (IOException Ex) {
                    Ex.printStackTrace();
                }
            }
          else{
                System.out.println("2");





                }
            }

           else  if((f.admin_finder(txtemail.getText())!=null))
             if (db.Adminread(txtemail.getText(), txtPassword.getText())) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Home.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 895, 626);
                stage.setTitle("Admin interface");
                stage.setScene(root);
                stage.show();
                final Node source = (Node) e.getSource();
                final Stage seagreen = (Stage) source.getScene().getWindow();
                seagreen.close();
            } catch (IOException Ex) {
                Ex.printStackTrace();
            }
        } else {
            System.out.println("admin sifre yanlis");
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Hata.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 470, 268);
                stage.setTitle("Try Again");
                stage.setScene(root);
                stage.show();
                final Node source = (Node) e.getSource();
                final Stage seagreen = (Stage) source.getScene().getWindow();
                seagreen.close();
            } catch (IOException Ex) {
                Ex.printStackTrace();
            }
        }

        else{


        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Hata.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 470, 268);
            stage.setTitle("Try Again");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        } catch (IOException Ex) {
            Ex.printStackTrace();
        }


    }

    }


public void  DailyEarn(InputEvent e){

    try {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("DailyEarn.fxml"));
        Stage stage = new Stage();
        Scene root = new Scene(fxmlLoader.load(), 895, 626);
        stage.setTitle("DailyEarn");
        stage.setScene(root);
        stage.show();
        final Node source = (Node) e.getSource();
        final Stage seagreen = (Stage) source.getScene().getWindow();
        seagreen.close();


    }
    catch (IOException Ex) {
        Ex.printStackTrace();
    }

}


    public void TableSelectionButtonClicked(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Tables.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("TableSelection");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }
    }

    public void TableSelectionButtonClicked1(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Tables1.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("TableSelection1");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }
    }

    public void HomePage(InputEvent e){


        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Home.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Home");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();
        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }
    }
    public void LoginPage(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Login.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Login");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }
    }

    public void OrderScreen1(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 1");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }

    public void OrderScreen2(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS1.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 2");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }

    public void OrderScreen3(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS2.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 3");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }

    public void OrderScreen4(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS3.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 4");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }
    public void OrderScreen5(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS4.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 5");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }



    public void OrderScreen6(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS5.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 6");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }



    public void Os1(InputEvent e){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("OS5.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Table 6");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();
        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }



    }
    public  void AdminRegisterCLicked(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("ar.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Admin Registiration");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();
        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }
    }
    @FXML
    TextField BOSSID;
@FXML
TextField BOSSPASS;
    public  void ar(InputEvent e){
        Admin a=new Admin(BOSSID.getText(),BOSSPASS.getText());

        DataBase db=new DataBase();
        db.AdminWriteInformationBossID(a);
        db.AdminWriteInformationBossPass(a);

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Home.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Waiter interface");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();
        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }

    }

    @FXML
    TextField WaiterID;
    @FXML
    TextField WaiterPass;


    public void User_registirationClicked(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("WaiterRegister.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Waiter Registiration");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();
        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }

    }


    public void ur(InputEvent e){
         User u=new User(WaiterID.getText(),WaiterPass.getText());
         DataBase db=new DataBase();
         db.WriteInformationID(u);
         db.WriteInformationPassWord(u);

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Home.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 895, 626);
            stage.setTitle("Waiter interface");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();
        }
        catch (IOException Ex) {
            Ex.printStackTrace();
        }
    }



}
 