//package com.alldeals.domain;
//
//import org.codehaus.jackson.annotate.JsonIgnore;
//import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.URL;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.persistence.*;
//import javax.validation.constraints.Digits;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.xml.bind.annotation.XmlTransient;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by Bi on 11/16/17.
// */
//@Entity(name = "blog")
//public class Blog implements Serializable{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "blog_id")
//    private Long id;
//
//    @NotEmpty(message = "{NotEmpty.validation}")
//    private String title;
//
//    @NotEmpty(message = "{NotEmpty.validation}")
//    @Column(name="content", columnDefinition="TEXT")
//    private String content;
//
//    private Date postDate;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "blog_cat_id")
//    private BlogCategory blogCategory;
//
//    @JsonIgnore
//    @Transient
//    private MultipartFile image;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    public Blog() {}
//    public Blog(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public Date getPostDate() {
//        return postDate;
//    }
//
//    public void setPostDate(Date postDate) {
//        this.postDate = postDate;
//    }
//
//    @XmlTransient
//    public MultipartFile getImage() {
//        return image;
//    }
//
//    public void setImage(MultipartFile image) {
//        this.image = image;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public BlogCategory getBlogCategory() {
//        return blogCategory;
//    }
//
//    public void setBlogCategory(BlogCategory blogCategory) {
//        this.blogCategory = blogCategory;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Blog)) return false;
//        return id != null && id.equals(((Blog) o).id);
//    }
//    @Override
//    public int hashCode() {
//        return 31;
//    }
//}
