<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Форум: Тема и обсуждение</title>
</head>
<body>
<div class="p-3">
    <p>Тема: ${post.name}</p>
    <p>Описание: ${post.description}</p>
</div>
<div class="p-3">
    <form action="">
        <div>
            <label for="comment">Комментарий:</label>
        </div>
        <div>
            <textarea id="comment" name="comment" rows="3" cols="50"></textarea>
        </div>
        <div>
            <input type="button" value="Отправить">
        </div>
    </form>
</div>
</body>
</html>
