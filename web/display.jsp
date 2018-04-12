<%@ page import="java.sql.*"%>
<html>
    <head>
        <title>View Database</title>
<link rel="stylesheet" type="text/css" href="newcss.css">
    </head>

<body>
    <div class="enter">
        <h3 align="center">Enter your data</h3>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","root");  
        Statement stmt=con.createStatement();
        String QueryString = "select * from sign_up";
        ResultSet rs=stmt.executeQuery(QueryString);  
%>
    <form id="myForm" action="deletion.jsp">
<table>
    <tr id="heading">
        <td style="font-size: 10">Select All<input type="checkbox" onclick="check()" id="checkb"></td>
        <td>User Name</td>
        <td>Password</td>
    </tr>

        <%
while(rs.next()) 
{%>

	<tr  name="lists">
            <td><input type="checkbox" id="myCheck" name="checkBox" value="checka"></td>
	<td id="uname" name="uid"><%=rs.getString(1)%></td>
	<td><%=rs.getString(2)%></td>
	</tr>

<% }%>

   
<tr><td colspan="3" style="text-align:right"><input type="submit" id="del" value="delete" style="background-color: aqua" onclick="deleteIt()"  value="delete"></td></tr>

</table>
            </form>
      <p id="demo"></p>


    </div>
<script>
    function deleteIt()
{
    var i=1;
    var b=document.getElementById("myForm").length;
    var unm;
    do
    {
    var chq=i*3;
    var a=document.getElementsByTagName("input")[i].checked;
    if(a===true)
    {
        unm=document.getElementsByTagName("td")[chq+1].innerHTML;
        document.getElementById("myCheck").value=unm;
    }
    else if(a===false)
        {
        i++;
    }
    }while(i<=b)
}
</script>

<script src="selectAll.js"></script>


<%con.close();  
}catch(Exception e)
{ System.out.println(e);
}  
 %>
</body>
</html>