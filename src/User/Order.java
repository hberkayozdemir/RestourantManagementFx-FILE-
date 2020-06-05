package User;

import DataBase.Path;

import java.io.File;

public class Order {

    private String TableNumber;

    public String getTableNumber() {
        return TableNumber;
    }

    public void setTableNumber(String tableNumber) {
        TableNumber = tableNumber;
    }

    Path p=new Path();


    public Order(String TableNumber) {
        this.TableNumber=TableNumber;
        new File(p.getOrdersPath()+"\\"+TableNumber).mkdirs();

    }


}
