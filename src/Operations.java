import java.io.*;
import java.util.ArrayList;

public class Operations {

    public static ArrayList<Product> csvToArrayList(String fileName) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.err.println("nie ma takiego pliku");
            e.printStackTrace();
        }
        BufferedReader bfr = new BufferedReader(fileReader);

        ArrayList<Product> arrayList = new ArrayList<>();

        String line = "start";
        int index = 0;
        try {
            while (line != null) {

                line = bfr.readLine();
                if (line != null) {
                    String[] data = line.split(";");

                    Product product = new Product(data[0],Integer.valueOf(data[1]));
                    arrayList.add(product);
                }
            }
        bfr.close();
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
            e.printStackTrace();
        }
        return arrayList;
    }


}
