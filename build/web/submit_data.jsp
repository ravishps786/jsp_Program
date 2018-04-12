<%@ page import="java.sql.*"%>
<%
    try{
	String usern=request.getParameter("uname");
	String passw=request.getParameter("pword");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=null;
	Statement stmt=null;
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","root");
	stmt=con.createStatement();
	String sql="insert into sign_up value('"+usern+"','"+passw+"')";
	
	stmt.executeUpdate(sql);
        out.println("Data Added Successfully");
	response.setHeader("Refresh","5;url=index.html");
}catch(Exception e)
{
	out.println("data not stored"+" "+e.getMessage());
}
%>