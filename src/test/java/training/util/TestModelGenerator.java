package training.util;

import training.data.Address;
import training.data.Addresses;
import training.data.Documents;
import training.data.Phones;

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
        phones.setMobile("+79139130000");
        address.setPhones(phones);
        Documents documents = new Documents();
        documents.setDrivingPermit("123DP");
        address.setDocuments(documents);
        example.getAddresses().add(address);

        address = new Address();
        address.setName("Losev");
        phones = new Phones();
        phones.setHome("+73834913400");
        address.setPhones(phones);
        documents = new Documents();
        documents.setPassport("1234PAS");
        documents.setDrivingPermit("1234DP");
        address.setDocuments(documents);
        example.getAddresses().add(address);

        address = new Address();
        address.setName("Ivanov");
        address.setCity("Moscow");
        address.setStreet("Lenina");
        phones = new Phones();
        phones.setWork("+73834913400");
        address.setPhones(phones);
        documents = new Documents();
        documents.setPassport("12345PAS");
        address.setDocuments(documents);
        example.getAddresses().add(address);

        address = new Address();
        address.setName("Petrov");
        address.setCity("St.Petersburg");
        address.setStreet("Demakova");
        phones = new Phones();
        phones.setHome("+73834913400");
        address.setPhones(phones);
        documents = new Documents();
        documents.setPassport("123456PAS");
        documents.setDrivingPermit("123456DP");
        address.setDocuments(documents);
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
