<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top">
        <a class="navbar-brand" href="<spring:url value="/" />">
            <img class="logo" src="<c:url value="/img/logo.png"></c:url>" alt="All Deals">
            all<span class="high-light">deals</span>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a href="<spring:url value="/market/products"/>" class="nav-link">Deals <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a href="<spring:url value="/market/products"/>" class="nav-link">Store</a>
                </li>
                <li class="nav-item">
                    <a href="<spring:url value="/market/products"/>" class="nav-link">Deal Alert</a>
                </li>
                <li class="nav-item">
                    <a href="<spring:url value="/market/products"/>" class="nav-link">Blog</a>
                </li>
            </ul>
            <form class="form-inline mt-2 mt-md-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a href="<spring:url value="/market/products"/>" class="nav-link">Login</a>
                </li>
                <li class="nav-item">
                    <a href="<spring:url value="/market/products"/>" class="nav-link">Logout</a>
                </li>
            </ul>
        </div>
    </nav>
</header>