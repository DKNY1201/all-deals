package com.alldeals.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "blogCategory")
public class BlogCategory implements Serializable{

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int blogCategoryId;

	@NotBlank @Size(min = 3, max=12,message="{Size.blogcategory}")
    @Column(name = "blog_cat_name")
    private String blogCategoryName;


    @OneToMany(mappedBy = "blogCategory", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, orphanRemoval = true)
    private List<BlogArticle> articles = new ArrayList<>();




    public long getBlogCategoryId() {

        return blogCategoryId;
    }

    public void setBlogCategoryId(int blogCategoryId) {

        this.blogCategoryId = blogCategoryId;
    }

    public String getBlogCategoryName() {

        return blogCategoryName;
    }

    public void setBlogCategoryName(String blogCategoryName) {

        this.blogCategoryName = blogCategoryName;
    }



    public List<BlogArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<BlogArticle> articles) {
        this.articles = articles;
    }
}
