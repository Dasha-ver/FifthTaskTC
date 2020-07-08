package by.epamtc.mtv.fifthtask.viaryshko;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchProduct {

    private String property;
    private String value;
    private Line line;
    private List<String> listWithResult;

    public SearchProduct(Oven oven) {

        this.property = oven.getSearchedProperty();
        this.value = oven.getValue();
        this.line = new Line(oven.getName());
    }

    public SearchProduct(Laptop laptop) {

        this.property = laptop.getSearchedProperty();
        this.value = laptop.getValue();
        this.line = new Line(laptop.getName());

    }

    public SearchProduct(Refrigerator refrigerator) {

        this.property = refrigerator.getSearchedProperty();
        this.value = refrigerator.getValue();
        this.line = new Line(refrigerator.getName());

    }

    public SearchProduct(Speakers speakers) {

        this.property = speakers.getSearchedProperty();
        this.value = speakers.getValue();
        this.line = new Line(speakers.getName());

    }

    public SearchProduct(TabletPC tabletPC) {

        this.property = tabletPC.getSearchedProperty();
        this.value = tabletPC.getValue();
        this.line = new Line(tabletPC.getName());

    }

    public SearchProduct(VacuumCleaner vacuumCleaner) {

        this.property = vacuumCleaner.getSearchedProperty();
        this.value = vacuumCleaner.getValue();
        this.line = new Line(vacuumCleaner.getName());

    }

    public List<String> getListWithResult() throws IOException {

        int[] numbersOfLine = line.getNumbersOfLine();
        listWithResult = new ArrayList<String>();
        FileReader fr = new FileReader("List.txt");
        BufferedReader br = new BufferedReader(fr);
        String lineForRead = "";
        int lineCounter = 0;

        while ((lineForRead = br.readLine()) != null) {
            lineCounter++;
            for (int i = 0; i < numbersOfLine.length; i++) {
                if (lineCounter == numbersOfLine[i] && lineForRead.contains(property + "=" + value)) {
                    listWithResult.add(lineForRead);
                }
            }
        }
        return listWithResult;

    }

    public static void printListWithResult(List<String> listForPrint) {

        for (String result : listForPrint) {
            System.out.println(result);
        }
    }
}
