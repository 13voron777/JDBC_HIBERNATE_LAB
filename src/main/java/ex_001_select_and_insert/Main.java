package ex_001_select_and_insert;



import ex_001_select_and_insert.entity.Author;

import java.util.List;

/**
 * Created by Asus on 01.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();


        Author author = new Author();
        author.setName("Lermontov");

        ah.addAuthor(author);

        Author author2 = new Author();
        author2.setName("Pushkin");

        ah.addAuthor(author2);



//        List<Author> authors = ah.getAuthorList();
//
//        for (Author a : authors) {
//            System.out.println(a.getId() + " " + a.getName());
//        }
//
//
//        Author author3 = ah.getAuthorById(2);
//        System.out.println(author3);

    }

}
