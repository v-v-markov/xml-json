package training.parser;


import training.data.Cars;
import training.exceptions.ExecutionException;


/**
 * Extended parser interface which can be used to enable/disable validation while parsing.
 */
public interface ValidatingParser extends Parser {

    /**
     * Reads file with name fileName and try to parse it to Cars.
     *
     * @param fileName - name of parsing file
     * @param validate - if true validation will be enabled.
     * @return Cars object deserialized from file
     * @throws training.exceptions.ExecutionException
     *          if error while reading file or
     *          file contains inconsistent format or other parsing exception
     */
    Cars parse(final String fileName, final boolean validate) throws ExecutionException;
}
