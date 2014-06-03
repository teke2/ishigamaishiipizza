package pizzashop;

import java.io.IOException;
import java.util.*;

import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import pizza.LinkData;

public class EditLinkDataServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("no url...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		long id = Long.parseLong(req.getParameter("id"));
		String haitatu = req.getParameter("haitatu");
		int price = Integer.parseInt(req.getParameter("price"));
		String title = req.getParameter("title");
		String comment = req.getParameter("comment");
		String name = req.getParameter("name");
		pizza.LinkdataHaitatu data = new pizza.LinkdataHaitatu(title, price,comment, haitatu, name);

		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager manager = factory.getPersistenceManager();
		try {
			manager.makePersistent(data);
		} finally {
			manager.close();
		}
		resp.sendRedirect("/index2.html");
	}
}