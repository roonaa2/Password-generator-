import java.security.SecureRandom;

public class Generator {
    private SecureRandom random = new SecureRandom();
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public String generate(int length, boolean upper, boolean lower, boolean digits, boolean symbols) {
        if (upper || lower || digits || symbols) {
        StringBuilder password = new StringBuilder(length);
        String str = "";
        if (upper) str += UPPER;
        if (lower) str += LOWER;
        if (digits) str+= DIGITS;
        if (symbols) str += SYMBOLS;

        for (int i = 0; i < length; i++) {
            password.append(str.charAt(random.nextInt(str.length())));
        }
        return password.toString();
    }
    return null;
    }
      public static String checkstrength(String password) {
            int score = 0;
            boolean hasUpper = false,hasLower = false,
             hasDigit = false, hasSymbol = false;

             for (char c : password.toCharArray()) {
                if (UPPER.indexOf(c) >= 0) hasUpper = true;
                else if (LOWER.indexOf(c) >= 0) hasLower = true;
                else if (DIGITS.indexOf(c) >= 0) hasDigit = true;
                else if (SYMBOLS.indexOf(c) >= 0) hasSymbol = true;
            }

            if (password.length() >= 8) score++;
            if (password.length() >= 12) score++;
            if (hasUpper) score++;
            if (hasLower) score++;
            if (hasDigit) score++;
            if (hasSymbol) score+=2;

            switch (score) {
                case 0: case 1: case 2: return "Weak";
                case 3: case 4: return "Moderate";
                case 5: case 6: case 7: return "Strong";
                default: return "Unknown";
            }
        
}
}