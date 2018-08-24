package training.test;

import training.parser.xmlparser.JAXBParser;
import training.util.TestModelGenerator;
import org.testng.annotations.Test;


public class TestXmlValidated extends TestParserBase {

    @Test
    public void testJAXB() throws Exception {
        testParser(new JAXBParser(true), "JAXB parser", "/input_1.xml", TestModelGenerator.getTestData1());
    }

}
