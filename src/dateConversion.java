import java.util.Scanner;
import java.text.DateFormatSymbols;

public class dateConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Short Date(YYYY-MM-DD): ");
        String shortDateFormat = input.nextLine();

        String[] datePart = shortDateFormat.split("-");
        int day = Integer.parseInt(datePart[2]);
        int month = Integer.parseInt(datePart[1]);
        int year = Integer.parseInt(datePart[0]);

        String monthOutput = new DateFormatSymbols().getMonths()[month - 1 ];
        System.out.println("Output : " + monthOutput + " " + day + "," + year);

        input.close();


    }
}
