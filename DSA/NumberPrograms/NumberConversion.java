public class NumberConversion {

    public static String decimalToHexaDecimal(int n){
        String s = "0123456789ABCDEF";
        String hex = "";
        while(n > 0){
            int rem = n % 16;
            hex = s.charAt(rem) + hex;
            n = n / 16;
        }
        return hex;
    }

    public static int getPower(int base, int exp){
        int result = 1;
        for(int i = 1; i <= exp; i++){
            result = result * base;
        }
        return result;
    }

    public static String HexaDecimalToDecimal(String hex){
        int decimal = 0, mul = 1, val = 0;
        for(int i = hex.length() - 1; i >= 0; i--){
            char ch = hex.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val = ch - '0';
            } else if(ch >= 'A' && ch <= 'F'){
                val = ch - 'A' + 10;
            } else if(ch >= 'a' && ch <= 'f'){
                val = ch - 'a' + 10;
            } else {
                return "Invalid Hexadecimal Number";
            }
            decimal += val * mul;
            mul = mul * 16;
        }
        return decimal + "";
    }   

    // public static String HexaDecimalToDecimal(String hex){
    //     String s = "0123456789ABCDEF";
    //     int decimal = 0, power = 0;
    //     for(int i = hex.length() - 1; i >= 0; i--){
    //         char ch = hex.charAt(i);
    //         int val = s.indexOf(ch);
    //         decimal += val * getPower(16, power);
    //         power++;
    //     }
    //     return decimal + "";
    // }

    public static void main(String[] args) {
        int number = 380;
        String hexNumber = decimalToHexaDecimal(number);
        System.out.println("Hexadecimal of " + number + " is: " + hexNumber);
        String hexInput = "17c";
        String decimalNumber = HexaDecimalToDecimal(hexInput);
        System.out.println("Decimal of Hexadecimal " + hexInput + " is: " + decimalNumber);
    }
}
