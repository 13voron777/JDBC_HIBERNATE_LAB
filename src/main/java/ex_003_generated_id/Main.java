package ex_003_generated_id;

import ex_003_generated_id.entity.Author;

/**
 * Created by Asus on 04.11.2017.
 */
public class Main {

    public static void main(String[] args) {
         AuthorHelper ah = new AuthorHelper();
         Author author = new Author("Taras");

         ah.addAuthor(author);
    }

}
