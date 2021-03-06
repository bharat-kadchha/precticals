package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String n = req.getParameter("name");
		out.print("Welcome " + n);

		Cookie cookie = new Cookie("uname", n);

		cookie.setMaxAge(10);
		cookie.setComment("this is demo cookie");
		cookie.setValue("null123");
		resp.addCookie(cookie);

		out.print("<form action='/leb_2_servlet/servlet/getcookie'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		out.close();

	}

}
