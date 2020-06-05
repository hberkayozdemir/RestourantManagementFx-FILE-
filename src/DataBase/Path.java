package DataBase;

import User.Admin;
import User.User;
import User.Order;

public class Path {
    private String path=".\\Logs"; // burası aslında null du otomatik kullanıcı secicekti ama olmadı:(
    // bir sonraki update te halledicem
    private String UserPath=path+"\\Users\\";
    private String AdminPath =path+"\\Admins\\";
    private String OrdersPath=path+"\\"+"Orders\\";

//C:\Users\berko\OneDrive\Masaüstü\Dosya\\Restoruants\\
    public String getOrdersPath(){ return OrdersPath;}
    public void setOrdersPath( String OrdersPath){ this.OrdersPath=OrdersPath;}
    public String getPath() {
        return path;
    }
public  String getUserPath(){
    return UserPath;
}
public String getAdminPath(){
    return AdminPath;
}

    public void setPath(String path) {
        this.path = path;
    }

    public void setAdminPath(String adminPath) {
        AdminPath = adminPath;
    }

    public String PathGenerator(User p, String Parameter){

        if(Parameter.equals("ID")){
            return getUserPath()+p.getID()+"\\"+"ID.txt";
        }
        else if(Parameter.equals("PassWord")){
            return getUserPath()+p.getID()+"\\"+"Password.txt";

        }
        else if(Parameter.equals("All")){
            return getAdminPath()+p.toString()+"\\"+"Information.txt";
        }

        else{
            return getUserPath()+p.getID()+"\\"+"ERROR.txt";
        }

    }
    public  String AdminPathGenarator(Admin R, String Parameter){

        if(Parameter.equals("BOSSID")){
            return getAdminPath()+R.getBossid()+"\\"+"BOSSID.txt";
        }
        else if(Parameter.equals("BOSSPASS")){
            return getAdminPath()+R.getBossid()+"\\"+"BOSSPASS.txt";
        }
        else if(Parameter.equals("All")){
            return getAdminPath()+R.getBossid()+"\\"+"Information.txt";
        }
        else{
            return getAdminPath()+R.getBossid()+"\\"+"Error.txt";
        }
    }

    public String OrderPathGenarator(Order o,String Parameter){
        if(Parameter.equals("Order")){
            return getOrdersPath()+o.getTableNumber()+"\\"+"Order.txt";
        }
        else if(Parameter.equals("Price")){
            return getOrdersPath()+o.getTableNumber()+"\\"+"Price.txt";
        }
        else {
            return getOrdersPath()+o.getTableNumber()+"\\"+"Error.txt";
        }
    }
 /*   public String OrderGenarator(User u,String Parameter){
        if( Parameter.equals("Order")){
          //  return getOrdersPath()+u.getID()+"\\"+""
        }
return
    }

  */

}
