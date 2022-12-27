import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Page:");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book newBook = new Book(title, pages, publicationYear);
            books.add(newBook);
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        for (Book book : books) {
            if (input.equals("everything")) {
                System.out.println(book);
            } else if (input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
