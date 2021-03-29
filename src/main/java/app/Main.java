package app;

import domain.Person;
import repository.Connection;
import repository.TestRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TestRepository repository = new TestRepository(Connection.getConnection());

        repository.getPersonCount();
        /*
        List<Person> people = new ArrayList<>();
        try {
            List<String> fileLines = Files.readAllLines(Paths.get("person.txt"));
            for (String line : fileLines) {
                Person person = Person.parse(line);
                if (person != null) {
                    people.add(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        people.forEach(System.out::println);
        */
        /*
        List<Person> people = new ArrayList<>();

        long start = System.nanoTime();
        try {
            List<String> fileLines = Files.readAllLines(Paths.get("person.txt"));
            for (String line : fileLines) {
                Matcher m = REGEX.matcher(line);

                if (m.find()) {
//                    System.out.println("Firstname: " + m.group("firstname") );
//                    System.out.println("Lastname: " + m.group("lastname") );
//                    System.out.println("Email: " + m.group("email") );

                    Person person = new Person(m.group("firstname"), m.group("lastname"), m.group("email"));
                    people.add(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long nioTime = System.nanoTime() - start;

        people.forEach(System.out::println);
        */


        /*
        start = System.nanoTime();
        try {
            File file = new File("person.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                Matcher m = REGEX.matcher(myReader.nextLine());

                if (m.find( )) {
                    System.out.println("Firstname: " + m.group("firstname") );
                    System.out.println("Lastname: " + m.group("lastname") );
                    System.out.println("Email: " + m.group("email") );
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        long scnTime = System.nanoTime() - start;

        System.out.printf("NIO is faster: %.3f", scnTime / (double)nioTime);

         */
    }
}
