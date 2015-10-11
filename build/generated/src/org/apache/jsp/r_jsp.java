package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class r_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String a,b,c;
    
 String n;
    
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"css/table.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<link href=\"css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.9.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.nivo.slider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(window).load(function() {\r\n");
      out.write("        $('#slider').nivoSlider();\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t <div class=\"headertop_desc\">\r\n");
      out.write("\t\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t\t<div class=\"nav_list\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"account_desc\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"available.jsp\">Available movies</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"common.jsp\">Common Users</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"rated.jsp\">Movies Rated</a></li>\r\n");
      out.write("                                                        <li><a href=\"abc.jsp\">Recommend Me</a></li>\r\n");
      out.write("                                                        <li><a href=\"rate.jsp\">Rate Movies</a></li>\r\n");
      out.write("                                                        <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                                                        <li><a href=\"logout\">Logout</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("  \t  \t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t\t<div class=\"header_top\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo1.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"header_top_right\">\r\n");
      out.write("\t\t          <div class=\"search_box\">\r\n");
      out.write("\t\t\t\t\t     \t\t\r\n");
      out.write("\t\t\t\t\t     \t</div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t <div class=\"clear\"></div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("    ");
  
          
        //n=(String)session.getAttribute("uname"); 
        
      out.write("\r\n");
      out.write("     \r\n");
      out.write("        ");
 
           

       String connectionURL = "jdbc:mysql://localhost:3306/movielens";
       Connection conn;
        Statement stmt;
        ResultSet rs;
      conn = DriverManager.getConnection (connectionURL,"root","");
       stmt = conn.createStatement();
        rs = stmt.executeQuery("select movies.id,movies.title,movies.release_date from movies,ratings,users where movies.id=ratings.movie_id  and ratings.user_id=users.id and users.id=1 order by movies.id");
        
      out.write("<table class=\"myTable\">\r\n");
      out.write("<thead>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>User Id</th>\r\n");
      out.write("<th>Moive rated</th>\r\n");
      out.write("<th>Movie id</th>\r\n");
      out.write("</tr>\r\n");
      out.write("</thead>");

        while(rs.next()){
             a = rs.getString("movies.id");
             b = rs.getString("movies.title");
             c = rs.getString("movies.release_date");
             
             
      out.write("<tbody><tr>\r\n");
      out.write("             <td>");
      out.print(a);
      out.write("</td>\r\n");
      out.write("             <td>");
      out.print(b);
      out.write("</td>\r\n");
      out.write("             <td>");
      out.print(c);
      out.write("</td> \r\n");
      out.write("             </tr></tbody>\r\n");
   
        }
        
      out.write("</table>\r\n");
      out.write("         \r\n");
      out.write("      \r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("   \t  <div class=\"wrap\">\r\n");
      out.write("\t     <div class=\"section group\">\r\n");
      out.write("\t\t\t\t<div class=\"col span\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Information</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col span\">\r\n");
      out.write("\t\t\t\t\t<h4>Know us better</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Site Map</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Search Terms</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col span\">\r\n");
      out.write("\t\t\t\t\t<h4>Contact</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><span>9971825755</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><span>8130527232</span></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Follow Us</h4>\r\n");
      out.write("\t\t\t\t\t   \t\t  <ul>\r\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/facebook.png\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/twitter.png\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/skype.png\" alt=\"\" /> </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"> <img src=\"images/linkedin.png\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t      <div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t     </ul>\r\n");
      out.write("   \t \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t <div class=\"copy_right\">\r\n");
      out.write("\t\t\t\t<p>Company Name © All rights Reseverd </p>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("    <a href=\"#\" id=\"toTop\"><span id=\"toTopHover\"> </span></a>\r\n");
      out.write("</body>\r\n");
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
