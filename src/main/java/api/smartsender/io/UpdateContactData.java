package api.smartsender.io;

import org.testng.annotations.Test;
import settings.SSL;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;

public class UpdateContactData {

    public static StringBuilder response;

    public void sendPost(String url, String json) throws Exception {

        HttpsURLConnection httpClient = (HttpsURLConnection) new URL(url).openConnection();

        //Add reuqest header
        httpClient.setRequestMethod("POST");
        httpClient.setRequestProperty("Host", "api.smartsender.io");
        httpClient.setRequestProperty("User-Agent", "JAVA");
        httpClient.setRequestProperty("Content-Type", "application/json");
        httpClient.setRequestProperty("Accept", "application/json");
        httpClient.setRequestProperty("Access-Token", "MTRkOWZkMDc0ZWE4NjUyZDg1ZTgzYTUwOTc1NTBkYjk=");

        // Send post request
        httpClient.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(httpClient.getOutputStream())) {
            writer.writeBytes(json);
            writer.flush();
        }

        System.out.println("Sending 'POST' to URL : " + url);
        System.out.println("Parameters : " + json);
        System.out.println("Response Code : " + httpClient.getResponseCode());
        System.out.println("Response Message : " + httpClient.getResponseMessage());

        //Getting response;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpClient.getInputStream()));
            String line;
            response = new StringBuilder();
            while ((line = in.readLine()) != null) {
                response.append(line);
                response.append(System.lineSeparator());
            }
        }catch (Exception ex){
            BufferedReader in = new BufferedReader(new InputStreamReader(httpClient.getErrorStream()));
            String line;
            response = new StringBuilder();
            while ((line = in.readLine()) != null) {
                response.append(line);
                response.append(System.lineSeparator());
            }
            throw new Exception(ex.toString());

        }finally {
            System.out.println("Response: "+response);
        }
    }
}