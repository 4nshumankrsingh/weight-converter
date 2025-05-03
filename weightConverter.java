import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        double weight;
        double newWt;

        System.out.println("Weight Converter Program");
        System.out.println("Option 1: Kilogram to Pounds");
        System.out.println("Option 2: Pounds to Kilogram");
        

        System.out.print("Enter the option: ");
        option = scanner.nextInt();

        if(option == 1) {
            System.out.print("Enter the weight in Kilograms: ");
            weight = scanner.nextDouble();
            newWt = weight * 2.205;
            System.out.printf("%fkg = %.2flbs", weight, newWt);

        }
        else if(option == 2) {
            System.out.print("Enter the weight in Pounds: ");
            weight = scanner.nextDouble();
            newWt = weight / 2.205;
            System.out.printf("%flbs = %.2fkg", weight, newWt);
        }
        else {
            System.out.println("Enter a valid option");
        }


        scanner.close();
    }
}