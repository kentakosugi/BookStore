package jp.co.techmatrix.store.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import jp.co.techmatrix.store.services.impl.Book;

/**
 * 
 * @author kosugi
 *
 */
@SessionScoped
public class CartBean implements Serializable{
	
	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 617817484076347468L;

	@Inject
	private Logger logger;
	
	private HashSet<Book> books = new HashSet<>();

	public void setBook(Book book){
	}
	
}
