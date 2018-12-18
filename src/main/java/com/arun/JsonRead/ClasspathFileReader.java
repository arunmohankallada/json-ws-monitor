package com.arun.JsonRead;

import java.io.File;
import java.net.URL;

public class  ClasspathFileReader{

	private static final String CONFIG_FILE = "/WSList.json";
	public ClasspathFileReader() {
		// TODO Auto-generated constructor stub
	}
	public String readInputJson()
    {
        URL fileUrl = getClass().getResource(CONFIG_FILE);
        File a= new File(fileUrl.getFile());
        return a.toString();
    }

}
