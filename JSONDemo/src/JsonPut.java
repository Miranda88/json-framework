import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;

public class JsonPut 
{
	private static JsonPut instance;
	JsonObject obj = new JsonObject();

	private JsonPut()
	{

	}
	
	public static JsonPut getInstance()
	{
		if(instance == null)
			instance = new JsonPut();
		
		return instance;
	}
	
	public void putJson(String key,String atribute)
	{
		obj.addProperty(key, atribute  + "\r\n");
		
		try 
		{
	 
			FileWriter file = new FileWriter("JsonFiles/myData.json");
			file.write(obj.toString());
			file.flush();
			file.close();
	 
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	 
		System.out.print(obj);
	}
	
	public void getJson(String key)
	{
		JsonParser parser = new JsonParser();
		 
		try 
		{
	 
			Object obj = parser.parse(new FileReader("JsonFiles/myData.json"));
	 
			JsonObject jsonObject = (JsonObject) obj;

			String message = jsonObject.get(key).toString();
			System.out.println(message);
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	public void clearObj()
	{
		obj = null;
		obj = new JsonObject();
	}
	
}
