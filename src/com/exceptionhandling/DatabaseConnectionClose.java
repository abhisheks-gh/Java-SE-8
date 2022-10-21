package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** The try block doesn't allow to execute the code after the offending line.
 *  In some cases, there is code that we want to execute, no matter what the
    circumstances.
 *  Say, for example, that our application had a connection to a database or
    a file.
 *  Even after an exception is caught, we want the connection released. */

public class DatabaseConnectionClose {
    public static void main(String[] args) {
        Connection conn = null;
        String url = "sampleURL";
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            // handle exception
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                // Log error.
            }
        }
    }
}