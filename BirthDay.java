import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            String[] inputs1 = input1.split(",");
            String[] inputs2 = input2.split(",");

            if (inputs1.length != 4 || inputs2.length != 4) {
                System.out.println("Invalid Input");
                return;
            }

            String name1 = inputs1[0].trim();
            int month1, day1, year1;
            String name2 = inputs2[0].trim();
            int month2, day2, year2;

            try {
                month1 = Integer.parseInt(inputs1[1].trim());
                day1 = Integer.parseInt(inputs1[2].trim());
                year1 = Integer.parseInt(inputs1[3].trim());

                month2 = Integer.parseInt(inputs2[1].trim());
                day2 = Integer.parseInt(inputs2[2].trim());
                year2 = Integer.parseInt(inputs2[3].trim());

                if (month1 < 1 || month1 > 12 || day1 < 1 || day1 > 31 || year1 < 1950 || year1 > 2024 ||
                    month2 < 1 || month2 > 12 || day2 < 1 || day2 > 31 || year2 < 1950 || year2 > 2024) {
                    System.out.println("Invalid Input");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                return;
            }

            System.out.println("In the USA my birthday is: " + String.format("%02d", month1) + "/" + String.format("%02d", day1) + "/" + year1);
            System.out.println("In England my birthday is: " + String.format("%02d", day1) + "/" + String.format("%02d", month1) + "/" + year1);
            System.out.println("In the USA my friend " + name2 + "'s birthday is: " + String.format("%02d", month2) + "/" + String.format("%02d", day2) + "/" + year2);
            System.out.println("In England my friend " + name2 + "'s birthday is: " + String.format("%02d", day2) + "/" + String.format("%02d", month2) + "/" + year2);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}
