package ex_002_insert_and_update;

import ex_002_insert_and_update.entity.Author;

/**
 * Created by Asus on 04.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        Author author = new Author();
        author.setName("Michael");
        author.setLastName("Bulgakov");

        ah.addAuthor(author);



//        Author author2 = ah.getAuthorById(2);
//        System.out.println(author2);
//
//        author2.setLastName("Alexander");
//        ah.addAuthor(author2);
//
//
//        ah.addAuthor(null);

    }

}
