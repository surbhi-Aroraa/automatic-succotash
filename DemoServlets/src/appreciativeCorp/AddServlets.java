package appreciativeCorp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddServlets extends HttpServlet{ // the moment we write HttpServlet the class becomes Servle

	// we can also use methods like doGet and doPost which work respectively of its own type
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException { //This method belongs to servlet cycle
		//HttpServletRequest is used to fetch data and HttpServletResponse is used to send response
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("Sum is "+k);
		
		// while running we get http://localhost:8080/DemoServlets/add?num1=4&num2=6 in url
		// which is a query string which is used to send data from client to server
	}   //To configure servlet we need web.xml file also known as Deployment Descriptor
	
	//To post data to the server we use Post method 
	//and to fetch data from the server we use get method
}
