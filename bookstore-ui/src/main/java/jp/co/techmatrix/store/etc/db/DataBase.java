package jp.co.techmatrix.store.etc.db;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jp.co.techmatrix.store.services.impl.Book;

/**
 * Derbyに接続するためのコネクションを張ります。
 * @author kosugi
 *
 */
public class DataBase implements Closeable{
	
	/**
	 * Connection
	 */
	private Connection con = null;
	
	/**
	 * 引数ありのコンストラクタ
	 * @param url jdbcのURL
	 * @param user USER名
	 * @param password パスワード
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public DataBase(String url, String user, String password) throws SQLException, ClassNotFoundException{
		// JDBCドライバの解決
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		
		// 接続
		this.con = DriverManager.getConnection(url, user, password);
		
	}
	
	/**
	 * ITEMの取得
	 * @param sql
	 * @return
	 */
	public List<Book> getItemByTitle(String title) throws SQLException{
		// 戻り値
		List<Book> ret = new ArrayList<>();
		
		// Statementの生成
		Statement stmt = this.con.createStatement();

		System.err.println("SELECT * FROM BOOK WHERE UPPER(TITLE) LIKE UPPER('%" + title + "%')");
		System.err.flush();
		
		
		// SQL文の実行
		ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK WHERE UPPER(TITLE) LIKE UPPER('%" + title + "%')");
		
		// ResultSetがある限り実施する
		while(rs.next()){
			// Book の生成
			Book book = new Book();

			book.setDescription(rs.getString("DESCRIPTION"));
			book.setId(rs.getInt("ID"));
			book.setIsbn(rs.getString("ISBN"));
			book.setPrice(rs.getDouble("PRICE"));
			book.setStock(rs.getInt("STOCK"));
			book.setTitle(rs.getString("TITLE"));
			ret.add(book);
		}

		rs.close();
		stmt.close();
		
		return ret;
	}
	
	/**
	 * IDによるITEMの取得
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Book getItemById(int id) throws SQLException{
		Book ret = null;
		
		// Statamentの生成
		Statement stmt = this.con.createStatement();
		
		// SQL文の生成
		ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK WHERE ID = " + id);
		
		while(rs.next()){
			ret = new Book();
			ret.setDescription(rs.getString("DESCRIPTION"));
			ret.setId(rs.getInt("ID"));
			ret.setIsbn(rs.getString("ISBN"));
			ret.setPrice(rs.getDouble("PRICE"));
			ret.setStock(rs.getInt("STOCK"));
			ret.setTitle(rs.getString("TITLE"));
		}
		
		return ret;
	}
	
	/**
	 * Connectionをクローズします。
	 */
	@Override
	public void close(){
		// TODO コネクションのクローズ
	}

}
