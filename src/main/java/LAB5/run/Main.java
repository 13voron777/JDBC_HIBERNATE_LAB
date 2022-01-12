package LAB5.run;

import LAB5.entity.Book;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookHelper bh = new BookHelper();

        // 1
        Book book1 = new Book();
        book1.setName("Mtsyri");
        book1.setAuthorId(10);
        bh.addBook(book1);

        Book book2 = new Book();
        book2.setName("Zolotaya rybka");
        book2.setAuthorId(11);
        bh.addBook(book2);

        // 2
        Book book3 = new Book();
        book3.setName("Captain's daughter");
        book3.setAuthorId(11);
        book3.setPublicYear(1836);
        bh.addBook(book3);

        // 3
        List<Book> books = bh.getBookList();
        for (Book book : books) {
            System.out.println(book.getId() + " \t" + book.getName()
            + " \t" + book.getAuthorId());
        }

        // 4
        Book book4 = books.get(0);
        Book book5 = books.get(1);
        System.out.println(book4.getName());
        System.out.println(book5.getName());
        book4.setPublicYear(1840);
        book5.setPublicYear(1833);
        bh.updateYear(book4);
        bh.updateYear(book5);

        // 5
        List<Book> bookSelect = bh.getSelection();
        for (Book book : bookSelect) {
            System.out.println(book.getName() + " " + book.getPublicYear());
        }
    }
}
