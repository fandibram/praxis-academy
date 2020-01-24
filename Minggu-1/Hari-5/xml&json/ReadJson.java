import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
    public static void main(String[] args){
	JSONParser parser = new JSONParser();
		 
	try {
	 
	  Object obj = parser.parse(new FileReader("/Documents/praxis-academy/Minggu-1/Hari-5/xml&json"));
	 
	  JSONObject jsonObject = (JSONObject) obj;
	 
	  String company = (String) jsonObject.get("company");
	  System.out.println("company = "+company);

	  String name = (String) jsonObject.get("name");
	  System.out.println("name = "+name);

	 
	  long price = (Long) jsonObject.get("price");
	  System.out.println("price = "+price);
	 
	
	}
}
}