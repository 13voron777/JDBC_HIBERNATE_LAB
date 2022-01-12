package LAB5.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;

@Entity
@DynamicInsert
@DynamicUpdate
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(name = "author_id")
    private long authorId;

    @Column(name = "public_year")
    private long publicYear;

    public Book() {
    }

    public Book(String name, long publicYear) {
        this.name = name;
        this.publicYear = publicYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getPublicYear() { return publicYear; }

    public void setPublicYear(long publicYear) { this.publicYear = publicYear; }
}