<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Update</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <div class="enter">
        <form method='post'>
            <h3>Enter your username and new password</h3>
            Enter User Name:<input type="text" name="uname"><br>
            New password:<input type="password" name="pword">
            <input type="submit" value="Submit">
        </form>
    <%
    try{
        String usern=request.getParameter("uname");
        String pword=request.getParameter("pword");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","root");
        Statement stmt=con.createStatement();
        String updt="UPDATE sign_up SET pword='"+pword+"' WHERE uname='"+usern+"'";        
        stmt.executeUpdate(updt);        
    }catch(Exception e)
    {
        out.println(e.getMessage());
    }
    %>
        </div>
    </body>
</html>
