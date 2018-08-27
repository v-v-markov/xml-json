package training.data;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.xml.bind.annotation.*;

/**
 * Document.
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Document {
    public static final String DP = "driving permit";
    public static final String PAS = "passport";

    @XmlAttribute
    private String type;
    @XmlValue
    private String num;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(final String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Document{"
                + "type='" + type + '\''
                + ", num='" + num + '\''
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

        final Document phones = (Document) o;

        return new EqualsBuilder()
                .append(type, phones.type)
                .append(num, phones.num)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(type)
                .append(num)
                .toHashCode();
    }

    public static Document createDocument(final String type, final String num) {
        final Document document = new Document();
        document.type = type;
        document.num = num;
        return document;
    }

}
