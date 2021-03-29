package repository;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.postgres.PostgresPlugin;
import org.postgresql.ds.PGSimpleDataSource;

public class Connection {

    private static Jdbi connection;

    public static Jdbi getConnection() {
        return null;
        /*
        if (connection != null) {
            return connection;
        }

        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setUrl("jdbc:postgresql://localhost:5432/postgres");
        ds.setPassword("postgres");
        ds.setUser("postgres");
        connection = Jdbi.create(ds).installPlugin(new PostgresPlugin());
        return connection;

         */
    }
}
