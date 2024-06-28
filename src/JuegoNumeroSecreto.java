import java.util.Scanner;
import java.lang.Math;

class JuegoNumeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 0;
        int numeroMaximo = 10;
        int numeroUsuario = 0;
        int intentos = 1;
        int opcion = 0;

        while (opcion != 2){
            numeroSecreto = generarNumeroAleatorio(numeroMaximo);

            do{
                System.out.print(String.format("Indique un numero del 1 al %d: ", numeroMaximo));
                numeroUsuario = sc.nextInt();

                if (numeroUsuario == numeroSecreto) {
                    System.out.println("Acertaste el numero en " + cantIntentos(intentos));
                } else {
                    //El usuario no acerto
                    if (numeroUsuario > numeroSecreto) {
                        System.out.println("El numero secreto es menor");
                    } else {
                        System.out.println("El numero secreto es mayor");
                    }
                    intentos++;
                }
            } while (numeroUsuario != numeroSecreto);

            System.out.println("Desea volver a jugar?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = sc.nextInt();
        }

    }
    public static int generarNumeroAleatorio(int numeroMaximo) {
        return (int) (Math.random() * numeroMaximo) + 1;
    }

    public static String cantIntentos(int intentos) {
        String veces = (intentos == 1) ? "vez" : "veces";
        return String.valueOf(intentos) + " " + veces;
    }
}