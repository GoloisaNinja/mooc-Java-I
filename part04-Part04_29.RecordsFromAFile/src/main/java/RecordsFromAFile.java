
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of file:");
        String file = scanner.nextLine();

        try {
            Scanner reader = new Scanner(Paths.get(file));
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] pieces = line.split(",");
                String name = pieces[0];
                int age = Integer.parseInt(pieces[1]);
                String yearOrYears = "years";
                if (age == 1) {
                    yearOrYears = "year";
                }
                System.out.println(name + ", age: " + age + " " + yearOrYears);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
