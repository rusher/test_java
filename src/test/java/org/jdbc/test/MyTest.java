package org.jdbc.test;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class MyTest {
    @Test
    public void aTest() {
//        try (Connection conn= DriverManager.getConnection("jdbc:mariadb://localhost:3308/testj?user=root")) {
//            Statement stmt = conn.createStatement();
//            stmt.execute(
//                    "CREATE USER IF NOT EXISTS 'cachingSha256User2'@'%' IDENTIFIED WITH caching_sha2_password BY '!Passw0rd3Works'");
//            stmt.execute("GRANT ALL PRIVILEGES ON *.* TO 'cachingSha256User2'@'%'");
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        try (Connection conn= DriverManager.getConnection("jdbc:mariadb://localhost:3308/testj?user=cachingSha256User2&password=!Passw0rd3Works&sslMode=trust")) {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT 1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
