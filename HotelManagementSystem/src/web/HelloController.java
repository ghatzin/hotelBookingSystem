package web;

import org.springframework.web.servlet.mvc.*;
import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.logging.*;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.ServletException;



public class HelloController implements Controller
{
	
	protected final Log logger=LogFactory.getLog(getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning hello view");
		
		return new ModelAndView("hello.jsp");
	}




}

