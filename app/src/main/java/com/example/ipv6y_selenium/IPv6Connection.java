package com.example.ipv6y_selenium;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IPv6Connection extends Connection {

    public static void executeConnections() {

        long startTime = System.nanoTime();

        Connection con = new Connection();

        con.buildConnection();
        FirefoxDriver driver = con.getConnectionDriver();
        try {
            Connection.measureConnection(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Execution Time: " + elapsedTime/1000000);

    }


}


