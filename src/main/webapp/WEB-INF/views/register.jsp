<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="title"><spring:message code="register.title" /></h1>
<form:form modelAttribute="user">
    <div class="form-group">
        <label for="email"><spring:message code="label.email" /></label>
        <form:input class="form-control" id="email" placeholder="Enter email" path="email" />
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        <form:errors path="email" />
    </div>
    <div class="form-group">
        <label for="password">Password</label>]
        <form:password class="form-control" id="password" placeholder="Password" path="password" />
        <form:errors path="password" />
    </div>
    <div class="form-check">
        <label class="form-check-label">
            <input type="checkbox" class="form-check-input">
            Register
        </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>