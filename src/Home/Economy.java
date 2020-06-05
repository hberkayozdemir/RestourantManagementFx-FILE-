package Home;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.awt.*;
import java.io.IOException;

public class Economy {

    public  Label kazan;
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


    public void RefreshMoney(ActionEvent e)
    {
        kazan.setText(Total());
    }



    public double getPrice()
    {
        return price;
    }
// 1

    /*
     public void setPrice(double price)
    {
        this.price = price;
        savePrice(price);
    }
    private static void savePrice(double price)
    {
        price2 = price;
    }
     */
    public void setPrice(double price)
    {
        this.price = price;

    }
    public void setPrice1(double price)
    {
        this.price1 = price2;

    }
    public void setPrice2(double price)
    {
        this.price2 = price;

    }
    public void setPrice3(double price)
    {
        this.price3 = price;

    }
    public void setPrice4(double price)
    {
        this.price4 = price;

    }
    public void setPrice5(double price)
    {
        this.price5 = price;

    }
    public String Total(){
        return Double.toString(price+price1+price2+price3+price4+price5);
    }
    public  String OS1TotalPrice(){
    return Double.toString(price);
    }
    public  String OS2TotalPrice(){
        return Double.toString(price1);
    } public  String OS3TotalPrice(){
        return Double.toString(price2);
    }
    public  String OS4TotalPrice(){
        return Double.toString(price3);
    }
    public  String OS5TotalPrice(){
        return Double.toString(price4);
    }
    public  String OS6TotalPrice(){
        return Double.toString(price5);
    }



    private static double price;
    private static double price1;
    private static double price2;
    private static double price3;
    private static double price4;
    private static double price5;



    public Economy(double price) {
        this.price = price;
    }
    public Economy() {

    }



}
