
package jp.co.techmatrix.store.services.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.co.techmatrix.store.services.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllItemOperation_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "getAllItemOperation");
    private final static QName _GetItemByIdOperation_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "getItemByIdOperation");
    private final static QName _GetItemByTitleOperation_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "getItemByTitleOperation");
    private final static QName _GetItemByTitleOperationResponse_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "getItemByTitleOperationResponse");
    private final static QName _GetAllItemOperationResponse_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "getAllItemOperationResponse");
    private final static QName _GetItemByIdOperationResponse_QNAME = new QName("http://impl.services.store.techmatrix.co.jp/", "getItemByIdOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.co.techmatrix.store.services.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link GetItemByIdOperationResponse }
     * 
     */
    public GetItemByIdOperationResponse createGetItemByIdOperationResponse() {
        return new GetItemByIdOperationResponse();
    }

    /**
     * Create an instance of {@link GetAllItemOperationResponse }
     * 
     */
    public GetAllItemOperationResponse createGetAllItemOperationResponse() {
        return new GetAllItemOperationResponse();
    }

    /**
     * Create an instance of {@link GetItemByTitleOperationResponse }
     * 
     */
    public GetItemByTitleOperationResponse createGetItemByTitleOperationResponse() {
        return new GetItemByTitleOperationResponse();
    }

    /**
     * Create an instance of {@link GetItemByTitleOperation }
     * 
     */
    public GetItemByTitleOperation createGetItemByTitleOperation() {
        return new GetItemByTitleOperation();
    }

    /**
     * Create an instance of {@link GetAllItemOperation }
     * 
     */
    public GetAllItemOperation createGetAllItemOperation() {
        return new GetAllItemOperation();
    }

    /**
     * Create an instance of {@link GetItemByIdOperation }
     * 
     */
    public GetItemByIdOperation createGetItemByIdOperation() {
        return new GetItemByIdOperation();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link Book.Authors }
     * 
     */
    public Book.Authors createBookAuthors() {
        return new Book.Authors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.services.store.techmatrix.co.jp/", name = "getAllItemOperation")
    public JAXBElement<GetAllItemOperation> createGetAllItemOperation(GetAllItemOperation value) {
        return new JAXBElement<GetAllItemOperation>(_GetAllItemOperation_QNAME, GetAllItemOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.services.store.techmatrix.co.jp/", name = "getItemByIdOperation")
    public JAXBElement<GetItemByIdOperation> createGetItemByIdOperation(GetItemByIdOperation value) {
        return new JAXBElement<GetItemByIdOperation>(_GetItemByIdOperation_QNAME, GetItemByIdOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTitleOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.services.store.techmatrix.co.jp/", name = "getItemByTitleOperation")
    public JAXBElement<GetItemByTitleOperation> createGetItemByTitleOperation(GetItemByTitleOperation value) {
        return new JAXBElement<GetItemByTitleOperation>(_GetItemByTitleOperation_QNAME, GetItemByTitleOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTitleOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.services.store.techmatrix.co.jp/", name = "getItemByTitleOperationResponse")
    public JAXBElement<GetItemByTitleOperationResponse> createGetItemByTitleOperationResponse(GetItemByTitleOperationResponse value) {
        return new JAXBElement<GetItemByTitleOperationResponse>(_GetItemByTitleOperationResponse_QNAME, GetItemByTitleOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.services.store.techmatrix.co.jp/", name = "getAllItemOperationResponse")
    public JAXBElement<GetAllItemOperationResponse> createGetAllItemOperationResponse(GetAllItemOperationResponse value) {
        return new JAXBElement<GetAllItemOperationResponse>(_GetAllItemOperationResponse_QNAME, GetAllItemOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.services.store.techmatrix.co.jp/", name = "getItemByIdOperationResponse")
    public JAXBElement<GetItemByIdOperationResponse> createGetItemByIdOperationResponse(GetItemByIdOperationResponse value) {
        return new JAXBElement<GetItemByIdOperationResponse>(_GetItemByIdOperationResponse_QNAME, GetItemByIdOperationResponse.class, null, value);
    }

}
