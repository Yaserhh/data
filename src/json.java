import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class json    {
    public void JSON(String id,String name,String family,String age) throws Exception {
      Date date=new Date();
      SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/ MM/ dd");
   String DATE= simpleDateFormat.format(date);

      String NAME=  name.toLowerCase().replaceAll("\\s","");
      String FAMILY=family.toLowerCase().replaceAll("\\s","");
        String ID=family.toLowerCase().replaceAll("\\s","");

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id",new String(ID));
        jsonObject.put("name",new String(NAME));
        jsonObject.put("family",new String(FAMILY));
        jsonObject.put("age",new Integer(age));
        jsonObject.put("date",new String(DATE));

      writer writer=new writer();
      writer.writer(jsonObject);

        }
    }

