package jp.co.techmatrix.store.bean;

import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

/**
 * LoggerProducerクラス
 * @author kosugi
 *
 */
@Dependent
public class LoggerProducer{
	@Inject
	private InjectionPoint point;
	
	/**
	 * Loggerの取得
	 * @return
	 */
	@Produces
	public Logger getLogger(){
		// Loggerの生成
		return Logger.getLogger(this.point.getMember().getDeclaringClass().getName());
	}
}
