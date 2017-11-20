package com.alldeals.domain;

import com.mysql.jdbc.Blob;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "blogArticle")
public class BlogArticle implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "blogarticle_id")
    private int id;

    @NotBlank(message = "{NotBlank.validation}")
    private String title;

    @NotBlank
    @Size(min = 500, message = "{Size.blogContent}")
    @Column(columnDefinition = "text")
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDate;

    @JsonIgnore
    @Transient
    private MultipartFile blogPhoto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "blog_cat_id")
    private BlogCategory blogCategory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User contributor;

    private Boolean isFeature;
    private Boolean isFrontPage;


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public MultipartFile getBlogPhoto() {
        return blogPhoto;
    }

    public void setBlogPhoto(MultipartFile blogPhoto) {
        this.blogPhoto = blogPhoto;
    }

    public BlogCategory getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }

    public User getContributor() {
        return contributor;
    }

    public void setContributor(User contributor) {
        this.contributor = contributor;
    }

    public Boolean getFeature() {
        return isFeature;
    }

    public void setFeature(Boolean feature) {
        isFeature = feature;
    }

    public Boolean getFrontPage() {
        return isFrontPage;
    }

    public void setFrontPage(Boolean frontPage) {
        isFrontPage = frontPage;
    }
}