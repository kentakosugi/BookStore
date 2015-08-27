package jp.co.techmatrix.store.etc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.techmatrix.store.etc.db.DataBase;
import jp.co.techmatrix.store.services.impl.Book;

/**
 * Servlet implementation class SerachServlet
 */
@WebServlet("/SearchServlet")
public class SerachServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SerachServlet(){
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		// XMLを返却する
		res.setContentType("text/html");
		res.setCharacterEncoding("UTF-8");

		// Writer
		PrintWriter out = res.getWriter();
		String title = req.getParameter("title");
		String id = req.getParameter("id");

		// レスポンスに出力
		out.println("<html><head><link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"><title>" + title
				+ "</title></head><body>");

		DataBase db = null;

		try{
			// DBオブジェクトの生成
			db = new DataBase("jdbc:derby://localhost:1527/bookstore", "APP", "APP");

			List<Book> books = null;

			if(!title.equals("")){
				// タイトルで検索
				books = db.getItemByTitle(title);
			}else if(!id.equals("")){
				books = new ArrayList<Book>();
				books.add(db.getItemById(Integer.parseInt(id)));
			}

			out.println("<table>");
			out.println("<tr><th colspan=\"2\">");
			out.println("検索結果:" + books.size() + "冊");
			out.println("</th></tr>");

			for(Book book : books){
				out.println("<tr>");
				out.println("<td>ID</td>");
				out.println("<td>");
				out.println(book.getId());
				out.println("</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>TITLE</td>");
				out.println("<td>");
				out.println(book.getTitle());
				out.println("</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>ISBN</td>");
				out.println("<td>");
				out.println(book.getIsbn());
				out.println("</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>DESCRIPTION</td>");
				out.println("<td>");
				out.println(book.getDescription());
				out.println("</td>");
				out.println("</tr>");
			}

			out.println("</table>");
			out.println("</body></html>");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			db.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		// 同一処理
		this.doPost(req, res);
	}

}
