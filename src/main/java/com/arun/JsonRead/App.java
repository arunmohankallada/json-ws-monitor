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
 * Commit Test
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONParser parser = new JSONParser();

        try {

        	JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("/Users/arunmohan/dev/eclipse-workspace/JsonRead/src/main/resources/WSList.json"));

        for (Object o : jsonArray) {
        	JSONObject jsonObject = (JSONObject) o;
        	WebService ws = new WebService(jsonObject);
        	ws.printResult();
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
