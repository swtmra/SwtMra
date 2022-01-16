<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Movies Overview</title>
    <style>
        #container{
            border:3.5px dashed green;
            padding:15px;
            width:350px;
            margin:10px;
            box-sizing:content-box;
        }
        h1{
            color:green;
        }
    </style>
</head>

<body>
<h1>Movies</h1>
<div>

    <c:forEach items="${movies}" var="movie">
        <div id = "container">
            <div><b>Title</b> :<c:out value="${movie.getTitle()}" /></div>
            <div><b>Director</b> :<c:out value="${movie.getDirector()}" /></div>
            <div><b>Actors</b> : <c:out value="${movie.getActors()}" /></div>
            <div><b>Average Rating</b> :  <c:out value="${movie.getAvgRating()}" /></div>
            <div><b>Publishing Date</b> :<c:out value="${movie.getPublishingDate()}" /></div>
        </div>
    </c:forEach>

</div>




</body>
</html>
