import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test {

    public static void main(String[] args) {

        ArrayList<Product> prodList = Operations.csvToArrayList("products.csv");

        Collections.sort(prodList);

        for (Product aProdList : prodList) {
            System.out.print(TableFormat.formatCol1Width(aProdList.getProduct())
                    + TableFormat.formatCol2Width("(" + String.valueOf(aProdList.getQuantity()) + ")")
                    + aProdList.visualQuantity());
            System.out.println();
        }
    }
}
