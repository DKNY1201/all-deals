<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
    $( function() {
        $( "#tabs" ).tabs();
    } );
</script>
</head>
<div id="tabs">
	<ul>
		---${ empty blogArticleList}---
	<c:forEach varStatus="sta" var="article" items ="${blogArticleList}">
		<li><a href="#tabs-${sta.count}">${article}</a></li>
	</c:forEach>
	</ul>


	<div id="tabs-1">
		<p>Proin elit arcu, rutrum commodo, vehicula tempus, commodo a, risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris. Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem. Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo. Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat. Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.</p>
	</div>
	<div id="tabs-2">
		<p>Morbi tincidunt, dui sit amet facilisis feugiat, odio metus gravida ante, ut pharetra massa metus id nunc. Duis scelerisque molestie turpis. Sed fringilla, massa eget luctus malesuada, metus eros molestie lectus, ut tempus eros massa ut dolor. Aenean aliquet fringilla sem. Suspendisse sed ligula in ligula suscipit aliquam. Praesent in eros vestibulum mi adipiscing adipiscing. Morbi facilisis. Curabitur ornare consequat nunc. Aenean vel metus. Ut posuere viverra nulla. Aliquam erat volutpat. Pellentesque convallis. Maecenas feugiat, tellus pellentesque pretium posuere, felis lorem euismod felis, eu ornare leo nisi vel felis. Mauris consectetur tortor et purus.</p>
	</div>
	<div id="tabs-3">
		<p>Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.</p>
		<p>Duis cursus. Maecenas ligula eros, blandit nec, pharetra at, semper at, magna. Nullam ac lacus. Nulla facilisi. Praesent viverra justo vitae neque. Praesent blandit adipiscing velit. Suspendisse potenti. Donec mattis, pede vel pharetra blandit, magna ligula faucibus eros, id euismod lacus dolor eget odio. Nam scelerisque. Donec non libero sed nulla mattis commodo. Ut sagittis. Donec nisi lectus, feugiat porttitor, tempor ac, tempor vitae, pede. Aenean vehicula velit eu tellus interdum rutrum. Maecenas commodo. Pellentesque nec elit. Fusce in lacus. Vivamus a libero vitae lectus hendrerit hendrerit.</p>
	</div>
</div>

<%--<div class="inner-wrapper BlogList">--%>
	<%--<div class="row">--%>
		<%--<div class="col-lg-3">--%>
			<%--<div class="filters">--%>
				<%--<div class="filter">--%>
					<%--<h3 class="filter-title">--%>
						<%--Category--%>
					<%--</h3>--%>
					<%--<ul class="category-filter">--%>
						<%--<c:forEach items ="${blogArticles}" var="cat">--%>
							<%--<li><a href="<spring:url value="/blogCategory/blogArticles/${cat.id}"/>">${cat.name}</a></li>--%>
						<%--</c:forEach>--%>
					<%--</ul>--%>
				<%--</div>--%>
			<%--</div>--%>
		<%--</div>--%>
		<%--<div class="col-lg-9">--%>
			<%--<div class="row">--%>
				<%--<c:forEach items="${deals}" var="deal">--%>
					<%--<div class="col-lg-3">--%>
						<%--<div class="deal">--%>
							<%--<a href="<spring:url value="/deals/detail/${deal.id}"/>">--%>
								<%--<div class="image">--%>
									<%--<img class="img-fluid" src="<c:url value="/img/deals/${deal.dealTitle}"></c:url>.jpg" alt="${deal.dealTitle}">--%>
								<%--</div>--%>
								<%--<div class="store">${deal.store.name}</div>--%>
								<%--<div class="deal-title">${deal.dealTitle}</div>--%>
								<%--<div class="price-user">--%>
									<%--<div class="price">--%>
										<%--$${deal.price}--%>
									<%--</div>--%>
									<%--<div class="user">--%>
										<%--<img class="rounded-circle" src="<c:url value="/img/users/${deal.user.email}"></c:url>.jpg" width="20px" height="20px">--%>
									<%--</div>--%>
								<%--</div>--%>
								<%--<div class="comment"><i class="fa fa-commenting-o" aria-hidden="true"></i> 149</div>--%>
							<%--</a>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</c:forEach>--%>
			<%--</div>--%>
		<%--</div>--%>
	<%--</div>--%>
<%--</div>--%>