package by.epamtc.mtv.fifthtask.viaryshko;

import java.util.Objects;

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

    public String getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public String getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public String getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public String getCPU() {
        return CPU;
    }

    public String getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getBATTERY_CAPACITY(), laptop.getBATTERY_CAPACITY()) &&
                Objects.equals(getOS(), laptop.getOS()) &&
                Objects.equals(getMEMORY_ROM(), laptop.getMEMORY_ROM()) &&
                Objects.equals(getSYSTEM_MEMORY(), laptop.getSYSTEM_MEMORY()) &&
                Objects.equals(getCPU(), laptop.getCPU()) &&
                Objects.equals(getDISPLAY_INCHS(), laptop.getDISPLAY_INCHS()) &&
                Objects.equals(getNAME(), laptop.getNAME()) &&
                Objects.equals(getName(), laptop.getName()) &&
                Objects.equals(getSearchedProperty(), laptop.getSearchedProperty()) &&
                Objects.equals(getValue(), laptop.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBATTERY_CAPACITY(), getOS(), getMEMORY_ROM(), getSYSTEM_MEMORY(), getCPU(), getDISPLAY_INCHS(), getNAME(), getName(), getSearchedProperty(), getValue());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY='" + BATTERY_CAPACITY + '\'' +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM='" + MEMORY_ROM + '\'' +
                ", SYSTEM_MEMORY='" + SYSTEM_MEMORY + '\'' +
                ", CPU='" + CPU + '\'' +
                ", DISPLAY_INCHS='" + DISPLAY_INCHS + '\'' +
                ", NAME='" + NAME + '\'' +
                ", name='" + name + '\'' +
                ", searchedProperty='" + searchedProperty + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
