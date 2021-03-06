package training.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.xml.bind.annotation.*;

/**
 * Address.
 *
 */


@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    @XmlElement(required = true, defaultValue = "Unknown")
    private String name;
    @XmlElement
    private String city;
    @XmlElement
    private String street;

    @XmlElement(name = "phone", required = true)
    private Phones phones;

    @XmlElement(name = "documents", required = true)
    @JsonProperty("documents")
    private DocumentsType documentList;

    public DocumentsType getDocumentList() {
        return documentList;
    }

    public void setDocumentList(final DocumentsType documentList) {
        this.documentList = documentList;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(final Phones phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Address{"
                + "name='" + name + '\''
                + ", city='" + city + '\''
                + ", street='" + street + '\''
                + ", phones=" + phones
                + ", documents=" + documentList
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

        final Address address = (Address) o;

        return new EqualsBuilder()
                .append(name, address.name)
                .append(city, address.city)
                .append(street, address.street)
                .append(phones, address.phones)
                .append(documentList, address.documentList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(name)
                .append(city)
                .append(street)
                .append(phones)
                .append(documentList)
                .toHashCode();
    }
}
