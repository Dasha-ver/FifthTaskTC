package by.epamtc.mtv.fifthtask.viaryshko;

import java.util.Objects;

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

    public String getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public String getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public String getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean equals(Object o){

        if (this == o){
            return true;
        }
        if(!(o instanceof VacuumCleaner)){
            return false;
        }

        VacuumCleaner vacuumCleaner = (VacuumCleaner) o;

        return Objects.equals(getName(), vacuumCleaner.getName())&&
                Objects.equals(getSearchedProperty(), vacuumCleaner.getSearchedProperty())&&
                Objects.equals(getValue(), vacuumCleaner.getValue())&&
                Objects.equals(getNAME(), vacuumCleaner.getNAME())&&
                Objects.equals(getPOWER_CONSUMPTION(), vacuumCleaner.getPOWER_CONSUMPTION())&&
                Objects.equals(getBAG_TYPE(), vacuumCleaner.getBAG_TYPE())&&
                Objects.equals(getCLEANING_WIDTH(), vacuumCleaner.getCLEANING_WIDTH())&&
                Objects.equals(getFILTER_TYPE(), vacuumCleaner.getFILTER_TYPE())&&
                Objects.equals(getMOTOR_SPEED_REGULATION(), vacuumCleaner.getMOTOR_SPEED_REGULATION())&&
                Objects.equals(getWAND_TYPE(), vacuumCleaner.getWAND_TYPE());
    }

    public int hashCode(){
        return Objects.hash(getName(), getSearchedProperty(), getValue(), getNAME(), getPOWER_CONSUMPTION(),
                getBAG_TYPE(), getCLEANING_WIDTH(), getFILTER_TYPE(), getMOTOR_SPEED_REGULATION(), getWAND_TYPE());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", FILTER_TYPE='" + FILTER_TYPE + '\'' +
                ", BAG_TYPE='" + BAG_TYPE + '\'' +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                ", MOTOR_SPEED_REGULATION='" + MOTOR_SPEED_REGULATION + '\'' +
                ", CLEANING_WIDTH='" + CLEANING_WIDTH + '\'' +
                ", NAME='" + NAME + '\'' +
                ", name='" + name + '\'' +
                ", searchedProperty='" + searchedProperty + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
