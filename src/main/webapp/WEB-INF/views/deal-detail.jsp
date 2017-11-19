<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="deal-detail inner-wrapper">
    <h1 class="deal-title">
        ${deal.dealTitle}
    </h1>
    <div class="deal-content row">
        <div class="col-lg-6">
            <div class="price">
                Price: $${deal.price}
            </div>
            <div class="view-comment">
                219,691 Views | 940 Comments
            </div>
            <div class="description">
                ${deal.description}
            </div>
        </div>
        <div class="col-lg-6">
            <div class="image">
                <img class="img-fluid" src="<c:url value="/img/deals/${deal.dealTitle}"></c:url>.jpg" alt="${deal.dealTitle}">
            </div>
            <a class="btn btn-success btn-lg btn-block see-deal-btn" href="<spring:url value="${deal.dealUrl}"/>" target="_blank">See Deal</a>
            <div class="user">
                <img class="profile-image-thumb" src="<c:url value="/img/users/${deal.user.email}"></c:url>.jpg" width="20px">
                <p>${deal.user.firstName} ${deal.user.lastName} posted this deal.</p>
            </div>
        </div>
    </div>
</div>
