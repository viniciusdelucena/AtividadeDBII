package br.edu.ifpb;

import org.postgresql.ds.PGPoolingDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setDataSourceName("A Data Source");
        source.setServerNames(new String[] {
                "localhost"
        });
        source.setDatabaseName("test");
        source.setUser("testuser");
        source.setPassword("testpassword");
        source.setMaxConnections(10);

        try (Connection conn = source.getConnection()) {
            // use connection
        } catch (SQLException e) {
            // log error
        }
    }
}