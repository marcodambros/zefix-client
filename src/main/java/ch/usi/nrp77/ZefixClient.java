package ch.usi.nrp77;

import ch.admin.e_service.zefix._2015_06_26.*;
import javax.xml.ws.BindingProvider;

import org.w3c.dom.Element;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class ZefixClient {

    private static Logger LOGGER = LoggerFactory.getLogger(ZefixClient.class);

    private final ZefixServicePortType zefixService;
    private final ObjectFactory objectFactory;

    private static Options createCLIOptions() {
        Options options = new Options();
        options.addOption("u", "user", true, "Zefix API username");
        options.addOption("p", "password", true, "Zefix API password");
        options.addOption("s", "search", true, "Search company by name");
        options.addOption("c", "get-chid", true, "Get company details for given CH id");
        options.addOption("i", "get-uid", true, "Get company details for given UID");
        options.addOption("e", "get-ehra", true, "Get company details for given EHRA id");
        options.addOption("t", "publication", true, "Get the text of the SHAB publication given the SHAB id");
        options.addOption("h", "help", false, "Print this message");

        return options;
    }


    public ZefixClient(String user, String password) {
        ZefixService zs = new ZefixService();
        zefixService = zs.getZefixServicePort();
        BindingProvider prov = (BindingProvider) zefixService;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, user);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
        objectFactory = new ObjectFactory();
    }

    public void searchByNameAndLogResults(String name) {
        SearchByNameRequest request = new SearchByNameRequest();
        request.setName(name);

        ShortResponse response = zefixService.searchByName(request);

        LOGGER.info("Searching in zefix for company matching name {}", name);
        if (response.getErrors() == null) {
            LOGGER.info("Found {} companies. Printing details below", response.getResult().getCompanyInfo().size());
            for (CompanyShortInfoType ci : response.getResult().getCompanyInfo()) {
                LOGGER.info("ci.getName() => {}", ci.getName());
                LOGGER.info("ci.getChid() => {}", ci.getChid());
                LOGGER.info("ci.getLegalSeat() => {}", ci.getLegalSeat());
                LOGGER.info("ci.getEhraid() => {}", ci.getEhraid());
                LOGGER.info("ci.getLegalform() => {}", ci.getLegalform());
                LOGGER.info("ci.getLegalSeatId() => {}", ci.getLegalSeatId());
                LOGGER.info("ci.getRadDate() => {}", ci.getRadDate());
                LOGGER.info("ci.getRegisterOfficeId() => {}", ci.getRegisterOfficeId());
                LOGGER.info("ci.getStatus() => {}", ci.getStatus());
                LOGGER.info("ci.getStatus() => {}", ci.getStatus());
                LOGGER.info("ci.getUid() => {}", ci.getUid());
                LOGGER.info("-----------------------------------------");
            }
        } else {
            LOGGER.error("Got the following {} errors", response.getErrors().getError().size());
            for (ErrorsType.Error error : response.getErrors().getError()) {
                LOGGER.error(error.getMessage());
            }
        }
    }

    public void getByChIdAndLog(String chId) {
        GetByCHidRequestType chIdRequestType = objectFactory.createGetByCHidRequestType();
        chIdRequestType.setChid(chId);

        FullResponseType results = zefixService.getByCHidFull(chIdRequestType);

        LOGGER.info("Looking in zefix for company with CH id = {}", chId);
        if (results.getErrors() == null) {
            LOGGER.info("Company with CH id = {} found. Printing details below", chId);
            logListOfCompanies(results.getResult().getCompanyInfo());
        } else {
            LOGGER.error("Got the following {} errors", results.getErrors().getError().size());
            for (ErrorsType.Error error : results.getErrors().getError()) {
                LOGGER.error(error.getMessage());
            }
        }
    }


    public void getByUidAndLog(String uid) {
        GetByUidRequestType uidRequestType = objectFactory.createGetByUidRequestType();
        uidRequestType.setUid(Integer.parseInt(uid));

        FullResponseType results = zefixService.getByUidFull(uidRequestType);

        LOGGER.info("Looking in zefix for company with UID = {}", uid);
        if (results.getErrors() == null) {
            LOGGER.info("Company with UID = {} found. Printing details below", uid);
            logListOfCompanies(results.getResult().getCompanyInfo());
        } else {
            LOGGER.error("Got the following {} errors", results.getErrors().getError().size());
            for (ErrorsType.Error error : results.getErrors().getError()) {
                LOGGER.error(error.getMessage());
            }
        }
    }

    public void getByEHRAIdAndLog(String eHRAId) {
        GetByEHRAidRequestType eHRAIdRequestType = objectFactory.createGetByEHRAidRequestType();
        eHRAIdRequestType.setEhraNr(Integer.parseInt(eHRAId));

        FullResponseType results = zefixService.getByEHRAidFull(eHRAIdRequestType);

        LOGGER.info("Looking in zefix for company with EHRA id = {}", eHRAId);
        if (results.getErrors() == null) {
            LOGGER.info("Company with EHRA id = {} found. Printing details below", eHRAId);
            logListOfCompanies(results.getResult().getCompanyInfo());
        } else {
            LOGGER.error("Got the following {} errors", results.getErrors().getError().size());
            for (ErrorsType.Error error : results.getErrors().getError()) {
                LOGGER.error(error.getMessage());
            }
        }
    }


    private void logListOfCompanies(List<CompanyFullInfoType> companyList) {
        for (CompanyFullInfoType companyFullInfo : companyList) {
            LOGGER.info("companyFullInfo.getChid() => {}", companyFullInfo.getChid());
            LOGGER.info("companyFullInfo.getLegalSeat() => {}", companyFullInfo.getLegalSeat());
            LOGGER.info("companyFullInfo.getName() => {}", companyFullInfo.getName());
            LOGGER.info("companyFullInfo.getPurpose() => {}", companyFullInfo.getPurpose());
            LOGGER.info("companyFullInfo.getRegisterOfficeName() => {}", companyFullInfo.getRegisterOfficeName());
            LOGGER.info("companyFullInfo.getWebLink() => {}", companyFullInfo.getWebLink());
            LOGGER.info("companyFullInfo.getWsLink() => {}", companyFullInfo.getWsLink());

            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getAddressLine1() => {} ", companyFullInfo.getAddress().getAddressInformation().getAddressLine1());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getAddressLine2() => {} ", companyFullInfo.getAddress().getAddressInformation().getAddressLine2());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getCountry() => {} ", companyFullInfo.getAddress().getAddressInformation().getCountry());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getDwellingNumber() => {} ", companyFullInfo.getAddress().getAddressInformation().getDwellingNumber());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getForeignZipCode() => {} ", companyFullInfo.getAddress().getAddressInformation().getForeignZipCode());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getHouseNumber() => {} ", companyFullInfo.getAddress().getAddressInformation().getHouseNumber());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getLocality() => {} ", companyFullInfo.getAddress().getAddressInformation().getLocality());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getPostOfficeBoxText() => {} ", companyFullInfo.getAddress().getAddressInformation().getPostOfficeBoxText());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getStreet() => {} ", companyFullInfo.getAddress().getAddressInformation().getStreet());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getSwissZipCodeAddOn() => {} ", companyFullInfo.getAddress().getAddressInformation().getSwissZipCodeAddOn());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getSwissZipCode().toString() => {} ", companyFullInfo.getAddress().getAddressInformation().getSwissZipCode().toString());
            LOGGER.info("companyFullInfo.getAddress().getAddressInformation().getTown() => {} ", companyFullInfo.getAddress().getAddressInformation().getTown());
            LOGGER.info("companyFullInfo.getAddress().getOrganisation().getFirstName() => {}", companyFullInfo.getAddress().getOrganisation().getFirstName());
            LOGGER.info("companyFullInfo.getAddress().getOrganisation().getLastName() => {}", companyFullInfo.getAddress().getOrganisation().getLastName());
            LOGGER.info("companyFullInfo.getAddress().getOrganisation().getOrganisationName() => {}", companyFullInfo.getAddress().getOrganisation().getOrganisationName());
            LOGGER.info("companyFullInfo.getAddress().getOrganisation().getOrganisationNameAddOn1() => {}", companyFullInfo.getAddress().getOrganisation().getOrganisationNameAddOn1());
            LOGGER.info("companyFullInfo.getAddress().getOrganisation().getOrganisationNameAddOn2() => {}", companyFullInfo.getAddress().getOrganisation().getOrganisationNameAddOn2());
            LOGGER.info("companyFullInfo.getAddress().getOrganisation().getTitle() => {}", companyFullInfo.getAddress().getOrganisation().getTitle());
            if (companyFullInfo.getAddress().getPerson() != null) {
                LOGGER.info("companyFullInfo.getAddress().getPerson().getFirstName() => {}", companyFullInfo.getAddress().getPerson().getFirstName());
                LOGGER.info("companyFullInfo.getAddress().getPerson().getLastName() => {}", companyFullInfo.getAddress().getPerson().getLastName());
                LOGGER.info("companyFullInfo.getAddress().getPerson().getMrMrs() => {}", companyFullInfo.getAddress().getPerson().getMrMrs());
                LOGGER.info("companyFullInfo.getAddress().getPerson().getTitle() => {}", companyFullInfo.getAddress().getPerson().getTitle());
            } else {
                LOGGER.info("companyFullInfo.getAddress().getPerson() => {}", companyFullInfo.getAddress().getPerson());
            }

            LOGGER.info("companyFullInfo.getBranchOffices().size() => {}", companyFullInfo.getBranchOffices().size());
            for (CompanyShortInfoType branchOffice : companyFullInfo.getBranchOffices()) {
                logCompanyShortInfo(branchOffice);
            }

            LOGGER.info("companyFullInfo.getCapitalNom().toString() => {}", companyFullInfo.getCapitalNom().toString());
            LOGGER.info("companyFullInfo.getEhraid().toString() => {}", companyFullInfo.getEhraid().toString());

            LOGGER.info("companyFullInfo.getFurtherMainOffices().size() => {}", companyFullInfo.getFurtherMainOffices().size());
            for (CompanyShortInfoType furtherMainOffice : companyFullInfo.getFurtherMainOffices()) {
                logCompanyShortInfo(furtherMainOffice);
            }

            LOGGER.info("companyFullInfo.getHasTakenOver().size(), {}", companyFullInfo.getHasTakenOver().size());
            for (CompanyShortInfoType takenOverBy : companyFullInfo.getHasTakenOver()) {
                logCompanyShortInfo(takenOverBy);
            }

            LOGGER.info("companyFullInfo.getLegalform().getLegalFormUid() => {}", companyFullInfo.getLegalform().getLegalFormUid());
            LOGGER.info("companyFullInfo.getLegalSeatId() => {}", companyFullInfo.getLegalSeatId());

            LOGGER.info("companyFullInfo.getMainOffices().size() => {}", companyFullInfo.getMainOffices().size());
            for (CompanyShortInfoType mainOffice : companyFullInfo.getMainOffices()) {
                logCompanyShortInfo(mainOffice);
            }

            LOGGER.info("companyFullInfo.getOldLegalSeats().size() => {}", companyFullInfo.getOldLegalSeats().size());
            for (OldLegalSeatType oldLegalSeatType : companyFullInfo.getOldLegalSeats()) {
                LOGGER.info("oldLegalSeatType.getOldLegalSeat() => {}", oldLegalSeatType.getOldLegalSeat());
                LOGGER.info("oldLegalSeatType.getMoveAwayDate().toString() => {}", oldLegalSeatType.getMoveAwayDate().toString());
                LOGGER.info("oldLegalSeatType.getOldLegalSeatId() => {}", oldLegalSeatType.getOldLegalSeatId());
            }


            if (companyFullInfo.getOldNames() != null ) {
                LOGGER.info("companyFullInfo.getOldNames().getOldName().size() => {}", companyFullInfo.getOldNames().getOldName().size());
                for (OldNamesType.OldName oldName : companyFullInfo.getOldNames().getOldName()) {
                    LOGGER.info("oldName.getName() => {}", oldName.getName());
                    LOGGER.info("oldName.getSequenceNr().toString() => {}", oldName.getSequenceNr().toString());
                    LOGGER.info("oldName.getTranslation()");
                    for (TranslationType translationType : oldName.getTranslation()) {
                        LOGGER.info("translationType.getLang() => ", translationType.getLang());
                        LOGGER.info("translationType.getValue() => ", translationType.getValue());
                    }
                }
            } else {
                LOGGER.info("companyFullInfo.getOldNames() => {}", companyFullInfo.getOldNames());
            }

            LOGGER.info("companyFullInfo.getRadDate() => {}", companyFullInfo.getRadDate());
            LOGGER.info("companyFullInfo.getRegisterOfficeId() => {}", companyFullInfo.getRegisterOfficeId());

            LOGGER.info("companyFullInfo.getShabPub().size() => {}", companyFullInfo.getShabPub().size());
            for (ShabPubFullType shabPubFullType : companyFullInfo.getShabPub()) {
                LOGGER.info("shabPubFullType.getRegistryOfficeJournalId() => {}", shabPubFullType.getRegistryOfficeJournalId());
                LOGGER.info("shabPubFullType.getShabId() => {}", shabPubFullType.getShabId());
                LOGGER.info("shabPubFullType.getShabNr() => {}", shabPubFullType.getShabNr());
                LOGGER.info("shabPubFullType.getShabPage() => {}", shabPubFullType.getShabPage());
                LOGGER.info("shabPubFullType.getRegistryOfficeCanton().value() => {}", shabPubFullType.getRegistryOfficeCanton().value());
                LOGGER.info("shabPubFullType.getRegistryOfficeId().toString() => {}", shabPubFullType.getRegistryOfficeId().toString());
                LOGGER.info("shabPubFullType.getRegistryOfficeJournalDate().toString() => {}", shabPubFullType.getRegistryOfficeJournalDate().toString());
                LOGGER.info("shabPubFullType.getShabDate().toString() => {}", shabPubFullType.getShabDate().toString());
                LOGGER.info("shabPubFullType.getShabMutationStatus().toString() => {}", shabPubFullType.getShabMutationStatus().toString());
            }

            LOGGER.info("companyFullInfo.getStatus().value() => {}", companyFullInfo.getStatus().value());

            LOGGER.info("companyFullInfo.getTranslation().size() => {}", companyFullInfo.getTranslation().size());
            for (TranslationType translationType : companyFullInfo.getTranslation()) {
                LOGGER.info("translationType.getLang() => ", translationType.getLang());
                LOGGER.info("translationType.getValue() => ", translationType.getValue());
            }

            LOGGER.info("companyFullInfo.getUid().toString() => {}", companyFullInfo.getUid().toString());
            LOGGER.info("companyFullInfo.getWasTakenOverBy().size() => {}", companyFullInfo.getWasTakenOverBy().size());
            for (CompanyShortInfoType wasTakenOverBy : companyFullInfo.getWasTakenOverBy()) {
                logCompanyShortInfo(wasTakenOverBy);
            }
        }
    }

    private void logCompanyShortInfo(CompanyShortInfoType companyShortInfo) {
        LOGGER.info("companyShortInfo.getName() => {}", companyShortInfo.getName());
        LOGGER.info("companyShortInfo.getChid() => {}", companyShortInfo.getChid());
        LOGGER.info("companyShortInfo.getLegalSeat() => {}", companyShortInfo.getLegalSeat());
        LOGGER.info("companyShortInfo.getEhraid().toString() => {}", companyShortInfo.getEhraid().toString());
        LOGGER.info("companyShortInfo.getLegalform().getLegalFormUid() => {}", companyShortInfo.getLegalform().getLegalFormUid());
        LOGGER.info("companyShortInfo.getLegalSeatId() => {}", companyShortInfo.getLegalSeatId());
        LOGGER.info("companyShortInfo.getRegisterOfficeId() => {}", companyShortInfo.getRegisterOfficeId());
        LOGGER.info("companyShortInfo.getRadDate() => {}", companyShortInfo.getRadDate());
        LOGGER.info("companyShortInfo.getStatus().value() => {}", companyShortInfo.getStatus().value());
        LOGGER.info("companyShortInfo.getUid().toString() => {}", companyShortInfo.getUid().toString());
    }

    private static void exitWithError(String error, HelpFormatter formatter, Options options) {
        System.err.println(error);
        formatter.printHelp("zefix-client-prod", options);
        System.exit(1);
    }

    public static void main(String[] args) {

        CommandLineParser parser = new DefaultParser();
        Options options = ZefixClient.createCLIOptions();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine line = parser.parse( options, args );
            if (line.hasOption("h") || line.getOptions().length == 0) {
                formatter.printHelp( "zefix-client-prod", options);
                System.exit(0);
            } else {
                if (!line.hasOption("u")) {
                    exitWithError("Option --user is mandatory", formatter, options);
                }
                if (!line.hasOption("p")) {
                    exitWithError("Option --password is mandatory", formatter, options);
                }

                String zefixUser = line.getOptionValue("u");
                String zefixPassword = line.getOptionValue("p");
                ZefixClient zefixClient = new ZefixClient(zefixUser, zefixPassword);

                if (line.hasOption("s")) {
                    String companyName = line.getOptionValue("s");
                    zefixClient.searchByNameAndLogResults(companyName);
                }
                if (line.hasOption("c")) {
                    String chId = line.getOptionValue("c");
                    zefixClient.getByChIdAndLog(chId);
                }
                if (line.hasOption("i")) {
                    String uid = line.getOptionValue("i");
                    zefixClient.getByUidAndLog(uid);
                }
                if (line.hasOption("e")) {
                    String eHRAId = line.getOptionValue("e");
                    zefixClient.getByEHRAIdAndLog(eHRAId);
                }
                if (line.hasOption("t")) {
                    String pId = line.getOptionValue("t");
                    GetSHABMessageRequestType getSHABMessageRequestType = new GetSHABMessageRequestType();
                    getSHABMessageRequestType.setId(Integer.parseInt(pId));
                    zefixClient.searchPub(getSHABMessageRequestType);
                }
            }
        }
        catch( ParseException exp ) {
            System.err.println( "Parsing of command line arguments failed.  Reason: " + exp.getMessage());
            formatter.printHelp( "zefix-client-prod", options);
            System.exit(1);
        }

    }

    private void searchPub(GetSHABMessageRequestType getSHABMessageRequestType) {
        ShabMessageResponseType shabMessageResponseType = zefixService.getSHABMessage(getSHABMessageRequestType);
        Element element = (Element) shabMessageResponseType.getResult().getShabMsg().getShabText();
        LOGGER.info("pid = {}, text = {}", getSHABMessageRequestType.getId(), element.getChildNodes().item(0).getTextContent());
    }
}
