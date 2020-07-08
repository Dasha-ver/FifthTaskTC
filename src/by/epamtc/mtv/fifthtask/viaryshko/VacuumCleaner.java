package by.epamtc.mtv.fifthtask.viaryshko;

public class VacuumCleaner {

    private final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private final String FILTER_TYPE = "FILTER_TYPE";
    private final String BAG_TYPE = "BAG_TYPE";
    private final String WAND_TYPE = "WAND_TYPE";
    private final String MOTOR_SPEED_REGULATION = "MOTOR_SPEED_REGULATION";
    private final String CLEANING_WIDTH = "CLEANING_WIDTH";
    private final String NAME = "VacuumCleaner";
    private String name;
    private String searchedProperty;
    private String value;

    public VacuumCleaner(){

        this.name = NAME;
    }

    public void searchByPowerConsumption(String powerConsumption){
        this.value = powerConsumption;
        this.searchedProperty = POWER_CONSUMPTION;
    }

    public void searchByFilterType(String filterType){
        this.value = filterType;
        this.searchedProperty = FILTER_TYPE;
    }

    public void searchByBagType(String bagType){
        this.value = bagType;
        this.searchedProperty = BAG_TYPE;
    }

    public void searchByWandType(String wandType){
        this.value = wandType;
        this.searchedProperty = WAND_TYPE;
    }

    public void searchByMotorSpeedRegulation(String motorSpeedRegulation){
        this.value = motorSpeedRegulation;
        this.searchedProperty = MOTOR_SPEED_REGULATION;
    }

    public void searchByCleaningWidth(String cleaningWidth){
        this.value = cleaningWidth;
        this.searchedProperty = CLEANING_WIDTH;
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
