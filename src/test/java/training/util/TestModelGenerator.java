package training.util;

import training.data.*;

import static training.data.Document.DP;
import static training.data.Document.PAS;
import static training.data.Phones.HOME;
import static training.data.Phones.MOBILE;
import static training.data.Phones.WORK;

/**
 * Utility class to create object with predefined information, in tests.
 */
public class TestModelGenerator {

    /**
     * Get input_1 test data.
     *
     * @return Addresses object with the same data as in corresponding resource file.
     */
    public static Addresses getTestData1() {
        final Addresses example = new Addresses();

        Address address = new Address();
        address.setName("Pupkin");
        address.setCity("Novosibirsk");
        address.setStreet("Demakova");
        Phones phones = new Phones();
        phones.setPhone("+79139130000");
        phones.setType(MOBILE);
        address.setPhones(phones);
        DocumentsType documents = new DocumentsType();
        documents.getDocument().add(Document.createDocument(DP, "123DP"));
        address.setDocumentList(documents);
        example.getAddresses().add(address);

        address = new Address();
        address.setName("Losev");
        phones = new Phones();
        phones.setPhone("+73834913400");
        phones.setType(HOME);
        address.setPhones(phones);
        documents = new DocumentsType();
        documents.getDocument().add(Document.createDocument(PAS, "1234PAS"));
        documents.getDocument().add(Document.createDocument(DP, "1234DP"));
        address.setDocumentList(documents);
        example.getAddresses().add(address);

        address = new Address();
        address.setName("Ivanov");
        address.setCity("Moscow");
        address.setStreet("Lenina");
        phones = new Phones();
        phones.setPhone("+73834913400");
        phones.setType(WORK);
        address.setPhones(phones);
        documents = new DocumentsType();
        documents.getDocument().add(Document.createDocument(PAS, "12345PAS"));
        address.setDocumentList(documents);
        example.getAddresses().add(address);

        address = new Address();
        address.setName("Petrov");
        address.setCity("St.Petersburg");
        address.setStreet("Demakova");
        phones = new Phones();
        phones.setPhone("+73834913400");
        phones.setType(HOME);
        address.setPhones(phones);
        documents = new DocumentsType();
        documents.getDocument().add(Document.createDocument(PAS, "123456PAS"));
        documents.getDocument().add(Document.createDocument(DP, "123456DP"));
        address.setDocumentList(documents);
        example.getAddresses().add(address);

        return example;
    }

    /**
     * Get input_2 test data.
     *
     * @return Addresses object with the same data as in corresponding resource file.
     */
    public static Addresses getTestData2() {
        final Addresses example = new Addresses();

        Address address = new Address();
        address.setName("Ivanov");
        address.setCity("Moscow");
        address.setStreet("Lenina");
        Phones phones = new Phones();
        phones.setWork("+73834913400");
        address.setPhones(phones);
        Documents documents = new Documents();
        documents.setPassport("12345PAS");
        address.setDocuments(documents);
        example.getAddresses().add(address);

        return example;
    }

    /**
     * Get input_3 test data.
     *
     * @return Addresses object with the same data as in corresponding resource file.
     */
    public static Addresses getTestData3() {
        return new Addresses();
    }

    /**
     * Get input_4 test data.
     *
     * @return Addresses object with the same data as in corresponding resource file.
     */
    public static Addresses getTestData4() {
        final Addresses addresses = getTestData1();
        addresses.getAddresses().get(0).getPhones().setMobile("89139130000");
        addresses.getAddresses().get(1).getPhones().setHome("83834913400");
        addresses.getAddresses().get(2).getPhones().setWork("83834913400");
        addresses.getAddresses().get(3).getPhones().setHome("83834913400");
        return addresses;
    }

    /**
     * Get input_6 test data.
     *
     * @return Addresses object with the same data as in corresponding resource file.
     */
    public static Addresses getTestData6() {
        final Addresses addresses = new Addresses();
        addresses.setError("Can't receive data");
        return addresses;
    }
}
