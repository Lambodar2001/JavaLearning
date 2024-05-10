import java.util.ArrayList;

public class Pract {

    public static void main(String[] args) {
        String input = "Girls :4\n" +
                "Pens :4\n" +
                "Pencils :4";

        // Split the input into lines
        String[] lines = input.split("\n");

        int totalGirls = 0;
        int totalPens = 0;
        int totalPencils = 0;

        // Extracting data from input
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String item = parts[0].trim();
                int quantity = Integer.parseInt(parts[1].trim());
                switch (item) {
                    case "Girls":
                        totalGirls = quantity;
                        break;
                    case "Pens":
                        totalPens = quantity;
                        break;
                    case "Pencils":
                        totalPencils = quantity;
                        break;
                }
            }
        }

        // Distributing items equally among girls
        ArrayList<String> distribution = new ArrayList<>();
        for (int i = 1; i <= totalGirls; i++) {
            distribution.add("{ 'girl" + i + "' pen:1, pencil:1}");
        }

        // Displaying the output
        System.out.println("Output: " + distribution);
    }
}
