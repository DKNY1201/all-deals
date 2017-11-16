package com.alldeals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Bi on 11/16/17.
 */
@Entity(name = "deal")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
