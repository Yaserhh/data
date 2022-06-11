import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;


public class inp {
    public  void p()throws  Exception{

        FileInputStream fileInputStream=new FileInputStream("E:/kkk.json");
        DataInputStream dataInputStream=new DataInputStream(new DataInputStream(fileInputStream));
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(dataInputStream));
        String K;
        while ((K=bufferedReader.readLine())!=null){
            JSONParser jsonParser=new JSONParser();
            JSONObject jsonObject=(JSONObject) jsonParser.parse(K);
            String id = (String) jsonObject.get("id");
            String name = (String) jsonObject.get("name");
            String family = (String) jsonObject.get("family");
            String age = (String) jsonObject.get("age");
            String data = (String) jsonObject.get("data");
            System.out.println(id+name+family+age+data);

        }

    }


}
