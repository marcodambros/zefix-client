
package ch.admin.e_service.zefix._2015_06_26;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.admin.e_service.zefix._2015_06_26 package. 
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

    private final static QName _GetByEHRAidDetailledRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByEHRAidDetailledRequest");
    private final static QName _GetByEHRAidFullRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByEHRAidFullRequest");
    private final static QName _GetByEHRAidDetailledResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByEHRAidDetailledResponse");
    private final static QName _GetByEHRAidFullResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByEHRAidFullResponse");
    private final static QName _GetByCHidDetailledRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByCHidDetailledRequest");
    private final static QName _GetByCHidFullRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByCHidFullRequest");
    private final static QName _GetByCHidDetailledResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByCHidDetailledResponse");
    private final static QName _GetByCHidFullResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByCHidFullResponse");
    private final static QName _GetByUidDetailledRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByUidDetailledRequest");
    private final static QName _GetByUidFullRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByUidFullRequest");
    private final static QName _GetByUidDetailledResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByUidDetailledResponse");
    private final static QName _GetByUidFullResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getByUidFullResponse");
    private final static QName _GetSHABRefsByDateRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getSHABRefsByDateRequest");
    private final static QName _GetSHABMessageRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getSHABMessageRequest");
    private final static QName _GetSHABRefsByDateResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getSHABRefsByDateResponse");
    private final static QName _GetSHABMessageResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getSHABMessageResponse");
    private final static QName _GetLegalFormsResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getLegalFormsResponse");
    private final static QName _GetBFSCommunitiesResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getBFSCommunitiesResponse");
    private final static QName _GetRegistryOfficesResponse_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getRegistryOfficesResponse");
    private final static QName _GetRegistryOfficesRequest_QNAME = new QName("http://www.e-service.admin.ch/zefix/2015-06-26", "getRegistryOfficesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.admin.e_service.zefix._2015_06_26
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShortResponse }
     * 
     */
    public ShortResponse createShortResponse() {
        return new ShortResponse();
    }

    /**
     * Create an instance of {@link OldNamesType }
     * 
     */
    public OldNamesType createOldNamesType() {
        return new OldNamesType();
    }

    /**
     * Create an instance of {@link RegistryOfficesResponseType }
     * 
     */
    public RegistryOfficesResponseType createRegistryOfficesResponseType() {
        return new RegistryOfficesResponseType();
    }

    /**
     * Create an instance of {@link BfsCommunitiesResponseType }
     * 
     */
    public BfsCommunitiesResponseType createBfsCommunitiesResponseType() {
        return new BfsCommunitiesResponseType();
    }

    /**
     * Create an instance of {@link LegalFormsResponseType }
     * 
     */
    public LegalFormsResponseType createLegalFormsResponseType() {
        return new LegalFormsResponseType();
    }

    /**
     * Create an instance of {@link ShabMessageResponseType }
     * 
     */
    public ShabMessageResponseType createShabMessageResponseType() {
        return new ShabMessageResponseType();
    }

    /**
     * Create an instance of {@link ShabRefsByDateResponseType }
     * 
     */
    public ShabRefsByDateResponseType createShabRefsByDateResponseType() {
        return new ShabRefsByDateResponseType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link FullResponseType }
     * 
     */
    public FullResponseType createFullResponseType() {
        return new FullResponseType();
    }

    /**
     * Create an instance of {@link DetailledResponseType }
     * 
     */
    public DetailledResponseType createDetailledResponseType() {
        return new DetailledResponseType();
    }

    /**
     * Create an instance of {@link GetByEHRAidRequestType }
     * 
     */
    public GetByEHRAidRequestType createGetByEHRAidRequestType() {
        return new GetByEHRAidRequestType();
    }

    /**
     * Create an instance of {@link GetByCHidRequestType }
     * 
     */
    public GetByCHidRequestType createGetByCHidRequestType() {
        return new GetByCHidRequestType();
    }

    /**
     * Create an instance of {@link GetByUidRequestType }
     * 
     */
    public GetByUidRequestType createGetByUidRequestType() {
        return new GetByUidRequestType();
    }

    /**
     * Create an instance of {@link SearchByNameRequest }
     * 
     */
    public SearchByNameRequest createSearchByNameRequest() {
        return new SearchByNameRequest();
    }

    /**
     * Create an instance of {@link ShortResponse.Result }
     * 
     */
    public ShortResponse.Result createShortResponseResult() {
        return new ShortResponse.Result();
    }

    /**
     * Create an instance of {@link GetSHABRefsByDateRequestType }
     * 
     */
    public GetSHABRefsByDateRequestType createGetSHABRefsByDateRequestType() {
        return new GetSHABRefsByDateRequestType();
    }

    /**
     * Create an instance of {@link GetSHABMessageRequestType }
     * 
     */
    public GetSHABMessageRequestType createGetSHABMessageRequestType() {
        return new GetSHABMessageRequestType();
    }

    /**
     * Create an instance of {@link RegistryOfficesRequestType }
     * 
     */
    public RegistryOfficesRequestType createRegistryOfficesRequestType() {
        return new RegistryOfficesRequestType();
    }

    /**
     * Create an instance of {@link GetLegalFormsRequest }
     * 
     */
    public GetLegalFormsRequest createGetLegalFormsRequest() {
        return new GetLegalFormsRequest();
    }

    /**
     * Create an instance of {@link GetBFSCommunitiesRequest }
     * 
     */
    public GetBFSCommunitiesRequest createGetBFSCommunitiesRequest() {
        return new GetBFSCommunitiesRequest();
    }

    /**
     * Create an instance of {@link OldLegalSeatType }
     * 
     */
    public OldLegalSeatType createOldLegalSeatType() {
        return new OldLegalSeatType();
    }

    /**
     * Create an instance of {@link ChidSeqType }
     * 
     */
    public ChidSeqType createChidSeqType() {
        return new ChidSeqType();
    }

    /**
     * Create an instance of {@link LegalType }
     * 
     */
    public LegalType createLegalType() {
        return new LegalType();
    }

    /**
     * Create an instance of {@link SingleFullSHABType }
     * 
     */
    public SingleFullSHABType createSingleFullSHABType() {
        return new SingleFullSHABType();
    }

    /**
     * Create an instance of {@link SingleSHABType }
     * 
     */
    public SingleSHABType createSingleSHABType() {
        return new SingleSHABType();
    }

    /**
     * Create an instance of {@link TranslationType }
     * 
     */
    public TranslationType createTranslationType() {
        return new TranslationType();
    }

    /**
     * Create an instance of {@link CompanyShortInfoType }
     * 
     */
    public CompanyShortInfoType createCompanyShortInfoType() {
        return new CompanyShortInfoType();
    }

    /**
     * Create an instance of {@link CompanyDetailedInfoType }
     * 
     */
    public CompanyDetailedInfoType createCompanyDetailedInfoType() {
        return new CompanyDetailedInfoType();
    }

    /**
     * Create an instance of {@link CompanyFullInfoType }
     * 
     */
    public CompanyFullInfoType createCompanyFullInfoType() {
        return new CompanyFullInfoType();
    }

    /**
     * Create an instance of {@link BfsCommunityType }
     * 
     */
    public BfsCommunityType createBfsCommunityType() {
        return new BfsCommunityType();
    }

    /**
     * Create an instance of {@link RegistryOfficeType }
     * 
     */
    public RegistryOfficeType createRegistryOfficeType() {
        return new RegistryOfficeType();
    }

    /**
     * Create an instance of {@link ShabPubType }
     * 
     */
    public ShabPubType createShabPubType() {
        return new ShabPubType();
    }

    /**
     * Create an instance of {@link ShabPubFullType }
     * 
     */
    public ShabPubFullType createShabPubFullType() {
        return new ShabPubFullType();
    }

    /**
     * Create an instance of {@link ShabIndicatorsType }
     * 
     */
    public ShabIndicatorsType createShabIndicatorsType() {
        return new ShabIndicatorsType();
    }

    /**
     * Create an instance of {@link GetSHABRefsByDateResponseType }
     * 
     */
    public GetSHABRefsByDateResponseType createGetSHABRefsByDateResponseType() {
        return new GetSHABRefsByDateResponseType();
    }

    /**
     * Create an instance of {@link GetSHABMessageResponseType }
     * 
     */
    public GetSHABMessageResponseType createGetSHABMessageResponseType() {
        return new GetSHABMessageResponseType();
    }

    /**
     * Create an instance of {@link GetLegalFormsResponseType }
     * 
     */
    public GetLegalFormsResponseType createGetLegalFormsResponseType() {
        return new GetLegalFormsResponseType();
    }

    /**
     * Create an instance of {@link GetBFSCommunitiesResponseType }
     * 
     */
    public GetBFSCommunitiesResponseType createGetBFSCommunitiesResponseType() {
        return new GetBFSCommunitiesResponseType();
    }

    /**
     * Create an instance of {@link GetRegistryOfficesResponseType }
     * 
     */
    public GetRegistryOfficesResponseType createGetRegistryOfficesResponseType() {
        return new GetRegistryOfficesResponseType();
    }

    /**
     * Create an instance of {@link OldNamesType.OldName }
     * 
     */
    public OldNamesType.OldName createOldNamesTypeOldName() {
        return new OldNamesType.OldName();
    }

    /**
     * Create an instance of {@link RegistryOfficesResponseType.Result }
     * 
     */
    public RegistryOfficesResponseType.Result createRegistryOfficesResponseTypeResult() {
        return new RegistryOfficesResponseType.Result();
    }

    /**
     * Create an instance of {@link BfsCommunitiesResponseType.Result }
     * 
     */
    public BfsCommunitiesResponseType.Result createBfsCommunitiesResponseTypeResult() {
        return new BfsCommunitiesResponseType.Result();
    }

    /**
     * Create an instance of {@link LegalFormsResponseType.Result }
     * 
     */
    public LegalFormsResponseType.Result createLegalFormsResponseTypeResult() {
        return new LegalFormsResponseType.Result();
    }

    /**
     * Create an instance of {@link ShabMessageResponseType.Result }
     * 
     */
    public ShabMessageResponseType.Result createShabMessageResponseTypeResult() {
        return new ShabMessageResponseType.Result();
    }

    /**
     * Create an instance of {@link ShabRefsByDateResponseType.Result }
     * 
     */
    public ShabRefsByDateResponseType.Result createShabRefsByDateResponseTypeResult() {
        return new ShabRefsByDateResponseType.Result();
    }

    /**
     * Create an instance of {@link ErrorsType.Error }
     * 
     */
    public ErrorsType.Error createErrorsTypeError() {
        return new ErrorsType.Error();
    }

    /**
     * Create an instance of {@link FullResponseType.Result }
     * 
     */
    public FullResponseType.Result createFullResponseTypeResult() {
        return new FullResponseType.Result();
    }

    /**
     * Create an instance of {@link DetailledResponseType.Result }
     * 
     */
    public DetailledResponseType.Result createDetailledResponseTypeResult() {
        return new DetailledResponseType.Result();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByEHRAidRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByEHRAidRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByEHRAidDetailledRequest")
    public JAXBElement<GetByEHRAidRequestType> createGetByEHRAidDetailledRequest(GetByEHRAidRequestType value) {
        return new JAXBElement<GetByEHRAidRequestType>(_GetByEHRAidDetailledRequest_QNAME, GetByEHRAidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByEHRAidRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByEHRAidRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByEHRAidFullRequest")
    public JAXBElement<GetByEHRAidRequestType> createGetByEHRAidFullRequest(GetByEHRAidRequestType value) {
        return new JAXBElement<GetByEHRAidRequestType>(_GetByEHRAidFullRequest_QNAME, GetByEHRAidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailledResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailledResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByEHRAidDetailledResponse")
    public JAXBElement<DetailledResponseType> createGetByEHRAidDetailledResponse(DetailledResponseType value) {
        return new JAXBElement<DetailledResponseType>(_GetByEHRAidDetailledResponse_QNAME, DetailledResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FullResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByEHRAidFullResponse")
    public JAXBElement<FullResponseType> createGetByEHRAidFullResponse(FullResponseType value) {
        return new JAXBElement<FullResponseType>(_GetByEHRAidFullResponse_QNAME, FullResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCHidRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByCHidRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByCHidDetailledRequest")
    public JAXBElement<GetByCHidRequestType> createGetByCHidDetailledRequest(GetByCHidRequestType value) {
        return new JAXBElement<GetByCHidRequestType>(_GetByCHidDetailledRequest_QNAME, GetByCHidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCHidRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByCHidRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByCHidFullRequest")
    public JAXBElement<GetByCHidRequestType> createGetByCHidFullRequest(GetByCHidRequestType value) {
        return new JAXBElement<GetByCHidRequestType>(_GetByCHidFullRequest_QNAME, GetByCHidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailledResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailledResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByCHidDetailledResponse")
    public JAXBElement<DetailledResponseType> createGetByCHidDetailledResponse(DetailledResponseType value) {
        return new JAXBElement<DetailledResponseType>(_GetByCHidDetailledResponse_QNAME, DetailledResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FullResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByCHidFullResponse")
    public JAXBElement<FullResponseType> createGetByCHidFullResponse(FullResponseType value) {
        return new JAXBElement<FullResponseType>(_GetByCHidFullResponse_QNAME, FullResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByUidRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByUidRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByUidDetailledRequest")
    public JAXBElement<GetByUidRequestType> createGetByUidDetailledRequest(GetByUidRequestType value) {
        return new JAXBElement<GetByUidRequestType>(_GetByUidDetailledRequest_QNAME, GetByUidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByUidRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByUidRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByUidFullRequest")
    public JAXBElement<GetByUidRequestType> createGetByUidFullRequest(GetByUidRequestType value) {
        return new JAXBElement<GetByUidRequestType>(_GetByUidFullRequest_QNAME, GetByUidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailledResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailledResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByUidDetailledResponse")
    public JAXBElement<DetailledResponseType> createGetByUidDetailledResponse(DetailledResponseType value) {
        return new JAXBElement<DetailledResponseType>(_GetByUidDetailledResponse_QNAME, DetailledResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FullResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getByUidFullResponse")
    public JAXBElement<FullResponseType> createGetByUidFullResponse(FullResponseType value) {
        return new JAXBElement<FullResponseType>(_GetByUidFullResponse_QNAME, FullResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSHABRefsByDateRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSHABRefsByDateRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getSHABRefsByDateRequest")
    public JAXBElement<GetSHABRefsByDateRequestType> createGetSHABRefsByDateRequest(GetSHABRefsByDateRequestType value) {
        return new JAXBElement<GetSHABRefsByDateRequestType>(_GetSHABRefsByDateRequest_QNAME, GetSHABRefsByDateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSHABMessageRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSHABMessageRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getSHABMessageRequest")
    public JAXBElement<GetSHABMessageRequestType> createGetSHABMessageRequest(GetSHABMessageRequestType value) {
        return new JAXBElement<GetSHABMessageRequestType>(_GetSHABMessageRequest_QNAME, GetSHABMessageRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShabRefsByDateResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShabRefsByDateResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getSHABRefsByDateResponse")
    public JAXBElement<ShabRefsByDateResponseType> createGetSHABRefsByDateResponse(ShabRefsByDateResponseType value) {
        return new JAXBElement<ShabRefsByDateResponseType>(_GetSHABRefsByDateResponse_QNAME, ShabRefsByDateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShabMessageResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShabMessageResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getSHABMessageResponse")
    public JAXBElement<ShabMessageResponseType> createGetSHABMessageResponse(ShabMessageResponseType value) {
        return new JAXBElement<ShabMessageResponseType>(_GetSHABMessageResponse_QNAME, ShabMessageResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalFormsResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LegalFormsResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getLegalFormsResponse")
    public JAXBElement<LegalFormsResponseType> createGetLegalFormsResponse(LegalFormsResponseType value) {
        return new JAXBElement<LegalFormsResponseType>(_GetLegalFormsResponse_QNAME, LegalFormsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BfsCommunitiesResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BfsCommunitiesResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getBFSCommunitiesResponse")
    public JAXBElement<BfsCommunitiesResponseType> createGetBFSCommunitiesResponse(BfsCommunitiesResponseType value) {
        return new JAXBElement<BfsCommunitiesResponseType>(_GetBFSCommunitiesResponse_QNAME, BfsCommunitiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryOfficesResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryOfficesResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getRegistryOfficesResponse")
    public JAXBElement<RegistryOfficesResponseType> createGetRegistryOfficesResponse(RegistryOfficesResponseType value) {
        return new JAXBElement<RegistryOfficesResponseType>(_GetRegistryOfficesResponse_QNAME, RegistryOfficesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryOfficesRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryOfficesRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.e-service.admin.ch/zefix/2015-06-26", name = "getRegistryOfficesRequest")
    public JAXBElement<RegistryOfficesRequestType> createGetRegistryOfficesRequest(RegistryOfficesRequestType value) {
        return new JAXBElement<RegistryOfficesRequestType>(_GetRegistryOfficesRequest_QNAME, RegistryOfficesRequestType.class, null, value);
    }

}
