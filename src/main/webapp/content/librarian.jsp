<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>WebLibrary</title>
    <script type="text/javascript" src="content/js/ajax.js"></script>
</head>
<body>
    <input id="libraryName" name="libraryName" type="text" placeholder="Введите название библиотеки"/><br/>
    <input id="bookName" name="bookName" type="text" placeholder="Введите название книги"/><br/>
    <input id="readerId" name="readerId" type="text" placeholder="Введите id читателя"/><br/>
    <!--<input id="author" name="author" type="text" placeholder="Введите автора"/>-->
    <input id="give" name="give" type="button" value="Выдать книгу" onclick="loadXml(give)"/>
    <input id="take" name="take" type="button" value="Принять книгу" onclick="loadXml(take)"/>
    <input id="history" name="history" type="button" value="Просмотреть историю" onclick="loadXml(history)"/>

<!--
    <table>
            <tr>
                <td></td>
            </tr>
        </table>
        -->

</body>
</html>
