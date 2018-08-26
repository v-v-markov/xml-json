package training.data;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import training.parser.jsonparser.JacksonPhonesBuilder;

import javax.xml.bind.annotation.*;

/**
 * Phones.
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@JsonDeserialize(builder = JacksonPhonesBuilder.class)
public class Phones {
    public static final String MOBILE = "mobile";
    public static final String WORK = "work";
    public static final String HOME = "home";

    @XmlAttribute
    private String type;
    @XmlValue
    private String phone;

    @XmlTransient
    private String work;
    @XmlTransient
    private String home;
    @XmlTransient
    private String mobile;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "type='" + type + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Phones phones = (Phones) o;

        return new EqualsBuilder()
                .append(type, phones.type)
                .append(phone, phones.phone)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(phone)
                .toHashCode();
    }
}
