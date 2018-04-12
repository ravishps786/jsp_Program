package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>View Database</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"enter\">\n");
      out.write("        <h3 align=\"center\">Enter your data</h3>\n");

    try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","root");  
        Statement stmt=con.createStatement();
        String QueryString = "select * from sign_up";
        ResultSet rs=stmt.executeQuery(QueryString);  

      out.write("\n");
      out.write("    <form id=\"myForm\">\n");
      out.write("<table>\n");
      out.write("    <tr id=\"heading\">\n");
      out.write("        <td style=\"font-size: 10\">Select All<input type=\"checkbox\" onclick=\"check()\" id=\"checkb\"></td>\n");
      out.write("        <td>User Name</td>\n");
      out.write("        <td>Password</td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("        ");

while(rs.next()) 
{
      out.write("\n");
      out.write("\n");
      out.write("\t<tr  name=\"lists\">\n");
      out.write("            <td><input type=\"checkbox\" id=\"myCheck\" name=\"checkBox\" value=\"checka\"></td>\n");
      out.write("\t<td id=\"uname\" name=\"uid\">");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
 }
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<tr><td colspan=\"3\" style=\"text-align:right\"><button id=\"del\" value=\"delete\" style=\"background-color: aqua\" onclick=\"deleteIt()\">Delete</button></td></tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("            </form>\n");
      out.write("      <p id=\"demo\"></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("<script>\n");
      out.write("    function deleteIt()\n");
      out.write("{\n");
      out.write("    var i=1;\n");
      out.write("    var b=document.getElementById(\"myForm\").length;\n");
      out.write("    var unm;\n");
      out.write("    do\n");
      out.write("    {\n");
      out.write("    var chq=i*3;\n");
      out.write("    var a=document.getElementsByTagName(\"input\")[i].checked;\n");
      out.write("    if(a===true)\n");
      out.write("    {\n");
      out.write("        unm=document.getElementsByTagName(\"td\")[chq+1].innerHTML;\n");
      out.write("        document.getElementById(\"myCheck\").value=unm;\n");
      out.write("    }\n");
      out.write("    else if(a===false)\n");
      out.write("        {\n");
      out.write("        i++;\n");
      out.write("    }\n");
      out.write("    }while(i<=b)\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"selectAll.js\"></script>\n");
      out.write("\n");
      out.write("\n");
con.close();  
}catch(Exception e)
{ System.out.println(e);
}  
 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
