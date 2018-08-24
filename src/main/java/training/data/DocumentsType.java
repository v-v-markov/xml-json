package training.data;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Documents list.
 */
public class DocumentsType {
    @XmlElement(required = true)
    protected List<Document> document;

    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<Document>();
        }
        return this.document;
    }

    @Override
    public String toString() {
        return "DocumentsType{" +
                "document=" + document +
                '}';
    }
}
