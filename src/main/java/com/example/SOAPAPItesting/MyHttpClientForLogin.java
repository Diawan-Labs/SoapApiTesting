package com.example.SOAPAPItesting;

import java.io.IOException;

import com.example.SOAPAPItesting.model.Login;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MyHttpClientForLogin {

	/*
	 * String code="G 5058"; 
	 * String password="temp"; 
	 * String deviceId="fa745df49f5e5e9d";
	 */
	String ok2(Login login)
    {
		String responseStr="";
          OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("text/xml");
      /*  RequestBody formBody = new FormBody.Builder()
                .add("code", "G 5058")
                .add("password", "temp")
                .add("deviceId", "fa745df49f5e5e9d")
                .build();
*/
        RequestBody requestBody=RequestBody.create(mediaType,perfromLogin(login));
        Request request = new Request.Builder()
                .addHeader("soapAction","http://tempuri.org/Login")
                .url("http://www.sysnetglobal.in/mobileapp_beta/webservices/mobileapp.asmx")
                .post(requestBody)
                .build();

       
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        //   System.out.println(response.body().string());
            responseStr=response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return responseStr;
    }
	 public  String perfromLogin(Login login) {

	        String body = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
	                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
	                "    <soap:Body>\n" +
	                "        <Login xmlns=\"http://tempuri.org/\">\n" +
	                "            <code>"+login.getCode()+"</code>\n" +
	                "            <password>"+login.getPassword()+"</password>\n" +
	                "            <deviceId>"+login.getDeviceId()+"</deviceId>\n" +
	                "        </Login>\n" +
	                "    </soap:Body>\n" +
	                "</soap:Envelope>";

	        return body;
	    }
}
