package Home;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

public class OrderScreenController2 implements Initializable {
    public TableView<Products> Table;
    public TableColumn<Products,String> ColName;
    public TableColumn<Products,Double> ColPrice;
    public TableColumn<Products,Integer> ColQuantity;

Economy eco=new Economy();






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

public void Pizza(InputEvent e){

   observableList.add(new Products("Pizza",1,9.0));

}

public  void Salads(InputEvent e){
    observableList.add(new Products("Salads",1,10.0));

}
public void Burger(InputEvent e){
    observableList.add(new Products("Burger",1,8.0));

}
public void Pasta(InputEvent e){
    observableList.add(new Products("Pasta",1,7.0));

}
public  void Dessert(InputEvent e){
    observableList.add(new Products("Dessert",1,12.0));

}
public void Soup(InputEvent e){
    observableList.add(new Products("Soup",1,10.0));

}

public  void deleteLast(InputEvent  e){
if(observableList.size()-1<=0) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Hata1.fxml"));
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
else {
    observableList.remove(observableList.size() - 1);
}
}
public void deleteAll(InputEvent e){
    List<Products> prod = new ArrayList<>();
    for (Iterator<Products> it = observableList.iterator(); it.hasNext(); )
    {
        Products pr = it.next();
        prod.add(pr);
    }
    double a = 0;
    for(int i=0;i<=observableList.size()-1;i++)
    {
        a += prod.get(i).getProductPrice();
    }

    eco.setPrice2(a);
    if(observableList.size()-1<=0) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Hata1.fxml"));
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
    else {
        Table.getItems().clear();
    }
}
    ObservableList<Products> observableList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        ColName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        ColPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice"));
        ColQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity"));
        Table.setItems(observableList);

    }




    }
