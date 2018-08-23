package training.data;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * Addresses list.
 *
 */


public class Addresses {
    private List<Address> addresses = new ArrayList<>();

    private String error;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "addresses=" + addresses +
                ", error='" + error + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Addresses addresses1 = (Addresses) o;

        return new EqualsBuilder()
                .append(addresses, addresses1.addresses)
                .append(error, addresses1.error)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(addresses)
                .append(error)
                .toHashCode();
    }
}
