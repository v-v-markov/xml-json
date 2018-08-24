package training.test;

import training.data.Addresses;
import training.parser.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URL;
import org.testng.Assert;


public class TestParserBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestParserBase.class);


    protected void testParser(
        final Parser parser, final String parserName,
        final String resource, final Addresses example
    ) throws Exception {
        if (LOGGER.isDebugEnabled()) {
            final StringBuilder builder = new StringBuilder("Test input parameters are not null, parserName: <");
            builder.append(parserName).append(">");
            builder.append(" resource: <").append(resource).append(">");
            LOGGER.debug(builder.toString());
        }

        final URL url = getClass().getResource(resource);
        final Addresses parsedData = parser.parse(url.getFile());
        Assert.assertEquals(parsedData, example);
    }

}
