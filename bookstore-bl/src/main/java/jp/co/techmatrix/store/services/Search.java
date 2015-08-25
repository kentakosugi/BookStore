package jp.co.techmatrix.store.services;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import jp.co.techmatrix.store.model.Book;

/**
 * Searchサービスのインターフェース
 * @author kosugi
 *
 */
@Local
@Remote
public interface Search{
	/**
	 * タイトルで本を検索します
	 * @param title 検索対象のタイトル
	 * @return 検索結果
	 */
	public List<Book> getItemByTitle(String title);
	
	/**
	 * すべての検索アイテム
	 * @return すべてのアイテム
	 */
	public List<Book> getAllItem();
	
	/**
	 * IDで本を検索します。
	 * @param id 検索対象のID
	 * @return 検索結果
	 */
	public Book getItemById(int id);
}
