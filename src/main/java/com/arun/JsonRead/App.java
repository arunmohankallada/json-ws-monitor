package com.arun.JsonRead;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONParser parser = new JSONParser();
        
        try {

        	JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(new ClasspathFileReader().readInputJson()));
        	
        	

        for (Object o : jsonArray) {
        	JSONObject jsonObject = (JSONObject) o;
        	System.out.print("Input:"+jsonObject+"\nOutput:");
        	WebService ws = new WebService(jsonObject);
        	JSONObject resultJson=ws.printResult();
        	System.out.println(resultJson);
        }
         

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
