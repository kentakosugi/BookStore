package jp.co.techmatrix.store.services;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import jp.co.techmatrix.store.OrderLine;

/**
 * 
 * @author kosugi
 *
 */
@Remote
@Local
public interface Cart{
	/**
	 * ペンディング中のOrder一覧を取得します。
	 * @return
	 */
	public List<OrderLine> getPendingOrders();

	/**
	 * Orderを生成します
	 * @param id 購入する本のID
	 * @param count 購入する本の数
	 * @return idと数を元にOrderLineを生成します。
	 */
	public OrderLine order(int id, int count);

	/**
	 * Orderを削除します。
	 * @param id 削除対象のid
	 * @return 成功した場合はtrue/失敗した場合はfalseを返却します。
	 */
	public boolean removeOrder(int id);

	/**
	 * Orderを全削除します。
	 * @return 成功した場合はtrue/失敗した場合はfalseを返却します。
	 */
	public boolean removeAllOrder();

}
