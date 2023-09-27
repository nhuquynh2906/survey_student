<%-- 
    Document   : thanks
    Created on : Sep 15, 2023, 11:09:50 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for your respone!</h1>
    <p>here is the information that you entered: </p>
    <label>Email:</label>
    <span> ${user.email}</span><br>
    <label>First Name:</label>
    <span> ${user.firstName}</span><br>
    <label>Last Name:</label>
    <span> ${user.lastName}</span><br>
    <label>Date of Birth:</label>
    <span> ${user.dateofBirth}</span><br>
    <label>how did you hear about us:</label>
    <span> ${user.heardFrom}</span><br>
    <label>would you like to receive announcements about new CDs and special offers:</label>
    <span> ${user.receiveAnnouce}</span><br>
    <label>please contact me by:</label>
    <span> ${user.contactBy}</span><br>
    
    <p> to enter another email address, click on the Back button in your browser or the return button shown below.</p>
    <form action="" method="get">
        <input type="hidden" name ="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>  


</html>
