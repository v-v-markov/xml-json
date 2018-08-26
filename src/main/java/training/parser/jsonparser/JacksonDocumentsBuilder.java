package training.parser.jsonparser;

import training.data.Phones;

import static training.data.Phones.*;

/**
 * Builder to deserialize Documents.
 */
public class JacksonDocumentsBuilder {
    private String type;
    private String phone;

    public JacksonDocumentsBuilder() {

    }

    public JacksonDocumentsBuilder withHome(final String home) {
        this.phone = home;
        this.type = HOME;
        return this;
    }

    public JacksonDocumentsBuilder withMobile(final String mobile) {
        this.phone = mobile;
        this.type = MOBILE;
        return this;
    }

    public JacksonDocumentsBuilder withWork(final String work) {
        this.phone = work;
        this.type = WORK;
        return this;
    }

    public Phones build() {
        final Phones phones = new Phones();
        phones.setPhone(phone);
        phones.setType(type);
        return phones;
    }

}
