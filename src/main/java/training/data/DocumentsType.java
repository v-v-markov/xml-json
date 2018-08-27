package training.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Documents list.
 */
public class DocumentsType {
    @XmlElement(required = true)
    protected List<Document> document;

    public DocumentsType() {
    }

    @JsonCreator
    public DocumentsType(@JsonProperty("passport") final String passport,
                         @JsonProperty("driving permit") final String drivingPermit) {
        Document document = new Document();
        if (StringUtils.isNotEmpty(passport)) {
            document.setType(Document.PAS);
            document.setNum(passport);
            getDocument().add(document);

        }
        if (StringUtils.isNotEmpty(drivingPermit)) {
            document = new Document();
            document.setType(Document.DP);
            document.setNum(drivingPermit);
            getDocument().add(document);

        }
    }

    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<Document>();
        }
        return this.document;
    }

    @Override
    public String toString() {
        return "DocumentsType{"
                + "document=" + document
                + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final DocumentsType that = (DocumentsType) o;

        return new EqualsBuilder()
                .append(document, that.document)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(document)
                .toHashCode();
    }
}
