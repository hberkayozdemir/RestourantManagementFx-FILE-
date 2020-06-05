package User;

import java.io.File;

import DataBase.DataBase;
import DataBase.FileFinder;
import DataBase.Path;

public class User {
    Path pp=new Path();

    private String id;
    private String password;


    public String getID(){
        return id;

    }

    public String getPassword(){
        return password;
    }

    public void setId(String ID){
    id=ID;
    }



    public void setPassword(String Password){
        password=Password;
    }


    public User(String id,String Password){
        this.id=id;
        this.password=Password;
        new File(pp.getUserPath()+this.id).mkdirs();
        System.out.println("Oldu");
    }

    public  User(){
        this.id="Parametreler değer dondurmuyor";
        this.password="Parameteler değer dondurmuyor";
        new File(pp.getUserPath()+this.id).mkdirs();
        System.out.println("Oldu ama parametre yok");
    }
    public  User(String id){
        this.id=id;
        System.out.println("Id girildi ama sifre girilmedi olusturma tamamlanmadı");
    }


    @Override
    public String toString() {
        return "User{" +
                "pp=" + pp +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
