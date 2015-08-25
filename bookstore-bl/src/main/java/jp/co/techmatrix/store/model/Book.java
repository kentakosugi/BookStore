package jp.co.techmatrix.store.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * Bookテーブル
 * @author kosugi
 *
 */
@Entity(name = "BOOK")
@NamedQueries({
		@NamedQuery(name = Book.SELECT_ALL_BOOKS, query = "SELECT b FROM BOOK b"),
		@NamedQuery(name = Book.SELECT_ALL_BOOKS_WHERE_TITLE, query = "SELECT b FROM BOOK b WHERE UPPER(b.title) LIKE UPPER(:title)")
		})
@XmlType(propOrder = {"isbn", "authors", "description", "id", "title", "price", "year", "publisher", "stock"})
public class Book implements Serializable{
	/**
	 * UID
	 */
	private static final long serialVersionUID = -6741755591594132055L;
	public static final String SELECT_ALL_BOOKS = "SELECT_ALL_BOOK";
	public static final String SELECT_ALL_BOOKS_WHERE_TITLE = "SELECT_ALL_BOOK_WHERE_TITLE";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private int id;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, targetEntity = Author.class)
	@JoinColumns(@JoinColumn(nullable = false, name = "isbn", referencedColumnName = "isbn"))
	private List<Author> authors;

	@Column(name = "ISBN", nullable = false, length = 10)
	private String isbn;
	
	@Column(name = "TITLE", nullable = false, length = 200)
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Publisher.class)
	private Publisher publisher;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PYEAR", nullable = false)
	private Date year;
	
	@Column(name = "STOCK", nullable = false)
	private int stock;
	
	@Column(name = "PRICE", nullable = false)
	private double price;
	
	@Column(name = "DESCRIPTION")
	private String description;

	/**
	 * idの取得
	 * @return
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * idの設定
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * authorの取得
	 * @return
	 */
	@XmlElementWrapper(name = "authors")
	@XmlElement(name = "author")
	public List<Author> getAuthors(){
		return this.authors;
	}

	/**
	 * authorの設定
	 * @param authors
	 */
	public void setAuthors(List<Author> authors){
		this.authors = authors;
	}

	/**
	 * isbnの取得
	 * @return
	 */
	public String getIsbn(){
		return this.isbn;
	}

	/**
	 * isbnの設定
	 * @param isbn
	 */
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	/**
	 * titleの取得
	 * @return
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 * titleの設定
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * publisherの取得
	 * @return
	 */
	public Publisher getPublisher(){
		return this.publisher;
	}

	/**
	 * publisherの設定
	 * @param publisher
	 */
	public void setPublisher(Publisher publisher){
		this.publisher = publisher;
	}

	/**
	 * yearの取得
	 * @return
	 */
	public Date getYear(){
		return this.year;
	}

	/**
	 * yearの設定
	 * @param year
	 */
	public void setYear(Date year){
		this.year = year;
	}

	/**
	 * stockの設定
	 * @return
	 */
	public int getStock(){
		return this.stock;
	}

	/**
	 * stockの設定
	 * @param stock
	 */
	public void setStock(int stock){
		this.stock = stock;
	}

	/**
	 * priceの取得
	 * @return
	 */
	public double getPrice(){
		return this.price;
	}

	/**
	 * priceの設定
	 * @param price
	 */
	public void setPrice(double price){
		this.price = price;
	}

	/**
	 * descriptionの取得
	 * @return
	 */
	public String getDescription(){
		return this.description;
	}

	/**
	 * descriptionの設定
	 * @param description
	 */
	public void setDescription(String description){
		this.description = description;
	}
}
