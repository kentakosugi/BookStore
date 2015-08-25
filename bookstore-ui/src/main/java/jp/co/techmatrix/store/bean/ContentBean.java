package jp.co.techmatrix.store.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.techmatrix.store.services.impl.Book;
import jp.co.techmatrix.store.services.impl.Search;

/**
 * content.xhtmlと関連づけられたBean
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class ContentBean implements Serializable{
	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 528324078378300470L;

	@Inject
	private Search proxy;
	
	private String title;
	
	private List<Book> books;
	
	private Book book;
	
	/**
	 * タイトルの取得
	 * @return
	 */
	public String getTitle(){
		return this.title;
	}
	
	/**
	 * タイトルの設定
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * 検索した本の取得
	 * @return 
	 */
	public List<Book> getBooks(){
		return this.books;
	}
	
	/**
	 * 検索した本の設定
	 * @param books
	 */
	public void setBooks(List<Book> books){
		this.books = books;
	}
	
	/**
	 * 本の取得
	 * @return
	 */
	public Book getBook(){
		return this.book;
	}
	
	/**
	 * 本の設定
	 * @param book
	 */
	public void setBook(Book book){
		this.book = book;
	}
	
	/**
	 * 検索
	 */
	public void search(){
		// nullか空白の場合
		if(this.title == null || "".equals(title)){
			// GCを促す
			this.reset();
			return;
		}
		
		// Webサービス呼び出し
		this.books = this.proxy.getItemByTitleOperation(title);
	}
	
	/**
	 * 検索結果を空にする
	 */
	public void reset(){
		this.books = null;
		this.book = null;
		System.gc();
	}
}
