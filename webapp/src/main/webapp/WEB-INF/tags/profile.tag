<%@tag body-content="empty" %>
<%@attribute name="user" required="true" type="edu.web.User" %>
<table class="table table-condensed">
    <tr>
        <td>Name: </td>
        <td>${user.email}</td>
    </tr>

    <tr>
        <td>Email: </td>
        <td>${user.email}</td>
    </tr>

    <tr>
        <td>Avatar: </td>
        <td><img src="${user.avatarUrl}"/></td>
    </tr>
</table>