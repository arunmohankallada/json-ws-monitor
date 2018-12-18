package com.arun.JsonRead;

import org.json.simple.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebService {

	String serviceName;
	String serviceLink;
	String serviceMethod;
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceLink() {
		return serviceLink;
	}
	public void setServiceLink(String serviceLink) {
		this.serviceLink = serviceLink;
	}
	public String getServiceMethod() {
		return serviceMethod;
	}
	public void setServiceMethod(String serviceMethod) {
		this.serviceMethod = serviceMethod;
	}
	public WebService() {
		super();
	}
	public WebService(JSONObject jo) {
		setServiceName((String) jo.get("servicename"));
		setServiceLink((String) jo.get("servicelink"));
		setServiceMethod((String) jo.get("servicemethod"));
		//System.out.println(getServiceName());
	}
	private int getResponseCode() throws IOException{
		URL url = new URL(this.getServiceLink());
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod(this.getServiceMethod());
        return http.getResponseCode();
	}
	public void printResult() throws IOException {	
		System.out.println("ServiceName   : "+ this.getServiceName());
		System.out.println("ServiceLink   : "+ this.getServiceLink());
		System.out.println("ServiceMethod : "+ this.getServiceMethod());
		System.out.println("ReturnCode    : "+getResponseCode());
		System.out.println("--------------------------------------------");
	}

}
