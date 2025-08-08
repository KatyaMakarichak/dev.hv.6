package org.example;

import org.example.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> result = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of("sql/find_max_projects_client.sql"));
            Connection conn = Database.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                MaxProjectCountClient client = new MaxProjectCountClient();
                client.setName(rs.getString("name"));
                client.setProjectCount(rs.getInt("project_count"));
                result.add(client);
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<LongestProject> findLongestProject() {
        List<LongestProject> result = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of("sql/find_longest_project.sql"));
            Connection conn = Database.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                LongestProject project = new LongestProject();
                project.setId(rs.getInt("id"));
                project.setMonthCount(rs.getInt("month_count"));
                result.add(project);
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> result = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of("sql/find_max_salary_worker.sql"));
            Connection conn = Database.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                MaxSalaryWorker worker = new MaxSalaryWorker();
                worker.setName(rs.getString("name"));
                worker.setSalary(rs.getInt("salary"));
                result.add(worker);
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorkers() {
        List<YoungestEldestWorker> result = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of("sql/find_youngest_eldest_workers.sql"));
            Connection conn = Database.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                YoungestEldestWorker worker = new YoungestEldestWorker();
                worker.setType(rs.getString("type"));
                worker.setName(rs.getString("name"));
                worker.setBirthday(rs.getString("birthday"));
                result.add(worker);
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<ProjectPrice> printProjectPrices() {
        List<ProjectPrice> result = new ArrayList<>();
        try {
            String sql = Files.readString(Path.of("sql/print_project_prices.sql"));
            Connection conn = Database.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ProjectPrice price = new ProjectPrice();
                price.setProjectId(rs.getInt("project_id"));
                price.setPrice(rs.getInt("price"));
                result.add(price);
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
