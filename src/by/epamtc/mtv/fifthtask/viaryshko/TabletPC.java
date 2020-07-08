package by.epamtc.mtv.fifthtask.viaryshko;

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
}
