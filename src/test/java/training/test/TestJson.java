package training.test;

import training.parser.jsonparser.JacksonBindingParser;
import training.util.TestModelGenerator;
import org.testng.annotations.Test;


public class TestJson extends TestParserBase {

    @Test
    public void testJacksonBinding() throws Exception {
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_1.json", TestModelGenerator.getTestData1());
    }

}
