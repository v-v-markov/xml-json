package training.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Phones.
 *
 */


public class Documents {
    private String drivingPermit;
    private String passport;

    public String getDrivingPermit() {
        return drivingPermit;
    }

    @JsonProperty("driving permit")
    public void setDrivingPermit(String drivingPermit) {
        this.drivingPermit = drivingPermit;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "drivingPermit='" + drivingPermit + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Documents documents = (Documents) o;

        return new EqualsBuilder()
                .append(drivingPermit, documents.drivingPermit)
                .append(passport, documents.passport)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(drivingPermit)
                .append(passport)
                .toHashCode();
    }
}
