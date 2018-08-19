package training.launcher;


import training.parser.jsonparser.JacksonBindingParser;
import training.parser.xmlparser.JAXBParser;


/**
 * Main class for console application.
 */
public final class Main {

    private Main() {
        throw new UnsupportedOperationException();
    }

    public static void main(final String[] args) {
        final ParserLauncher parserLauncher = new ParserLauncher();
        parserLauncher.addParser(new ParserWrapper(
            "jackson-binding", "Use Jackson binding parser for parse json file", new JacksonBindingParser()));
        parserLauncher.addParser(new ParserWrapper("jaxb", "Use JAXB parser for parse xml file", new JAXBParser()));
        parserLauncher.start(args);
    }
}
