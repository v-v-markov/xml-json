package training.parser.jsonparser;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import training.data.Addresses;
import training.exceptions.ExecutionException;
import training.parser.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.File;
import java.io.IOException;


/**
 * Parser instance uses Jackson library with binding API to parse JSON file.
 */
public class JacksonBindingParser implements Parser {
    private static final Logger LOGGER = LoggerFactory.getLogger(JacksonBindingParser.class);

    @Override
    public Addresses parse(final String fileName) throws ExecutionException {

        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            return mapper.readValue(new File(fileName), Addresses.class);
        } catch (IOException e) {
            LOGGER.error("Error during parsing file with name: " + fileName, e);
            throw new ExecutionException("IOException while parsing file: " + e.getMessage(), e);
        }
    }
}
