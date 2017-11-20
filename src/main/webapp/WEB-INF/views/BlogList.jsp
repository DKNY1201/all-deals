<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	<script>
        $( function() {
            $( "#accordion" ).accordion();
        } );
	</script>


<div id="accordion">
	<c:forEach var="blogArticle" items="${blogArticleList}">
	<h3><a href="blogDetails">${blogArticle.title}</a></h3>
	<div>
		<p>
			${blogArticle.description}
		</p>
	</div>
	</c:forEach>
