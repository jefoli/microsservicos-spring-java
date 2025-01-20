package br.com.erudio.api_gateway.converters;

public class ConvertDouble {

    public static Double convertDouble(String strNumber) {
        if (strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");

        if (IsNumeric.isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }
}
