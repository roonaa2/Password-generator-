import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator(); 
        Saved saved = new Saved(scanner);
        System.out.println ("~ Welcome to my Password Generator ~");

        while (true){
        System.out.println ("1. generate password");
        System.out.println ("2. View saved passwords");
        System.out.println ("3. Delete a password");
        System.out.println("4. Exit");

            int choice = scanner.nextInt();
        switch (choice) {
        case 1:{
        System.out.println ("Enter password length: ");
        int length = scanner.nextInt();
        if (length < 6 || length > 80) {
            System.out.println("Password length should be between 6 and 80 characters.");
            break;
        }
        System.out.println("Enter character types (U = uppercase, L = lowercase, D = digits, S = symbols): ");
        String charTypes = scanner.next().toUpperCase();
        boolean upper = charTypes.contains("U");
        boolean lower = charTypes.contains("L");        
        boolean digits = charTypes.contains("D");
        boolean symbols = charTypes.contains("S");  

        String password = generator.generate(length, upper, lower, digits, symbols);
       if (password == null) {
            System.out.println("Please select at least one character type.");
            break;
        }
        System.out.println("Generated password: " + password);
        System.out.println("Password strength: " + Generator.checkstrength(password));
        System.out.println("Do u want to save this password? (y/n)");
        String save = scanner.next().toUpperCase();
        if (save.equals("Y")) {
            System.out.println("Enter application name: ");
            scanner.nextLine();
            String appname = scanner.nextLine();
            saved.save(appname, password);
        }
        else if (save.equals("N")) {
            System.out.println("Password not saved.");
        }
        else {
            System.out.println("Invalid input. Password not saved.");
        }
        break;
    }
    case 2: {
        saved.display();
        break;
    }
    case 3: {
        System.out.println("Enter application name to delete: ");
        scanner.nextLine();
        String appname = scanner.nextLine();
        saved.delete(appname);
        break;
    }
    case 4: {
        System.out.println("byeee");
        scanner.close();
        return;
    }
    default: {
        System.out.println("Invalid choice. Please try again.");
        break;
    }
    }
}
} }