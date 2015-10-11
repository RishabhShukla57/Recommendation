package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Random;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import java.util.List;
import java.io.File;
import java.util.HashMap;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class newusersrev_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int x=1;
String a=null,b=null,c=null;
 Connection conn = null;
   Statement stmt = null;
   
        
        ResultSet rs;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<head>\n");
      out.write("    <link href=\"css/table.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<link href=\"css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.9.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.nivo.slider.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(window).load(function() {\n");
      out.write("        $('#slider').nivoSlider();\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                           \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t <div class=\"headertop_desc\">\n");
      out.write("\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t<div class=\"nav_list\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"account_desc\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t<li><a href=\"available.jsp\">Available movies</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"check.jsp\">Recommend Movies</a></li>\n");
      out.write("                                                        <li><a href=\"social.jsp\">Social Groups</a></li>\n");
      out.write("                                                        <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t  \t</div>\n");
      out.write("  \t  \t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t<div class=\"header_top\">\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo1.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"header_top_right\">\n");
      out.write("\t\t          <div class=\"search_box\">\n");
      out.write("\t\t\t\t\t     \t\t<form>\n");
      out.write("\t\t\t\t\t     \t\t\t<input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\"><input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t     \t\t</form>\n");
      out.write("\t\t\t\t\t     \t</div>\n");
      out.write("\t\t\t\t\t     <div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t <div class=\"clear\"></div>\n");
      out.write("  \t\t</div>\n");
      out.write("\t");
Class.forName("com.mysql.jdbc.Driver");
      out.write("\t\t\t\n");
      out.write("   ");
                  String connectionURL = "jdbc:mysql://localhost:3306/movielens";
       
      
       
      out.write("<table class=\"myTable\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th>MOVIES</th>\n");
      out.write("<th>RELEASE DATE</th>\n");
      out.write("<th>SELECT</th>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("       ");

      conn = DriverManager.getConnection (connectionURL,"root","");
       stmt = conn.createStatement();
        rs = stmt.executeQuery("select id,title,release_date from movies");
        
             while(rs.next() && x<35){
            // a = rs.getString("id");
                
             b = rs.getString("title");
              c= rs.getString("release_date");
             
            
      out.write("<tbody><tr>\n");
      out.write("                    \n");
      out.write("             <td>");
      out.print(b);
      out.write("</td>\n");
      out.write("             <td>");
      out.print(c);
      out.write("</td>\n");
      out.write("             <td><form><input type=\"checkbox\"></form></td>\n");
      out.write("             </tr></tbody>    \n");
      out.write("            \n");
      out.write("                 ");

                 x++;
             }
      rs.close();
      stmt.close();
       
      out.write(" </table>\n");
      out.write("       <form action=\"newuser.jsp\" method=\"get\"><input type=\"submit\"></form>\n");
      out.write("       <div class=\"footer\">\n");
      out.write("   \t  <div class=\"wrap\">\n");
      out.write("\t     <div class=\"section group\">\n");
      out.write("\t\t\t\t<div class=\"col span\">\n");
      out.write("\t\t\t\t\t\t<h4>Information</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Customer Service</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Advanced Search</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Orders and Returns</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col span\">\n");
      out.write("\t\t\t\t\t<h4>Know us better</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Customer Service</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Site Map</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Search Terms</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col span\">\n");
      out.write("\t\t\t\t\t<h4>Contact</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><span>9971825755</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li><span>8130527232</span></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"social-icons\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Follow Us</h4>\n");
      out.write("\t\t\t\t\t   \t\t  <ul>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/facebook.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/twitter.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/skype.png\" alt=\"\" /> </a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"> <img src=\"images/linkedin.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t     \n");
      out.write("\t\t\t\t\t\t     </ul>\n");
      out.write("   \t \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t <div class=\"copy_right\">\n");
      out.write("\t\t\t\t<p>Company Name © All rights Reseverd </p>\n");
      out.write("\t\t   </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("    <a href=\"#\" id=\"toTop\"><span id=\"toTopHover\"> </span></a>\n");
      out.write("                        </div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
