package by.epamtc.mtv.fifthtask.viaryshko;

public class Laptop {

    private final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private final String OS = "OS";
    private final String MEMORY_ROM = "MEMORY_ROM";
    private final String SYSTEM_MEMORY = "SYSTEM_MEMORY";
    private final String CPU = "CPU";
    private final String DISPLAY_INCHS = "DISPLAY_INCHS";
    private final String NAME = "Laptop";
    private String name;
    private String searchedProperty;
    private String value;

    public Laptop(){

        this.name = NAME;
    }

    public void searchByBatteryCapacity(String batteryCapacity){
        this.value = batteryCapacity;
        this.searchedProperty = BATTERY_CAPACITY;
    }

    public void searchByOS(String nameOfOS){
        this.value = nameOfOS;
        this.searchedProperty = OS;
    }

    public void searchByMemoryROM(String memoryRom){
        this.value = memoryRom;
        this.searchedProperty = MEMORY_ROM;
    }

    public void searchBySystemMemory(String systemMemory){
        this.value = systemMemory;
        this.searchedProperty = SYSTEM_MEMORY;
    }

    public void searchByCPU(String nameOfCPU){
        this.value = nameOfCPU;
        this.searchedProperty = CPU;
    }

    public void searchByDisplayInghs(String displayInghs){
        this.value = displayInghs;
        this.searchedProperty = DISPLAY_INCHS;
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
