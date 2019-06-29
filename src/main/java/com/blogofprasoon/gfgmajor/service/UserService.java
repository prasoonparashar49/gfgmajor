package com.blogofprasoon.gfgmajor.service;

import com.blogofprasoon.gfgmajor.model.User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class UserService {

    private final String USER_AGENT = "Mozilla/5.0";
    public User getUser(String url) {
        int status;
        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent",USER_AGENT);
            status = connection.getResponseCode();
            System.out.println(status);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
