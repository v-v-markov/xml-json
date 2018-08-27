package training.launcher;

import training.data.Addresses;
import training.exceptions.ExecutionException;
import org.apache.commons.cli.*;
import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * Class used to create command line interface and parse command line input.
 */
public class ParserLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParserLauncher.class);
    private static final String HELP_CMD_SHORT_NAME = "h";
    private static final String HELP_CMD_LONG_NAME = "help";
    private static final String HELP_CMD_DESCRIPTION = "Show help info";
    private static final String FILE_CMD_SHORT_NAME = "f";
    private static final String FILE_CMD_LONG_NAME = "file";
    private static final String FILE_CMD_DESCRIPTION = "File to be parsed";
    private static final String CMD_LINE_SYNTAX = "parser [options] <filename>";
    private List<ParserWrapper> parsers = new ArrayList<ParserWrapper>();

    public void start(final String[] args) {
        LOGGER.debug("Start application");
        try {
            final CommandLine commandLine = parseArguments(args);
            evaluateCommands(commandLine);
            LOGGER.debug("Finished successfully");

        } catch (ParseException e) {
            LOGGER.error("Error while parsing arguments: " + e);
        }
    }

    public void addParser(final ParserWrapper parser) {
        LOGGER.debug("Added parser with key " + parser.getName());
        this.parsers.add(parser);
    }

    private CommandLine parseArguments(final String[] args) throws ParseException {
        LOGGER.debug("Parse input arguments: " + ArrayUtils.toString(args));


        final CommandLineParser parser = new BasicParser();
        final Options options = getDefaultOptions();
        options.addOptionGroup(getParserOptionGroup());
        return parser.parse(options, args);
    }


    private Options getDefaultOptions() {
        final Options options = new Options();

        options.addOption(OptionBuilder
                .withDescription(HELP_CMD_DESCRIPTION)
                .withLongOpt(HELP_CMD_LONG_NAME)
                .create(HELP_CMD_SHORT_NAME));

        options.addOption(OptionBuilder
                .hasArg()
                .withDescription(FILE_CMD_DESCRIPTION)
                .withLongOpt(FILE_CMD_LONG_NAME)
                .create(FILE_CMD_SHORT_NAME));
        return options;
    }
    private OptionGroup getParserOptionGroup() {
        final OptionGroup group = new OptionGroup();

        for (final ParserWrapper parser : parsers) {
            group.addOption(parser.getCliOption());
        }
        return group;
    }

    private void evaluateCommands(final CommandLine cmd) {
        if (cmd.hasOption(HELP_CMD_SHORT_NAME)) {
            printHelp();
            LOGGER.debug("Help info printed. Exit");
            return;
        }

        if (cmd.hasOption(FILE_CMD_SHORT_NAME)) {
            final String filename = cmd.getOptionValue(FILE_CMD_SHORT_NAME);
            LOGGER.debug("Filename set as: " + filename);

            for (final ParserWrapper parser : parsers) {
                if (cmd.hasOption(parser.getName())) {
                    try {
                        final Addresses addresses = parser.getParser().parse(filename);
                        printOutput(addresses);
                    } catch (ExecutionException e) {
                        LOGGER.error("Some error during parsing", e);
                    }
                }
            }
            LOGGER.debug("Could not find specified parser, show help message");
        }
        LOGGER.debug("No filename supplied, show help message");
        printHelp();
    }


    private void printHelp() {
        final HelpFormatter formatter = new HelpFormatter();
        final Options defaultOptions = getDefaultOptions();
        defaultOptions.addOptionGroup(getParserOptionGroup());
        formatter.printHelp(CMD_LINE_SYNTAX, defaultOptions);
    }

    private void printOutput(final Addresses addresses) {
        System.out.println(addresses);
    }
}
