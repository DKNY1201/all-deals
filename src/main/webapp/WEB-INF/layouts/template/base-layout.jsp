<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../../../favicon.ico">

	<title><tiles:insertAttribute name="title" /></title>

	<!-- Bootstrap core CSS -->

	<link href="<c:url value="/resources/css/bootstrap.min.css"></c:url>" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="<c:url value="/resources/css/style.css"></c:url>" rel="stylesheet">
</head>
<body>
	<%--<section class="container">--%>
		<%--<div class="pull-right" style="padding-right: 50px">--%>
			<%--<a href="?language=en">English</a>|<a href="?language=nl">Dutch</a> --%>
			<%--<a href="<c:url value="/logout"/>">Logout</a>--%>
		<%--</div>--%>
	<%--</section>--%>
	<tiles:insertAttribute name="navigation" />
	<tiles:insertAttribute name="content" />
	<tiles:insertAttribute name="footer" />
</body>
</html>