package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {
        try {
            String sql = Files.readString(Path.of("sql/init_db.sql"));
            Connection conn = Database.getInstance().getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Database initialized successfully.");
        } catch (IOException | RuntimeException e) {
            System.err.println("Error initializing DB: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
