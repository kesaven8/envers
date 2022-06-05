package com.learnSpring.envers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Audited
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person extends Audit {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String surname;
}
