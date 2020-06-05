package User;

import java.io.File;

import DataBase.DataBase;
import DataBase.FileFinder;
import DataBase.Path;

public class Admin {

    private String bossid;
    private String bosspass;



    Path p =new Path();


    public Admin(String bossid,String bosspass){

        this.bossid=bossid;
        this.bosspass=bosspass;
        new File(p.getAdminPath()+"\\"+this.bossid).mkdirs();
    }


    public String getBossid() {
        return bossid;
    }

    public void setBossid(String bossid) {
        this.bossid = bossid;
    }

    public String getBosspass() {
        return bosspass;
    }

    public void setBosspass(String bosspass) {
        this.bosspass = bosspass;
    }


}
