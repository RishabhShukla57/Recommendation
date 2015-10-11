/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.stanford.nlp.io.IOUtils;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rishabh
 */
public class rev extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String a = request.getParameter("userMsg");
         
 
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE HTML>\n" +
"<head>\n" +
"<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n" +
"<link href=\"css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n" +
"<script type=\"text/javascript\" src=\"js/jquery-1.9.0.min.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"js/jquery.nivo.slider.js\"></script>\n" +
"<script type=\"text/javascript\">\n" +
"    $(window).load(function() {\n" +
"        $('#slider').nivoSlider();\n" +
"    });\n" +
"    <%! String n;\n" +
"    %>\n" +
"    <%  \n" +
"          \n" +
"        n=(String)session.getAttribute(\"uname\"); \n" +
"        %>\n" +
"    </script>\n" +
"</head>\n" +
"<body>\n" +
"	<div class=\"header\">\n" +
"		 <div class=\"headertop_desc\">\n" +
"			<div class=\"wrap\">\n" +
"				<div class=\"nav_list\">\n" +
"					\n" +
"				</div>\n" +
"				<div class=\"account_desc\">\n" +
"						<ul>\n" +
"							<li><a href=\"available.jsp\">Available movies</a></li>\n" +
"							<li><a href=\"takereview.jsp\">Review Movies</a></li>\n" +
"							<li><a href=\"rated.jsp\">Movies Rated</a></li>\n" +
"                                                        <li><a href=\"abc.jsp\">Recommend Me</a></li>\n" +
"                                                        \n" +
"                                                        <li><a href=\"contact.html\">Contact</a></li>\n" +
"                                                        <li><a href=\"logout\">Logout</a></li>\n" +
"                                                </ul>\n" +
"					</div>\n" +
"				<div class=\"clear\"></div>\n" +
"			</div>\n" +
"	  	</div>\n" +
"  	  		<div class=\"wrap\">\n" +
"				<div class=\"header_top\">\n" +
"					<div class=\"logo\">\n" +
"						<a href=\"index.html\"><img src=\"images/logo1.jpg\" alt=\"\" /></a>\n" +
"					</div>\n" +
"					<div class=\"header_top_right\">\n" +
"		          <div class=\"search_box\">\n" +
"					     		\n" +
"					     	</div>\n" +
"					     <div class=\"clear\"></div>\n" +
"					</div>\n" +
"						 \n" +
"			 <div class=\"clear\"></div>\n" +
"  		</div>\n" +
"				\n" +
"   \n" +
"\n" +
"\n" +
"");

             
            
           String line = "this book is too good to sleep";
Properties props = new Properties();
props.setProperty("annotators", "tokenize, ssplit, parse, sentiment, lemma");
StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
 

Annotation annotation = new Annotation(a);
 

pipeline.annotate(annotation);

 


annotation.toShorterString();
 

List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
 
