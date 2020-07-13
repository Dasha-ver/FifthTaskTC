package by.epamtc.mtv.fifthtask.viaryshko;

import java.util.Objects;

public class Speakers {

    private final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private final String NUMBER_OF_SPEAKERS = " NUMBER_OF_SPEAKERS";
    private final String FREQUENCY_RANGE = "FREQUENCY_RANGE";
    private final String CORD_LENGTH = "CORD_LENGTH";
    private final String NAME = "Speakers";
    private String name;
    private String searchedProperty;
    private String value;

    public Speakers() {

        this.name = NAME;
    }

    public void searchByPowerConsumption(String powerConsumption) {
        this.value = powerConsumption;
        this.searchedProperty = POWER_CONSUMPTION;
    }

    public void searchByNumberOfSpeakers(String numberOfSpeakers) {
        this.value = numberOfSpeakers;
        this.searchedProperty = NUMBER_OF_SPEAKERS;
    }

    public void searchByFrequencyRange(String frequencyRange) {
        this.value = frequencyRange;
        this.searchedProperty = FREQUENCY_RANGE;
    }

    public void searchByCordLength(String cordLength) {
        this.value = cordLength;
        this.searchedProperty = CORD_LENGTH;
    }

    public String getName() {
        return name;
    }

    public String getSearchedProperty() {
        return searchedProperty;
    }

    public String getValue() {
        return value;
    }

    public String getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public String getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public String getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public String getCORD_LENGTH() {
        return CORD_LENGTH;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof Speakers)) {
            return false;
        }

        Speakers speakers = (Speakers) o;

        return Objects.equals(getName(), speakers.getName()) &&
                Objects.equals(getSearchedProperty(), speakers.getSearchedProperty()) &&
                Objects.equals(getValue(), speakers.getValue()) &&
                Objects.equals(getNAME(), speakers.getNAME()) &&
                Objects.equals(getPOWER_CONSUMPTION(), speakers.getPOWER_CONSUMPTION()) &&
                Objects.equals(getCORD_LENGTH(), speakers.getCORD_LENGTH()) &&
                Objects.equals(getFREQUENCY_RANGE(), speakers.getFREQUENCY_RANGE()) &&
                Objects.equals(getNUMBER_OF_SPEAKERS(), speakers.getNUMBER_OF_SPEAKERS());

    }

    public int hashCode() {
        return Objects.hash(getName(), getSearchedProperty(), getValue(), getNAME(), getPOWER_CONSUMPTION(),
                getCORD_LENGTH(), getFREQUENCY_RANGE(), getNUMBER_OF_SPEAKERS());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", NUMBER_OF_SPEAKERS='" + NUMBER_OF_SPEAKERS + '\'' +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
                ", CORD_LENGTH='" + CORD_LENGTH + '\'' +
                ", NAME='" + NAME + '\'' +
                ", name='" + name + '\'' +
                ", searchedProperty='" + searchedProperty + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
