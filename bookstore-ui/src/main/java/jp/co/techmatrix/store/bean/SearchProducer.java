package jp.co.techmatrix.store.bean;

import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import jp.co.techmatrix.store.services.impl.BookStore;
import jp.co.techmatrix.store.services.impl.Search;

/**
 * SearchServiceをインジェクションするクラス
 * @author kosugi
 *
 */
@Dependent
public class SearchProducer{
	
	/**
	 * サービスをインジェクションするメソッド
	 * @return
	 */
	@Produces
	public Search getSeachInstance(){
		// サービスの生成
		BookStore service = new BookStore();
		
		// ポートの生成
		Search ret = service.getSearchPort();
		
		// Proxyの設定～エンドポイントの変更
		Map<String, Object> context = ((javax.xml.ws.BindingProvider)ret).getRequestContext();
		context.put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/BookStore/Search");
		
		// サービスの設定
		return ret;
	}

}
