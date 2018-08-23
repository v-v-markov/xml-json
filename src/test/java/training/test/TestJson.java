package training.test;

import training.parser.jsonparser.JacksonBindingParser;
import training.util.TestModelGenerator;
import org.testng.annotations.Test;


public class TestJson extends TestParserBase {

    @Test
    public void testJacksonBinding() throws Exception {
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_1.json", TestModelGenerator.getTestData1());
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_2.json", TestModelGenerator.getTestData2());
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_3.json", TestModelGenerator.getTestData3());
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_4.json", TestModelGenerator.getTestData4());
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_5.json", TestModelGenerator.getTestData1());
        testParser(new JacksonBindingParser(), "Jackson Binding", "/input_6.json", TestModelGenerator.getTestData6());
    }

}
