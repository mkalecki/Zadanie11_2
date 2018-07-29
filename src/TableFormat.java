public class TableFormat {

    private final static int col1Width = 30;
    private final static int col2Width = 5;
    private final static int col3Width = 10;

    public static String formatCol1Width(String input) {

        int toFill = col1Width - input.length();
        for (int i = 0; i < toFill; i++) {
            input = input + " ";
        }
        return input;
    }


    public static String formatCol2Width(String input) {

        int toFill = col2Width - input.length();
        for (int i = 0; i < toFill; i++) {
            input = input + " ";
        }
        return input;
    }

    public static String formatCol3Width(String input) {

        int toFill = col3Width - input.length();
        for (int i = 0; i < toFill; i++) {
            input = input + " ";
        }
        return input;
    }
}
