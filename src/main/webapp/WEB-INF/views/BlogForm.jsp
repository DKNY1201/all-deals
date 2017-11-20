<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--<script>--%>
    <%--$( function() {--%>
        <%--$( "#datepicker" ).datepicker();--%>
    <%--} );--%>
<%--</script>--%>
<h1 class="title"><spring:message code="blog.title" /></h1>
<form:form modelAttribute="newBlog" method="POST" enctype="multipart/form-data">
    <div class="form-group">
        <label for="title"><spring:message code="label.title" /></label>
        <form:input class="form-control" id="title" placeholder="write blog title here" path="title" />
        
        <div class="error"><form:errors path="title" /></div>
    </div>
    <div class="form-group">
        <label for="title"><spring:message code="label.blogDescription" /></label>
        <form:input class="form-control" id="title" placeholder="write blog title here" path="title" />

        <div class="error"><form:errors path="title" /></div>
    </div>
        
        <div class="form-group col-md-12">
            <label for="content"><spring:message code="label.content" /></label>
            <form:textarea class="form-control" id="content" placeholder="The blog text will be here, not less than 500 words" path="content" />
            <div class="error">
            <form:errors path="content" />
            </div>
        </div>
    
    <div class="form-group">
        <label for="blogCategory"><spring:message code="label.blogCategory" /></label>
        <form:select path="blogCategory" multiple="false" type="text" class="form-control" id="category"
                    placeholder="---Select Category---"  >
                    <form:options items="${blogCategories}"/>
        </form:select>
        <div class="error"><form:errors path="blogCategory" /></div>
    </div>
    
        <div class="form-group">
            <label for="publishDate"><spring:message code="label.publishDate" /></label>
            <form:input type="date" class="form-control" id="publishDate" placeholder="mm/dd/yyyy" path="publishDate" />
            <div class="error"><form:errors path="publishDate" /></div>
        </div>

<div><a href="BlogList">List</a></div>
    <div class="form-group">
        <label for="blogPhoto"><spring:message code="label.blogPhoto" /></label>
        <form:input type="file" class="form-control" id="profile-picture" path="blogPhoto" />
        <div class="error"><form:errors path="blogPhoto" /></div>
    </div>
    <button type="submit" class="btn btn-primary"><spring:message code="Save" /></button>

</form:form>