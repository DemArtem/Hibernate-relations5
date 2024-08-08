package org.itstep.many_to_many_uni;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "author")
@NoArgsConstructor
public class Author implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

/*
    @ManyToMany(mappedBy = "author")
    private Set<Book> books;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Author [id=" + id + ", name=" + name + "]\n");
        books.stream().forEach(book -> result.append("\t" + book.toString() + "\n"));
        return result.toString();
    }
*/

} 