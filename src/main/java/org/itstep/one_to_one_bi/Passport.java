package org.itstep.one_to_one_bi;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String country;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    Person person;

    @Override
    public String toString() {
        return "Passport [id=" + id + ", number=" + number + "]\n" +
                "\tPerson [id=" + id + ", firstName=" + person.getFirstName() + "]";
    }
} 