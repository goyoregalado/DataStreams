import java.io.*;

public class DataStreamReader {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInput = new BufferedInputStream(
                                new FileInputStream(
                                        "data/datosUsuario.dat"));
        DataInputStream inputStream = new DataInputStream(bufferedInput);

        try {
            int i = inputStream.readInt();
            while (true) {
                System.out.println("Valor leído " + i);
                i = inputStream.readInt();
            }

        } catch (EOFException ex) {
            System.out.println("--- END of File ---");
        } finally {
            inputStream.close();
            bufferedInput.close();
        }
    }
}
