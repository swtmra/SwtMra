<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>

    <title>Registration</title>
    <style>
        #fields{
            color:grey;
        }

        #submit_btn{
            color:green;
        }
    </style>


</head>

<body>

<h1>Registration</h1>


        <button id="browse_btn" type="submit">Browse Movies</button>
    <a href="moviesOverview?uname=${uname}&age=${age}&email=${email}">
        <button id="add_btn" type="submit">Add Movie</button>
    </a>


</body>

</html>



