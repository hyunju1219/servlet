package com.study.dvd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nums")
public class NumsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //한글 리턴 
		resp.setCharacterEncoding("utf-8"); 
		
		StringBuilder builder = new StringBuilder();
		builder.append("<html>");
		builder.append("<head>");
		builder.append("</head>");
		builder.append("<body>");
		builder.append("<ul>");
		
		for(int i = 0; i < 50; i++) {
			builder.append("<li>김준일" + (i + 1) + "</li>");
		}
		
		builder.append("</ul>");
		builder.append("</body>");
		builder.append("</html>");

		//toString 안하면 빌더객체
		resp.getWriter().println(builder.toString());
		
		resp.getWriter().println("<ul>");
		
//		for(int i = 1; i < 51; i++) {
//			resp.getWriter().println("<li>김준일"+ i +"</li>");
//	      }
//		
//		resp.getWriter().println("</ul>");
	}
}