if (sentences != null && !sentences.isEmpty()) {
for (int i = 0; i < sentences.size (); i++) {
CoreMap sentence = sentences.get(i);
Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
String sentimentName = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
//Class.forName("com.mysql.jdbc.Driver");
 
/*String connectionURL = "jdbc:mysql://localhost:3306/review";
       Connection conn;
        Statement stmt;
        ResultSet rs;
      conn = DriverManager.getConnection (connectionURL,"root","");
       stmt = conn.createStatement();
      // rs = stmt.executeQuery("");
      out.println();
 

*/







out.println("The sentence is:");
sentence.get(CoreAnnotations.TextAnnotation.class);

//out.println("Sentiment of \n> \""++"\"\nis: " + sentiment+" (i.e., "+sentimentName+")");
out.println(sentimentName+" "+sentiment);
if(sentimentName.equalsIgnoreCase("Negative")){
    final String negative = "negative";
    final String positive = "positive";
      
      final String nuetral = "nuetral";
      final String  verypositive = "very positive";
      final String verynegative = " very negative";
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

    //out.println("NOT");
    dataset.addValue( 0 , positive , positive );
      dataset.addValue( sentiment , negative , negative );
      dataset.addValue(0 , nuetral , nuetral );
      dataset.addValue( 0 , verynegative , verynegative );
      dataset.addValue( 0 , verypositive , verypositive );
      JFreeChart barChart = ChartFactory.createBarChart(
         "Movie Reviews", 
         "Ratings", "Sentiments", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File BarChart = new File("/home/rishabh/NetBeansProjects/minor/web/images/k.jpeg"); 
      ChartUtilities.saveChartAsJPEG(  BarChart , barChart , width , height );
      out.println("<img src=\"images/BarChart.jpeg\">");

   
}
else if(sentimentName.equalsIgnoreCase("Positive")){
    final String negative = "negative";
    final String positive = "positive";
      
      final String nuetral = "nuetral";
      final String  verypositive = "very positive";
      final String verynegative = " very negative";
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

   // out.println("Good");
    dataset.addValue(  sentiment , positive , positive );
      dataset.addValue( 0, negative , negative );
      dataset.addValue(0 , nuetral , nuetral );
      dataset.addValue( 0 , verynegative , verynegative );
      dataset.addValue( 0 , verypositive , verypositive );
      JFreeChart barChart = ChartFactory.createBarChart(
         "Movie Reviews", 
         "Ratings", "Sentiments", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File BarChart = new File("/home/rishabh/NetBeansProjects/minor/web/images/k.jpeg"); 
      ChartUtilities.saveChartAsJPEG(  BarChart , barChart , width , height );
      out.println("<img src=\"images/BarChart1.jpeg\">");
   
}     
else if(sentimentName.equalsIgnoreCase("Neutral")){
    final String negative = "negative";
    final String positive = "positive";
      
      final String nuetral = "nuetral";
      final String  verypositive = "very positive";
      final String verynegative = " very negative";
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

    //out.println("Good");
    dataset.addValue(  0 , positive , positive );
      dataset.addValue( 0, negative , negative );
      dataset.addValue(sentiment , nuetral , nuetral );
      dataset.addValue( 0 , verynegative , verynegative );
      dataset.addValue( 0 , verypositive , verypositive );
      JFreeChart barChart = ChartFactory.createBarChart(
         "Movie Reviews", 
         "Ratings", "Sentiments", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File BarChart = new File("/home/rishabh/NetBeansProjects/minor/web/images/k.jpeg"); 
      ChartUtilities.saveChartAsJPEG(  BarChart , barChart , width , height );

   out.println("<img src=\"images/BarChart2.jpeg\">");
}     
else if(sentimentName.equalsIgnoreCase("Very Positive")){
    final String negative = "negative";
    final String positive = "positive";
      
      final String nuetral = "nuetral";
      final String  verypositive = "very positive";
      final String verynegative = " very negative";
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

    //out.println("Good");
    dataset.addValue(  0 , positive , positive );
      dataset.addValue( 0, negative , negative );
      dataset.addValue(0 , nuetral , nuetral );
      dataset.addValue( 0 , verynegative , verynegative );
      dataset.addValue( sentiment , verypositive , verypositive );
      JFreeChart barChart = ChartFactory.createBarChart(
         "Movie Reviews", 
         "Ratings", "Sentiments", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File BarChart = new File("/home/rishabh/NetBeansProjects/minor/web/images/k.jpeg"); 
      ChartUtilities.saveChartAsJPEG(  BarChart , barChart , width , height );
out.println("<img src=\"images/BarChart4.jpeg\">");
   
}     
else if(sentimentName.equalsIgnoreCase("Very Negative")){
    final String negative = "negative";
    final String positive = "positive";
      
      final String nuetral = "nuetral";
      final String  verypositive = "very positive";
      final String verynegative = " very negative";
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

    //out.println("Good");
    dataset.addValue(  0 , positive , positive );
      dataset.addValue( 0, negative , negative );
      dataset.addValue(0 , nuetral , nuetral );
      dataset.addValue( sentiment , verynegative , verynegative );
      dataset.addValue( 0 , verypositive , verypositive );
      JFreeChart barChart = ChartFactory.createBarChart(
         "Movie Reviews", 
         "Ratings", "Sentiments", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File BarChart = new File("/home/rishabh/NetBeansProjects/minor/web/images/k.jpeg"); 
      ChartUtilities.saveChartAsJPEG(  BarChart , barChart , width , height );

   out.println("<img src=\"images/BarChart3.jpeg\">");
}     



      


      

      





}
}


 


   out.println("<div class=\"footer\">\n" +
"   	  <div class=\"wrap\">\n" +
"	     <div class=\"section group\">\n" +
"				<div class=\"col span\">\n" +
"						<h4>Information</h4>\n" +
"						<ul>\n" +
"						<li><a href=\"#\">About Us</a></li>\n" +
"						\n" +
"						<li><a href=\"contact.html\">Contact Us</a></li>\n" +
"						</ul>\n" +
"					</div>\n" +
"				<div class=\"col span\">\n" +
"					<h4>Know us better</h4>\n" +
"						<ul>\n" +
"						<li><a href=\"#\">About Us</a></li>\n" +
"				\n" +
"						<li><a href=\"contact.html\">Site Map</a></li>\n" +
"						<li><a href=\"#\">Search Terms</a></li>\n" +
"						</ul>\n" +
"				</div>\n" +
"				\n" +
"				<div class=\"col span\">\n" +
"					<h4>Contact</h4>\n" +
"						<ul>\n" +
"							<li><span>9971825755</span></li>\n" +
"							<li><span>8130527232</span></li>\n" +
"						</ul>\n" +
"						<div class=\"social-icons\">\n" +
"							<h4>Follow Us</h4>\n" +
"					   		  <ul>\n" +
"							      <li><a href=\"#\" target=\"_blank\"><img src=\"images/facebook.png\" alt=\"\" /></a></li>\n" +
"							      <li><a href=\"#\" target=\"_blank\"><img src=\"images/twitter.png\" alt=\"\" /></a></li>\n" +
"							      <li><a href=\"#\" target=\"_blank\"><img src=\"images/skype.png\" alt=\"\" /> </a></li>\n" +
"							      <li><a href=\"#\" target=\"_blank\"> <img src=\"images/linkedin.png\" alt=\"\" /></a></li>\n" +
"							      <div class=\"clear\"></div>\n" +
"						     </ul>\n" +
"   	 					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"			 <div class=\"copy_right\">\n" +
"				<p>Company Name © All rights Reseverd </p>\n" +
"		   </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <script type=\"text/javascript\">\n" +
"		$(document).ready(function() {\n" +
"			$().UItoTop({ easingType: 'easeOutQuart' });\n" +
"\n" +
"		});\n" +
"	</script>\n" +
"    <a href=\"#\" id=\"toTop\"><span id=\"toTopHover\"> </span></a>\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(rev.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(rev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(rev.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(rev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

