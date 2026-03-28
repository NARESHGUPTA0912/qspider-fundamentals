package Miscellaneous;
// Number Conversion: Convert a number from one base to another (e.g., binary to decimal, decimal to hexadecimal, etc.).

public class NumberConversion {

    // 1️⃣ Decimal to Binary
    public static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }

    // 2️⃣ Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }

    // 3️⃣ Decimal to Octal
    public static String decimalToOctal(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 8);
            n /= 8;
        }

        return sb.reverse().toString();
    }

    // 4️⃣ Decimal to Hexadecimal
    public static String decimalToHex(int n) {
        char[] hex = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(hex[n % 16]);
            n /= 16;
        }

        return sb.reverse().toString();
    }

    // 5️⃣ Binary to Octal
    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(decimal);
    }

    // 6️⃣ Binary to Hexadecimal
    public static String binaryToHex(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHex(decimal);
    }

    // 7️⃣ Octal to Decimal
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;

        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, power);
            power++;
        }

        return decimal;
    }

    // 8️⃣ Octal to Binary
    public static String octalToBinary(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(decimal);
    }

    // 9️⃣ Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);

            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }

            decimal += value * Math.pow(16, power);
            power++;
        }

        return decimal;
    }

    // 🔟 Hexadecimal to Binary
    public static String hexToBinary(String hex) {
        int decimal = hexToDecimal(hex);
        return decimalToBinary(decimal);
    }

    // 🔥 Main method
    public static void main(String[] args) {

        System.out.println("Decimal to Binary: " + decimalToBinary(10));
        System.out.println("Binary to Decimal: " + binaryToDecimal("1010"));

        System.out.println("Decimal to Octal: " + decimalToOctal(64));
        System.out.println("Decimal to Hex: " + decimalToHex(255));

        System.out.println("Binary to Octal: " + binaryToOctal("101010"));
        System.out.println("Binary to Hex: " + binaryToHex("11111111"));

        System.out.println("Octal to Decimal: " + octalToDecimal("17"));
        System.out.println("Octal to Binary: " + octalToBinary("17"));

        System.out.println("Hex to Decimal: " + hexToDecimal("FF"));
        System.out.println("Hex to Binary: " + hexToBinary("FF"));
    }
}