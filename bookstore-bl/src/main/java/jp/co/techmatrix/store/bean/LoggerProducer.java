package jp.co.techmatrix.store.bean;

import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

/**
 * ロガーをインジェクションするためのクラス
 * @author kosugi
 *
 */
@Dependent
public class LoggerProducer{
	@Inject
	private InjectionPoint point;
	
	/**
	 * ロガーをインジェクションするためのファクトリ
	 * @return
	 */
	@Produces
	public Logger getLogger(){
		return Logger.getLogger(this.point.getMember().getDeclaringClass().getName());
	}
}
