package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.MemoryMXBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = -3967314453512919811L;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java 1");
    }

    private String mymsg;
    public void init() throws ServletException 
    {      
       mymsg = "Http Servlet Demo";   
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        // Setting up the content type of web page      
        PrintWriter out = res.getWriter();      
        String p = req.getParameter("p");
        out.println("<h1>" + mymsg + "</h1>");      
        out.println("<p>"+p+"</p>");
        res.setContentType("text/html");
        if(p.equals("bello")){
            out.println("<p>"+"Stupendo,carino"+"</p>");
        }
        if(p.equals("inutile")){
            out.println("<p>"+"dio,piastra del bar"+"</p>");
        }
        if(p.equals("brutto")){
            out.println("<p>"+"abominevole,io"+"</p>");
        }
    }
}