package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        try {
            String sql = Files.readString(Path.of("sql/populate_db.sql"));
            Connection conn = Database.getInstance().getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Database populated successfully.");
        } catch (IOException | RuntimeException e) {
            System.err.println("Error populating DB: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
