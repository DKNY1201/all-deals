package com.alldeals.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Bi on 11/17/17.
 */
@Entity(name = "deal_cat")
public class DealCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deal_cat_id")
    private int id;

//    @NotEmpty(message = "{NotEmpty.validation}")
    @Column(name = "deal_cat_name")
    private String name;

    private String description;

//    @OneToMany(cascade = CascadeType.ALL)
//    @Fetch(FetchMode.JOIN)
//    @JoinTable(name = "deal_cat_deal")
//    private List<Deal> deal;
//
//    public List<Deal> getDeal() {
//        return deal;
//    }
//
//    public void setDeal(List<Deal> deal) {
//        this.deal = deal;
//    }

    public DealCategory() {
    }

    public DealCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
