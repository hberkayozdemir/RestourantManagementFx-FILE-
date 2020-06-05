package DataBase;

import User.Admin;
import User.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import User.Order;
public class DataBase  {
// person



    public boolean read(String username,String Password){

        Path p=new Path();

                try (BufferedReader br = new BufferedReader(new FileReader(p.getUserPath()+username+"\\"+"Password.txt"))) {

                    String sCurrentLine;

                    while ((sCurrentLine = br.readLine()) != null) {
                        if (Password.equals(sCurrentLine))
                        {
                          return true;
                        }
                        else {
                            return  false;
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
return false;
            }
    public boolean Adminread(String BOSSID,String BOSSPASSWORD){

        Path p=new Path();

        try (BufferedReader br = new BufferedReader(new FileReader(p.getAdminPath()+BOSSID+"\\"+"BOSSPASS.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                if (BOSSPASSWORD.equals(sCurrentLine))
                {
                    return true;
                }
                else {
                    return  false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

      public String ReadIdfromSelectedID(String r){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.getUserPath()+r+"\\"+"ID.txt"), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String ReadPasswordFromSelectedID(String r){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream1 = Files.lines(Paths.get(pathh.getUserPath()+r+"\\"+"Password.txt"), StandardCharsets.UTF_8))
        {
            stream1.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();

    }

    public String AdminReadIdfromSelectedID(String r){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.getAdminPath()+r+"\\"+"ID.txt"), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String AdminReadPasswordFromSelectedID(String r){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.getAdminPath()+r+"\\"+"Password.txt"), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }


    public String ReadInformationID(User p){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.PathGenerator(p,"ID")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String ReadInformationPassWord(User p){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.PathGenerator(p,"PassWord")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }


    public  void WriteInformationID(User p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"ID"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.getID());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void WriteInformationPassWord(User p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"PassWord"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.getPassword());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void WriteInformation(User p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"All"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
// restourant
    public  void AdminWriteInformation(Admin R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.AdminPathGenarator(R,"All"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void AdminWriteInformationBossID(Admin R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.AdminPathGenarator(R,"BOSSID"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.getBossid());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void AdminWriteInformationBossPass(Admin R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.AdminPathGenarator(R,"BOSSPASS"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.getBosspass());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    // Read Restourant String values


    public String AdminReadInformationBOSSID(Admin R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.AdminPathGenarator(R,"BOSSID")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String AdminReadInformationBOSSPASS(Admin R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.AdminPathGenarator(R,"BOSSPASS")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public String AdminReadInformation(Admin R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.AdminPathGenarator(R,"All")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }




}