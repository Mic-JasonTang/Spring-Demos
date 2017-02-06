<%@page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>upload page</title>
    <link type="text/css" href="assets/js/style.css">
</head>
<body>
    <div>
        <form action="upload" enctype="multipart/form-data" method="post">
            <input type="file" name="file"/>
            <input type="submit" value="submit"/>
        </form>
    </div>
</body>
</html>
