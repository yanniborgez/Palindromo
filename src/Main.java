import java.util.*;

/*
@autor Iván Yanni Borgez Bautista
@email borgezyanni@gmail.com
@descripción práctica de palindromo
*/

public class Main {

    public static void main(String[] args) {
        System.out.print("Ingresa una entrada:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue pila = new LinkedList();

        for (int i = inputString.length()-1; i >=0; i--){
            pila.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!pila.isEmpty()){
            reverseString = reverseString+pila.remove();
        }

        if (inputString.equals(reverseString)){
            System.out.println("La entrada es un palindromo");
        }
        else{
            System.out.println("La entrada no es un palindromo");
        }
    }
}
