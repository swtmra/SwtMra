<!DOCTYPE HTML>
<html>
<head>
    <title>Movies Overview</title>
    <style>
        #new_btn{
            width:390px;
            height:40px;
            color:green;
            margin:10px;
            font-weight:bold;
        }
        #container{
            border:3.5px dashed green;
            padding:15px;
            width:350px;
            margin:10px;
            box-sizing:content-box;
        }
        #image{
            text-align:center;
            padding:15px;
        }
        #label{
            color: grey;
        }

        h1{
            color:green;
        }
    </style>
</head>

<body>
<h1>Movies</h1>
<div>

    <list movies as movie>
        <div id = "container">
            <div id="label1"><b>Title</b>  : ${movie.getTitle()}</div>
            <div id="label2"><b>Director</b>    : ${movie.getDirector()}</div>
            <div id="label3"><b>Actors</b> : ${movie.getActors()}</div>
            <div id="label4"><b>Average Rate</b> : ${movie.setAvgRating()}</div>
            <div id="label5"><b>Publishing Date</b> : ${movie.getPublishingDate()}</div>
        </div>
    </list>
</div>




</body>
</html>
