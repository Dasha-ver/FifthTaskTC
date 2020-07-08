package by.epamtc.mtv.fifthtask.viaryshko;

public class Line {

    private String productForSearch;
    private int[] numbersOfLine;

    public Line(String productForSearch) {

        this.productForSearch = productForSearch;
    }

    public int[] getNumbersOfLine() {

        switch (productForSearch) {

            case "Oven":
                numbersOfLine = new int[]{1, 2, 3};
                break;

            case "Laptop":
                numbersOfLine = new int[]{5, 6, 7};
                break;

            case "Refrigerator":
                numbersOfLine = new int[]{9, 10, 11};
                break;

            case "VacuumCleaner":
                numbersOfLine = new int[]{13, 14, 15};
                break;

            case "TabletPC":
                numbersOfLine = new int[]{17, 18, 19};
                break;

            case "Speakers":
                numbersOfLine = new int[]{21, 22, 23};
                break;
        }
        return numbersOfLine;
    }

}
