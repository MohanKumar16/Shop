

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletservlet
 */
@WebServlet("/Servletservlet")
public class Servletservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>Server Servlet</title></head>");
		out.println("<body bgcolor=red>");
		out.println("<h1> Request methods</h1>");
		out.println("<b> Remote Host:</b>"+request.getRemoteHost()+"<br/>");
		out.println("<b> Remote Port:</b>"+request.getRemotePort()+"<br/>");
		out.println("<b> Requested URI:</b>"+request.getRequestURI()+"<br/>");
		out.println("<b> Server Name:</b>"+request.getServerName()+"<br/>");
		out.println("<b> Server Port:</b>"+request.getServerPort()+"<br/>");
		out.println("</body>");
		out.println("</html>");
		out.close();


		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
