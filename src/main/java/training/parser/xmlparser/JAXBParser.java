package training.parser.xmlparser;


import training.data.Addresses;
import training.exceptions.ExecutionException;
import training.parser.ValidatingParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;


/**
 * Parser instance uses JAXB library to parse XML file.
 */
public class JAXBParser implements ValidatingParser {
    private static final Logger LOGGER = LoggerFactory.getLogger(JAXBParser.class);

    private boolean validation;

    public JAXBParser() {

    }

    public JAXBParser(final boolean  validation) {
        this.validation = validation;
    }

    @Override
    public Addresses parse(final String fileName, final boolean validate)
        throws ExecutionException {

        try {
            final JAXBContext context = JAXBContext.newInstance(Addresses.class);

            final Unmarshaller unmarshaller = context.createUnmarshaller();


            if (validate) {
                final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                final Schema schema = sf.newSchema(
                    new File(this.getClass().getResource("/schema_task1_1.xsd").getFile()));

                unmarshaller.setSchema(schema);
                unmarshaller.setEventHandler(new ValidationEventHandler() {
                    public boolean handleEvent(final ValidationEvent event) {
                        return false;
                    }
                });
            }

            return (Addresses) unmarshaller.unmarshal(new File(fileName));

        } catch (JAXBException e) {
            LOGGER.error("Error during JAXBParser, JAXException", e);
            throw new ExecutionException("JAXBException while unmarshalling: " + e.getMessage(), e);
        } catch (SAXException e) {
            LOGGER.error("Error during JAXBParser, SAXException", e);
            throw new ExecutionException("Schema file not found", e);
        }
    }

    @Override
    public Addresses parse(final String fileName) throws ExecutionException {
        return parse(fileName, validation);
    }
}
