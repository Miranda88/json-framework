import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class mainClass {

	static JsonPut jp;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{		
		jp = JsonPut.getInstance();
		
		jp.getJson("Nome");
		jp.getJson("Idade");
		jp.getJson("Numero");

		
	}

}
