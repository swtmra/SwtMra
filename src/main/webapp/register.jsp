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

<form action="registeredUserWebpage">

    <div id="fields">
        <b>username</b> : <input type="text"><br>
        <b>age : </b><input type="number"><br>
        <b>email : </b><input type="text"><br>
    </div>


    <button id="submit_btn" type="submit">Submit</button>
</form>

</body>

</html>



