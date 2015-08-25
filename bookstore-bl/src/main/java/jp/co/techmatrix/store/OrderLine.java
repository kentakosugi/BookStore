package jp.co.techmatrix.store;


import java.io.Serializable;

public class OrderLine implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = -2735606483864229841L;
	
	private int id;
	
	private int book_id;

	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getBook_Id(){
		return this.book_id;
	}
	
	public void setBook_Id(int id){
		this.book_id = id;
	}
}
