<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class=" inner-wrapper blogDetails">
    <h1 class="blog-title">
        ${blogArticle.title}
    </h1>

    <div class="col-12 row">
        <hr>
        <div class="user col-sm-4">
            <img class="profile-image-thumb" src="<c:url value="/img/users/${blogArticle.user.email}"></c:url>.jpg" width="20px">

        </div>
        Published ${blogArticle.publishDate}<br> by ${blogArticle.user.firstname} ${blogArticle.user.lastname}
        <hr>
    </div>

    <div class="deal-detail">
        <div class="col-lg-12">
            <div class="image">
                <img class="img-fluid" src="<c:url value="/img/blog/${blogArticle.title}"></c:url>.jpg" alt="${blogArticle.title}">
            </div>
            <div class="font-weight-normal">
                ${blogArticle.content}
            </div>
            <div class="view-comment">
                219,691 Views | 940 Comments
            </div>

        </div>

    </div>
</div>

