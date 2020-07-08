package by.epamtc.mtv.fifthtask.viaryshko;

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

    public void searchByPowerConsumption(String powerConsumption){
        this.value = powerConsumption;
        this.searchedProperty = POWER_CONSUMPTION;
    }

    public void searchByNumberOfSpeakers(String numberOfSpeakers){
        this.value = numberOfSpeakers;
        this.searchedProperty = NUMBER_OF_SPEAKERS;
    }

    public void searchByFrequencyRange(String frequencyRange){
        this.value = frequencyRange;
        this.searchedProperty = FREQUENCY_RANGE;
    }

    public void searchByCordLength(String cordLength){
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
}
