import java.util.Scanner;
public class Ejemplo20 {
    public static void main(String[] args) {

        int anyo;
        boolean esBisiesto = false;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        anyo = inputValue.nextInt();

        inputValue.close();


        if ((anyo % 400 == 0) || (anyo % 4 == 0) && (anyo % 100 != 0)){
            esBisiesto = true;
        }

        if (esBisiesto){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }

    }
}