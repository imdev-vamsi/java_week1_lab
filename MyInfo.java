import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine();
            String[] inputs = input.split(",");

            if (inputs.length != 4) {
                System.out.println("Invalid Input");
                return;
            }

            String firstName = inputs[0].trim();
            String lastName = inputs[1].trim();
            int age;
            String city = inputs[3].trim();

            if (!firstName.matches("[a-zA-Z]+") || !lastName.matches("[a-zA-Z]+") || !city.matches("[a-zA-Z ]+")) {
                System.out.println("Invalid Input");
                return;
            }

            try {
                age = Integer.parseInt(inputs[2].trim());
                if (age <= 1 || age >= 100) {
                    System.out.println("Invalid Input");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                return;
            }

            System.out.println("My Name is " + firstName + " " + lastName + ".");
            System.out.println("I am " + age + " years old and was born in " + city + ".");

        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}

