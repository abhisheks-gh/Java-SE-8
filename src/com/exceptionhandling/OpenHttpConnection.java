package com.exceptionhandling;

import java.net.URL;
import java.net.MalformedURLException;

public class OpenHttpConnection {
    public static void main(String[] args) {
        try {
            openHttpConnection("https://docs.oracle.com/en/java/");
        } catch (MalformedURLException e) {
            System.out.println("Hey - this URL isn't correct");
        }
    }
    public static void openHttpConnection(String url) throws MalformedURLException {
        URL site = new URL(url);
        // do some work with this site
    }
}