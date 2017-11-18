package com.alldeals.domain;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Bi on 11/16/17.
 */
@Entity(name = "deal")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deal_id")
    private Long id;

    @NotEmpty(message = "{NotEmpty.validation}")
    @URL
    private String dealUrl;

    @NotEmpty(message = "{NotEmpty.validation}")
    private String dealTitle;

    @Min(value=0, message="{Min.Deal.unitPrice.validation}")
    @Digits(integer=8,fraction=2, message="{Digits.Deal.unitPrice.validation}")
    @NotNull(message= "{NotNull.validation}")
    private BigDecimal price;

    private Date postDate;

    @NotEmpty(message = "{NotEmpty.validation}")
    @Column(name="description", columnDefinition="TEXT")
    private String description;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deal_cat_id", nullable = false)
    private DealCategory dealCategory;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @JsonIgnore
    @Transient
    @NotNull(message = "{NotNull.validation}")
    private MultipartFile dealImage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDealUrl() {
        return dealUrl;
    }

    public void setDealUrl(String dealUrl) {
        this.dealUrl = dealUrl;
    }

    public String getDealTitle() {
        return dealTitle;
    }

    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DealCategory getDealCategory() {
        return dealCategory;
    }

    public void setDealCategory(DealCategory dealCategory) {
        this.dealCategory = dealCategory;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @XmlTransient
    public MultipartFile getDealImage() {
        return dealImage;
    }

    public void setDealImage(MultipartFile dealImage) {
        this.dealImage = dealImage;
    }
}
