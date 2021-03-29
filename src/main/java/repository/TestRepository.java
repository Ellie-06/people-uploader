package repository;

import org.jdbi.v3.core.Jdbi;

public class TestRepository {

    private final Jdbi jdbi;

    public TestRepository(Jdbi jdbiConnection) {
        this.jdbi = jdbiConnection;
    }

    public int getPersonCount() {
        System.out.println("SELECT count(id) AS count FROM person;");
        return 10;
//        return jdbi.withHandle(h ->
//                h.createQuery("SELECT count(id) AS count FROM person;")
//                        .map((rs, rv) -> rs.getInt("count")).first()
//        );
    }
}
