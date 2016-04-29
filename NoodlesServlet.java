package com.netease;


import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class NoodlesServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        if (vegetable == null) {
            vegetable = "Tomato";
        }

        writer.println("<html><body>");
        writer.println("<h1> Noodles with " + vegetable + "</h1>"); 
        writer.println("</body></html>");
        
       
        Logger log= Logger.getLogger(NoodlesServlet.class);
     // 记录debug级别的信息  
       // log.debug("This is debug message.");  
        // 记录info级别的信息  
        log.info(" Noodles with " + vegetable);  
        // 记录error级别的信息  
       // log.error("This is error message.");  
        		
       
    }
}	
