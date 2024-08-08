package org.itstep.many_to_one_bi;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Post [id=" + id + ", content=" + content + "]\n");
        
comments.stream
().forEach(comment -> result.append("\t" + comment.toString() + "\n"));
        return result.toString();
    }

} 