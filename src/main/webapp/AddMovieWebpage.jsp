<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>

    <title>Adding Movie</title>
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

<form action="AddMovieWebpage?action=AddMovie">

    <div id="fields">
        <b>Title</b> : <input type="text"><br>
        <b>Director : </b><input type="text"><br>
        <b>Actors : </b><input type="text"><br>
        <b>Publishing Date : </b><input type="Date"><br>
    </div>


    <button id="add_btn" type="submit">Add</button>
</form>

</body>

</html>



