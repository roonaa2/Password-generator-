import java.util.HashMap;
import java.util.Scanner;

public class Saved {
    private HashMap <String, String> savedPasswords = new HashMap<>();
    private Scanner scanner;
    public Saved(Scanner scanner) {
        this.scanner = scanner;
    }
    public void save(String appname, String password){
    if (savedPasswords.containsKey(appname.toLowerCase())){
        System.out.println("Password for " + appname + " already exists. do u want to update it? (y/n)");
        String answer = scanner.nextLine().toUpperCase();
        if (answer.equals("N")){
            System.out.println("Password not saved.");
        }
        else if (answer.equals("Y")){
            savedPasswords.put(appname, password);
            System.out.println("Password updated for " + appname);
        }
        else {
            System.out.println("Invalid input. Password not saved.");
            
        }
    }
    else {
        savedPasswords.put(appname.toLowerCase(), password);
        System.out.println("Password saved for " + appname);
    }

    }
    public void delete(String appname){
            if (savedPasswords.containsKey(appname.toLowerCase())){
                savedPasswords.remove(appname.toLowerCase());
                System.out.println("Password for " + appname + " deleted.");
            }
            else {
                System.out.println("No password found for " + appname);
            }
        }

    public void display(){
        if (savedPasswords.isEmpty()){
            System.out.println("No saved passwords.");
        }
        else {
            System.out.println("~ Saved Passwords: ~");
            for (var entry : savedPasswords.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}


