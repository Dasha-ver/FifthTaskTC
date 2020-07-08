package by.epamtc.mtv.fifthtask.viaryshko;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Oven oven = new Oven();
        oven.searchByCapacity("33");
        SearchProduct searchProduct = new SearchProduct(oven);
        SearchProduct.printListWithResult(searchProduct.getListWithResult());
    }
}
