package jp.co.techmatrix.store.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import jp.co.techmatrix.store.OrderLine;
import jp.co.techmatrix.store.services.Cart;

/**
 * 購入シナリオに対応するサービス
 * @author kosugi
 *
 */
@Stateful
public class CartImpl implements Cart{
	private int id;
	
	/**
	 * 本当はDBにしたい
	 */
	private List<OrderLine> orders = new ArrayList<OrderLine>();

	@Override
	public List<OrderLine> getPendingOrders(){
		return this.orders;
	}

	@Override
	public OrderLine order(int id, int count){
		// インクリメント
		this.id ++;
		
		OrderLine line = new OrderLine();
		line.setId(this.id);
		line.setBook_Id(id);
		
		this.orders.add(line);
		
		return line;
	}

	@Override
	public boolean removeOrder(int id){
		return false;
	}

	@Override
	public boolean removeAllOrder(){
		return false;
	}

}
