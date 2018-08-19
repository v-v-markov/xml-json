package training.launcher;

import training.parser.Parser;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;

/**
 * Class wrapper to store different parsers with names and descriptions.
 */
public class ParserWrapper {
    private String name;
    private String description;
    private Parser parser;

    public ParserWrapper(final String name, final String description, final Parser parser) {
        setName(name);
        setDescription(description);
        setParser(parser);
    }

    public Option getCliOption() {
        return OptionBuilder
            .withLongOpt(getName())
            .withDescription(getDescription())
            .create();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(final Parser parser) {
        this.parser = parser;
    }

}
