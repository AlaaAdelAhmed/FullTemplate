package reader;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataDrivenFromJson {
 String sucessfulLogin = "SucessfulLogin";
    private String[] readFileJson(String testData) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("data/testDriven.json");

       Object object = jsonParser.parse(fileReader);
        JSONObject jsonObject =(JSONObject) object;
       JSONArray jsonArray = (JSONArray) jsonObject.get(testData);
       String arr[] = new String[jsonArray.size()];

       for (int  i = 0 ; i<jsonArray.size(); i ++){
           JSONObject users = (JSONObject) jsonArray.get(i);
           String user = (String) users.get("Email");
           String password = (String)  users.get("Password");
           arr[i] = user+","+password;
       }
       return arr;


    }


    public String[] testDataForSucessfulLogin() throws IOException, ParseException {
        return readFileJson(sucessfulLogin);
    }
}
