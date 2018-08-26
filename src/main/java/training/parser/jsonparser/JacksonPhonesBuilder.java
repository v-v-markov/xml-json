package training.parser.jsonparser;

import training.data.Phones;

import static training.data.Phones.HOME;
import static training.data.Phones.MOBILE;
import static training.data.Phones.WORK;

/**
 * Builder to deserialize Phones.
 */
public class JacksonPhonesBuilder {
    private String type;
    private String phone;

    public JacksonPhonesBuilder() {

    }

    public JacksonPhonesBuilder withHome(final String home) {
        this.phone = home;
        this.type = HOME;
        return this;
    }

    public JacksonPhonesBuilder withMobile(final String mobile) {
        this.phone = mobile;
        this.type = MOBILE;
        return this;
    }

    public JacksonPhonesBuilder withWork(final String work) {
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
