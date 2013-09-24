package FizzBuzzTDD;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FizzBuzzServlet extends HttpServlet {
    FizzBuzztdd fb = new FizzBuzztdd();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String hasta = request.getParameter("hasta");
		int limite = Integer.parseInt(hasta);
		response.getWriter().println(fb.imprimir(limite));
	}
}
