package by.epamtc.mtv.fifthtask.viaryshko;

import java.util.Objects;

public class TabletPC {

    private final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private final String DISPLAY_INCHES = "DISPLAY_INCHES";
    private final String MEMORY_ROM = " MEMORY_ROM";
    private final String FLASH_MEMORY_CAPACITY = "FLASH_MEMORY_CAPACITY";
    private final String COLOR = "COLOR";
    private final String NAME = "TabletPC";
    private String name;
    private String searchedProperty;
    private String value;

    public TabletPC() {

        this.name = NAME;
    }

    public void searchByBatteryCapacity(String batteryCapacity) {
        this.value = batteryCapacity;
        this.searchedProperty = BATTERY_CAPACITY;
    }

    public void searchByMemoryROM(String memoryRom) {
        this.value = memoryRom;
        this.searchedProperty = MEMORY_ROM;
    }

    public void searchByDisplayInches(String displayInches) {
        this.value = displayInches;
        this.searchedProperty = DISPLAY_INCHES;
    }

    public void searchByFlashMemoryCapacity(String flashMemoryCapacity) {
        this.value = flashMemoryCapacity;
        this.searchedProperty = FLASH_MEMORY_CAPACITY;
    }

    public void searchByColor(String color) {
        this.value = color;
        this.searchedProperty = COLOR;
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

    public String getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public String getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public String getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public String getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof TabletPC)) {
            return false;
        }

        TabletPC tabletPC = (TabletPC) o;

        return Objects.equals(getName(), tabletPC.getName()) &&
                Objects.equals(getSearchedProperty(), tabletPC.getSearchedProperty()) &&
                Objects.equals(getValue(), tabletPC.getValue()) &&
                Objects.equals(getBATTERY_CAPACITY(), tabletPC.getBATTERY_CAPACITY()) &&
                Objects.equals(getMEMORY_ROM(), tabletPC.getMEMORY_ROM()) &&
                Objects.equals(getNAME(), tabletPC.getNAME()) &&
                Objects.equals(getCOLOR(), tabletPC.getCOLOR()) &&
                Objects.equals(getDISPLAY_INCHES(), tabletPC.getDISPLAY_INCHES()) &&
                Objects.equals(getFLASH_MEMORY_CAPACITY(), tabletPC.getFLASH_MEMORY_CAPACITY());
    }

    public int hashCode() {

        return Objects.hash(getName(), getSearchedProperty(), getValue(), getBATTERY_CAPACITY(),
                getMEMORY_ROM(), getNAME(), getCOLOR(), getDISPLAY_INCHES(), getFLASH_MEMORY_CAPACITY());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "BATTERY_CAPACITY='" + BATTERY_CAPACITY + '\'' +
                ", DISPLAY_INCHES='" + DISPLAY_INCHES + '\'' +
                ", MEMORY_ROM='" + MEMORY_ROM + '\'' +
                ", FLASH_MEMORY_CAPACITY='" + FLASH_MEMORY_CAPACITY + '\'' +
                ", COLOR='" + COLOR + '\'' +
                ", NAME='" + NAME + '\'' +
                ", name='" + name + '\'' +
                ", searchedProperty='" + searchedProperty + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
