package LAB5.run;

import LAB5.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import java.util.List;

public class BookHelper {
    private SessionFactory sessionFactory;

    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Book> getBookList() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root);

        Query query = session.createQuery(cq);
        List<Book> bookList = query.getResultList();
        session.close();
        return bookList;
    }

    public Book addBook(Book book){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
        return book;
    }

    public void updateYear(Book book) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Book bk = session.get(Book.class, book.getId());
        bk.setId(book.getId());
        bk.setName(book.getName());
        bk.setAuthorId(book.getAuthorId());
        bk.setPublicYear(book.getPublicYear());
        session.save(bk);
        session.getTransaction().commit();
        session.close();
    }

    public List<Book> getSelection() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        Selection[] selections = {root.get("name"), root.get("publicYear")};
        cq.select(cb.construct(Book.class, selections));
        Query query = session.createQuery(cq);
        return query.getResultList();
    }
}
