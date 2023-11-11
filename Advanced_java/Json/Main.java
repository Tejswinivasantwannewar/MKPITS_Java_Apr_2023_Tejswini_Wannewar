import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        JSONObject obj=new JSONObject();
        obj.put("name","sonoo");
        obj.put("age",(27));
        obj.put("salary",(600000));

        System.out.print("1) The JSON Output in key value pair  is :-"+obj);

        Map map=new HashMap();
        map.put("first_name","20000");


    }
}