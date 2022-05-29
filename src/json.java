import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class json    {
    public void JSON(String id,String name,String family,String age){
      String NAME=  name.toLowerCase().replaceAll("\\s","");
      String FAMILY=family.toLowerCase().replaceAll("\\s","");

       int  a=Integer.parseInt(age);




        JSONObject jsonObject=new JSONObject();
        jsonObject.put("is",new String(id));
        jsonObject.put("name",new String(NAME));
        jsonObject.put("family",new String(FAMILY));
        jsonObject.put("age",new Integer(a));

      writer writer=new writer();
      writer.writer(jsonObject);

        }
    }

