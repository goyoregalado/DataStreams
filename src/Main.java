import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(
                                                    new FileOutputStream(args[0]));
        DataOutputStream dataOutput = new DataOutputStream(bufferedOutput);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor introduzca un número o un número negativo para salir");
        int valor = scanner.nextInt();

        while (valor >= 0) {
            dataOutput.writeInt(valor);
            valor = scanner.nextInt();
        }

        dataOutput.close();
        bufferedOutput.close();
    }
}
