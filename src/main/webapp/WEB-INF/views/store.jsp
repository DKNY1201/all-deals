<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="inner-wrapper store">
    <div class="row">
        <div class="col-lg-3">
            <div class="filters">
                <div class="store-detail">
                    <h3 class="store-name">
                        <img class="img-fluid" src="<c:url value="/img/stores/${store.name}"></c:url>.png" alt="${store.name}">
                    </h3>
                    <div class="store-description">
                        ${store.description}
                    </div>
                </div>
                <div class="filter">
                    <h3 class="filter-title">
                        Related Stores
                    </h3>
                    <ul class="category-filter">
                        <c:forEach items="${stores}" var="store">
                            <li><a href="<spring:url value="/stores/${store.id}"/>">${store.name}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-lg-9">
            <div class="row">
                <c:forEach items="${deals}" var="deal">
                    <div class="col-lg-3">
                        <div class="deal">
                            <a href="<spring:url value="/deals/detail/${deal.id}"/>">
                                <div class="image">
                                    <img class="img-fluid" src="<c:url value="/img/deals/${deal.dealTitle}"></c:url>.jpg" alt="${deal.dealTitle}">
                                </div>
                                <div class="store">${deal.store.name}</div>
                                <div class="deal-title">${deal.dealTitle}</div>
                                <div class="price-user">
                                    <div class="price">
                                        $${deal.price}
                                    </div>
                                    <div class="user">
                                        <img class="rounded-circle" src="<c:url value="/img/users/${deal.user.email}"></c:url>.jpg" width="20px" height="20px">
                                    </div>
                                </div>
                                <div class="comment"><i class="fa fa-commenting-o" aria-hidden="true"></i> 149</div>
                            </a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
