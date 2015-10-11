package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class takereview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.9.0.min.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("\t\t <div class=\"headertop_desc\">\n");
      out.write("\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t<div class=\"nav_list\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"account_desc\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"preview.html\">Recommended Movies</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
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
      out.write("\t\t\t\t\t     \t\t\n");
      out.write("\t\t\t\t\t     \t</div>\n");
      out.write("\t\t\t\t\t     <div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t   <div class=\"clear\"></div>\n");
      out.write("  \t\t    </div>     \t\t\t\t\n");
      out.write("   \t\t</div>\n");
      out.write("   </div>\n");
      out.write(" <div class=\"main\">\n");
      out.write(" \t<div class=\"wrap\">\n");
      out.write("     <div class=\"content\">\n");
      out.write("     \t<div class=\"content_top\">\n");
      out.write("    \t\t<div class=\"back-links\">\n");
      out.write("    \t\t<p><a href=\"index.html\">Home</a> &gt;&gt;&gt;&gt; <a href=\"#\" class=\"active\">Contact</a></p>\n");
      out.write("    \t    </div>\n");
      out.write("    \t\t<div class=\"clear\"></div>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"section group\">\n");
      out.write("\t\t\t\t<div class=\"col span_2_of_3\">\n");
      out.write("\t\t\t\t  <div class=\"contact-form\">\n");
      out.write("\t\t\t\t  \t<h2>Contact Us</h2>\n");
      out.write("\t\t\t\t\t    <form method=\"get\" action=\"rev\">\n");
      out.write("\t\t\t\t\t    \t<div>\n");
      out.write("\t\t\t\t\t\t    \t<span><label>Name</label></span>\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"userName\" type=\"text\" class=\"textbox\" ></span>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t    <div>\n");
      out.write("\t\t\t\t\t\t    \t<span><label>E-mail</label></span>\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"userEmail\" type=\"text\" class=\"textbox\"></span>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t    <div>\n");
      out.write("\t\t\t\t\t\t     \t<span><label>Company Name</label></span>\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"userPhone\" type=\"text\" class=\"textbox\"></span>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t    <div>\n");
      out.write("\t\t\t\t\t\t    \t<span><label>Subject</label></span>\n");
      out.write("\t\t\t\t\t\t    \t<span><textarea name=\"userMsg\"> </textarea></span>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t   <div>\n");
      out.write("\t\t\t\t\t\t   \t\t<span><input type=\"submit\" value=\"Submit\"  class=\"mybutton\"></span>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t    </form>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("  \t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col span_1_of_3\">\n");
      out.write("\t\t\t\t\t<div class=\"contact_info\">\n");
      out.write("    \t \t\t\t\t<h2>Find Us Here</h2>\n");
      out.write("\t\t\t\t\t    \t  <div class=\"map\">\n");
      out.write("\t\t\t\t\t\t\t   \t    <iframe width=\"100%\" height=\"175\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed\"></iframe><br><small><a href=\"https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265\" style=\"color:#888;text-align:left;font-size:0.85em\">View Larger Map</a></small>\n");
      out.write("\t\t\t\t\t\t\t  </div>\n");
      out.write("      \t\t\t\t</div>\n");
      out.write("      \t\t\t<div class=\"company_address\">\n");
      out.write("\t\t\t\t     \t<h2>Information :</h2>\n");
      out.write("\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t   \t\t<p>Phone:(00) 222 666 444</p>\n");
      out.write("\t\t\t\t   \t\t<p>Fax: (000) 000 00 00 0</p>\n");
      out.write("\t\t\t\t \t \t<p>Email: <span><a href=\"#\">info(at)mycompany.com</a></span></p>\n");
      out.write("\t\t\t\t   \t\t<p>Follow on: <span><a href=\"#\">Facebook</a></span>, <span><a href=\"#\">Twitter</a></span></p>\n");
      out.write("\t\t\t\t   </div>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t  </div>\t\t\n");
      out.write("         </div> \n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("   <div class=\"footer\">\n");
      out.write("   \t  <div class=\"wrap\">\t\n");
      out.write("\t     <div class=\"section group\">\n");
      out.write("\t\t\t\t<div class=\"col span\">\n");
      out.write("\t\t\t\t\t\t<h4>Information</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col span\">\n");
      out.write("\t\t\t\t\t<h4>My account</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.html\">Sign In</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.html\">Help</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col span\">\n");
      out.write("\t\t\t\t\t<h4>Contact</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><span>+91-123-456789</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li><span>+00-123-000000</span></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"social-icons\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Follow Us</h4>\n");
      out.write("\t\t\t\t\t   \t\t  <ul>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/facebook.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/twitter.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"><img src=\"images/skype.png\" alt=\"\" /> </a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"#\" target=\"_blank\"> <img src=\"images/linkedin.png\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t      <div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t     </ul>\n");
      out.write("   \t \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t <div class=\"copy_right\">\n");
      out.write("\t\t\t\t<p>Company Name © All rights Reseverd </p>\n");
      out.write("\t\t   </div>\t\t\t\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("    <a href=\"#\" id=\"toTop\"><span id=\"toTopHover\"> </span></a>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
