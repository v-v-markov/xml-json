package training.parser;

import training.data.Addresses;
import training.data.Cars;
import training.exceptions.ExecutionException;


/**
 * Common parser interface.
 */
public interface Parser {

    /**
     * Reads file with name fileName and try to parse it to Cars.
     *
     * @param fileName - name of parsing file
     * @return Cars object deserialized from file
     * @throws training.exceptions.ExecutionException
     *          if error while reading file or
     *          file contains inconsistent format, or another parser error
     */
    Addresses parse(final String fileName) throws ExecutionException;
}
