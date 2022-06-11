import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class writer {
    public void writer(JSONObject JSON) throws Exception {



        String ADDW = add(JSON);
        FileWriter fileWriter = new FileWriter(String.valueOf(ADDW), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(JSON.toString());
        bufferedWriter.close();
    }

    public String add(JSONObject json) {
        String S = json.get("id").toString();
        char[] ch = S.toCharArray();
        System.out.println(ch[0]);
        String ADD = "./data/7file.json";
        String ADDW = ADD.replace('7', ch[0]);
        return ADDW;

    }
}