import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class writer {
    public  void writer(JSONObject JSON){
        try {
            FileWriter fileWriter=new FileWriter("E:/DWDW.json",true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(JSON.toString());
            bufferedWriter.close();

        }catch (Exception E){


        }




    }
}
