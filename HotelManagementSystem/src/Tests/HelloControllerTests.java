package Tests;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.web.servlet.*;

import web.HelloController;


public class HelloControllerTests extends TestCase
{
	
	public void testHandleRequestView() throws Exception
	{
		
		HelloController controller=new HelloController();
		ModelAndView modelAndView=controller.handleRequest(null,null);
		assertEquals("hello.jsp",modelAndView.getViewName());
	
	}
	
}
