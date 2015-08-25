package jp.co.techmatrix.store.services.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;

import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.services.Search;

/**
 * 本を検索するサービス
 * Stateless Session Bean と Web サービス
 * @author kosugi
 *
 */
@Stateless
@WebService(name = "Search", serviceName = "BookStore")
public class SearchImpl implements Search{
	@PersistenceContext(name = "bookstore")
	private EntityManager em;
	
	@Inject
	@Transient
	private Logger logger;

	@SuppressWarnings("unchecked")
	@Override
	@WebMethod(operationName = "getItemByTitleOperation")
	@WebResult(name = "getItemByTitleReturn", partName = "getItemByTitleResponse")
	public List<Book> getItemByTitle(@WebParam(name = "getItemByTitleRequest", partName = "title") String title){
		this.logger.info("title=" + title);

		return this.em.createNamedQuery(Book.SELECT_ALL_BOOKS_WHERE_TITLE).setParameter("title", "%" + title + "%").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	@WebMethod(operationName = "getAllItemOperation")
	@WebResult(name = "getAllItemReturn", partName = "getAllITemResponse")
	public List<Book> getAllItem(){
		return this.em.createNamedQuery(Book.SELECT_ALL_BOOKS).getResultList();
	}

	@Override
	@WebMethod(operationName = "getItemByIdOperation")
	@WebResult(name = "getItemByIdReturn", partName = "getItemByIdResponse")
	public Book getItemById(@WebParam(name = "getItemByIdRequest", partName = "id") int id){
		return this.em.find(Book.class, id);
	}
}
