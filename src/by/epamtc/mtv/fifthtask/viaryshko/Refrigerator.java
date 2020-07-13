package by.epamtc.mtv.fifthtask.viaryshko;

public class Refrigerator {

    private final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private final String WEIGHT = "WEIGHT";
    private final String FREEZER_CAPACITY = "FREEZER_CAPACITY";
    private final String OVERALL_CAPACITY = "OVERALL_CAPACITY";
    private final String HEIGHT = "HEIGHT";
    private final String WIDTH = "WIDTH";
    private final String NAME = "Refrigerator";
    private String name;
    private String searchedProperty;
    private String value;

    public Refrigerator(){

        this.name = NAME;
    }

    public void searchByPowerConsumption(String powerConsumption){
        this.value = powerConsumption;
        this.searchedProperty = POWER_CONSUMPTION;
    }

    public void searchByWeight(String weight){
        this.value = weight;
        this.searchedProperty = WEIGHT;
    }

    public void searchByFreezerCapacity(String freezerCapacity){
        this.value = freezerCapacity;
        this.searchedProperty = FREEZER_CAPACITY;
    }

    public void searchByOverallCapacity(String overallCapacity){
        this.value = overallCapacity;
        this.searchedProperty = OVERALL_CAPACITY;
    }

    public void searchByHeight(String height){
        this.value = height;
        this.searchedProperty = HEIGHT;
    }

    public void searchByWidth(String width){
        this.value = width;
        this.searchedProperty = WIDTH;
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

    public String getWEIGHT() {
        return WEIGHT;
    }

    public String getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public String getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public String getHEIGHT() {
        return HEIGHT;
    }

    public String getWIDTH() {
        return WIDTH;
    }

    public String getNAME() {
        return NAME;
    }
}
