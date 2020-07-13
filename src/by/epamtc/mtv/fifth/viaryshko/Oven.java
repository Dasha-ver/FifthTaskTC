package by.epamtc.mtv.fifthtask.viaryshko;

import java.util.Objects;

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

    public String getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public String getWEIGHT() {
        return WEIGHT;
    }

    public String getCAPACITY() {
        return CAPACITY;
    }

    public String getDEPTH() {
        return DEPTH;
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

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof Oven)) {
            return false;
        }
        Oven oven = (Oven) o;
        return Objects.equals(getPOWER_CONSUMPTION(), oven.getPOWER_CONSUMPTION()) &&
                Objects.equals(getCAPACITY(), oven.getCAPACITY()) &&
                Objects.equals(getDEPTH(), oven.getDEPTH()) &&
                Objects.equals(getHEIGHT(), oven.getHEIGHT()) &&
                Objects.equals(getNAME(), oven.getNAME()) &&
                Objects.equals(getWEIGHT(), oven.getWEIGHT()) &&
                Objects.equals(getWIDTH(), oven.getWIDTH()) &&
                Objects.equals(getName(), oven.getName()) &&
                Objects.equals(getSearchedProperty(), oven.getSearchedProperty()) &&
                Objects.equals(getValue(), oven.getValue());
    }

    public int hashCode() {
        return Objects.hash(getPOWER_CONSUMPTION(), getCAPACITY(), getDEPTH(), getHEIGHT(),
                getNAME(), getWEIGHT(), getWIDTH(), getName(), getSearchedProperty(), getValue());
    }

    public String toString() {
        return "Oven{" + "POWER_CONSUMPTION = " + POWER_CONSUMPTION + " " +
                "CAPACITY = " + CAPACITY + " " +
                "DEPTH = " + DEPTH + " " +
                "HEIGHT = " + HEIGHT + " " +
                "NAME = " + NAME + " " +
                "WEIGHT = " + WEIGHT + " " +
                "WIDTH = " + WIDTH + " " +
                "Name = " + name + " " +
                "Searched Property = " + searchedProperty + " " +
                "Value = " + value + ".";
    }
}
