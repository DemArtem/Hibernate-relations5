package org.itstep.one_to_many_unit;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Data
@Table(name = "phone")
public class Phone {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    //private Subscriber subscriber;

    @Override
    public String toString() {
        return "Phone [id=" + id + ", number=" + number + "]";
    }
} 