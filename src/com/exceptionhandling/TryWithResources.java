package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** The "try-with-resources" syntax allows us to omit the "finally" clause, by
    automatically calling "close" at the end of the method (or before an exception
    is thrown) on our behalf.

 *  Any object that implements the java.lang.autocloseable interface may be used
    with the "try-with-resources" syntax. */

public class TryWithResources {
    public static void main(String[] args) {
        String url = "sampleURL";
        // try-with-resources block (Connection will be automatically closed)
        try (Connection conn = DriverManager.getConnection(url)) {
            // More SQL code
        } catch (SQLException e) {
            // handle exception
        }
    }
}