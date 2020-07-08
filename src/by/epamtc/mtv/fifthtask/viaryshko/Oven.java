package by.epamtc.mtv.fifthtask.viaryshko;

public class Oven {

    private final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private final String WEIGHT = "WEIGHT";
    private final String CAPACITY = "CAPACITY";
    private final String DEPTH = "DEPTH";
    private final String HEIGHT= "HEIGHT";
    private final String WIDTH= "WIDTH";
    private final String NAME = "Oven";
    private String name;
    private String searchedProperty;
    private String value;

    public Oven(){

        this.name = NAME;
    }

    public void searchByPowerConsumption(String powerConsumption) {
        this.value = powerConsumption;
        this.searchedProperty = POWER_CONSUMPTION;
    }

    public void searchByWeight(String weight) {
        this.value = weight;
        this.searchedProperty = WEIGHT;
    }

    public void searchByDepth(String depth) {
        this.value = depth;
        this.searchedProperty = DEPTH;
    }

    public void searchByWidth(String width) {
        this.value = width;
        this.searchedProperty = WIDTH;
    }

    public void searchByHeight(String height) {
        this.value = height;
        this.searchedProperty = HEIGHT;
    }

    public void searchByCapacity(String capacity) {
        this.value = capacity;
        this.searchedProperty = CAPACITY;
    }

    public String getSearchedProperty() {
        return searchedProperty;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
