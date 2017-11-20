//package com.alldeals.domain;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Bi on 11/17/17.
// */
//@Entity(name = "blog_cat")
//public class BlogCategory {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "blog_cat_id")
//    private int id;
//
//    @Column(name = "blog_cat_name")
//    private String name;
//
//    @Column(name="description", columnDefinition="TEXT")
//    private String description;
//
//    @OneToMany(
//            mappedBy = "blogCategory",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER,
//            orphanRemoval = true
//    )
//    private List<Blog> blogs = new ArrayList<>();
//
//    public BlogCategory() {
//    }
//
//    public BlogCategory(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public List<Blog> getBlogs() {
//        return blogs;
//    }
//
//    public void setBlogs(List<Blog> blogs) {
//        this.blogs = blogs;
//    }
//}
