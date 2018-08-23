package training.data;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Phones.
 *
 */


public class Phones {
    private String work;
    private String home;
    private String mobile;

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
                "work='" + work + '\'' +
                ", home='" + home + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Phones phones = (Phones) o;

        return new EqualsBuilder()
                .append(work, phones.work)
                .append(home, phones.home)
                .append(mobile, phones.mobile)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(work)
                .append(home)
                .append(mobile)
                .toHashCode();
    }
}
