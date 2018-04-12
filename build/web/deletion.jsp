<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head><title>Update</title></head>
    <body>
        <form method='post'>
            Enter your username to delete your database<br>
            Enter User Name:<input type="text" name="uname">
            <input type="submit" value="Submit">
        </form>
    <%
    try{
        String usern=request.getParameter("checkBox");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","root");
        Statement stmt=con.createStatement();
        String delt="DELETE FROM sign_up WHERE uname='"+usern+"'";        
        stmt.executeUpdate(delt);
        
    }catch(Exception e)
    {
        out.println(e.getMessage());
    }
    %>
    </body>
</html>
