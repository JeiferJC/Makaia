/*      Escriba una clase llamada MyRegex que contendrá un patrón de cadena. Debe escribir una expresión
        regular y asignarla al patrón de modo que pueda usarse para validar una dirección IP. Utilice la siguiente
        definición de una dirección IP:

        IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may
        range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

        Algunas direcciones IP válidas:

        000.12.12.034
        121.234.12.12
        23.45.12.56
        Algunas direcciones IP no válidas:

        000.12.234.23.23
        666.666.23.23
        .213.123.23.32
        23.45.22.32.
        No.soy.una.ip
        En este problema, se le proporcionarán cadenas que contienen cualquier combinación de caracteres ASCII. Tienes que escribir una expresión regular para encontrar las direcciones IP válidas.

        Simplemente escriba la clase MyRegex que contiene una cadena. La cadena debe contener la expresión regular correcta.

        (La clase MyRegex NO DEBE ser pública)

        Entrada de muestra

        000.12.12.034
        121.234.12.12
        23.45.12.56
        00.12.123.123123.123
        122.23
        Hello.IP
        Salida de muestra

        true
        true
        true
        false
        false
        false*/


package ValidarIP;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex{
    String expresionRegular = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    boolean isValidIp(String array){
        Pattern patronIP = Pattern.compile(expresionRegular);
        Matcher matcher = patronIP.matcher(array);
        return matcher.matches();
    }
}

public class ValidarIP {
    public static void main(String[] args) {
        MyRegex myRegex = new MyRegex();

        /*String[] arrays = {
                "000.12.12.034",
                "121.234.12.12",
                "23.45.12.56",
                "00.12.123.123123.123",
                "122.23",
                "Hello.IP"
        };*/
        /*String[] arrays = {
                "12.12.12.12",
                "13.13.13.112",
                "VUUT.12.12",
                "111.111.11.111",
                "1.1.1.1.1.1.1",
                ".....",
                "1...1..1..1",
                "0.0.0.0",
                "255.0.255.0",
                "266.266.266.266",
                "00000.000000.0000000.00001",
                "023.0012.0012.0034"
        };*/
        String[] arrays = {
                "259.259.259.259",
                "266.266.266.266",
                "255.255.255.255",
                "555.555.555.555",
                "666.666.666.666",
                "249.249.249.249",
                "249.249.249.256"
        };

        for (String iterador : arrays){
            boolean isValid = myRegex.isValidIp(iterador);
            System.out.println(isValid);
        }
    }
}
