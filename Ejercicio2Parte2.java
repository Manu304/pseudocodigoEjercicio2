import java.util.Scanner;

//202030799 Manuel Rojas
//Solicitar al usuario que ingrese un valor N y mostrar todos
//los valores comprendidos entre N y 1, comenzando desde N.
public class Ejercicio2Parte2{
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        num = scanner.nextInt();
        System.out.print("Los valores entre " + num + " y 1 son: ");
        for(int i=0; i <= num; i++){
            System.out.print(num + ", ");
            num--;
        }
        System.out.println(num + "."); 
    }
}