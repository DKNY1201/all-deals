package com.alldeals.domain;

import javax.persistence.*;
import java.util.ArrayList;
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

    @Column(name = "deal_cat_name")
    private String name;

    @Column(name="description", columnDefinition="TEXT")
    private String description;

    @OneToMany(
            mappedBy = "dealCategory",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Deal> deals = new ArrayList<>();

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

    public List<Deal> getDeal() {
        return deals;
    }

    public void setDeal(List<Deal> deal) {
        this.deals = deal;
    }
}
