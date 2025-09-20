public class DataConversionDemo {
    public static void main(String[] args) {
        double d = 45.67;

        // Explicit conversions
        long l = (long) d;        // Double to Long
        int i = (int) d;          // Double to Integer
        byte b = 10;
        int byteToInt = b;        // Byte to Integer (implicit)

        // Conversions to String
        String intToStr = Integer.toString(i);
        String doubleToStr = Double.toString(d);
        String longToStr = Long.toString(l);
        String floatToStr = Float.toString(12.34f);

        // String to numbers
        int strToInt = Integer.parseInt("100");
        double strToDouble = Double.parseDouble("99.99");
        long strToLong = Long.parseLong("123456789");
        float strToFloat = Float.parseFloat("45.6");

        // Print results
        System.out.println("Double to Long: " + l);
        System.out.println("Double to Integer: " + i);
        System.out.println("Byte to Integer: " + byteToInt);
        System.out.println("Integer to String: " + intToStr);
        System.out.println("Double to String: " + doubleToStr);
        System.out.println("Long to String: " + longToStr);
        System.out.println("Float to String: " + floatToStr);
        System.out.println("String to Integer: " + strToInt);
        System.out.println("String to Double: " + strToDouble);
        System.out.println("String to Long: " + strToLong);
        System.out.println("String to Float: " + strToFloat);
    }
}
