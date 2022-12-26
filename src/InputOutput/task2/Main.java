package InputOutput.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("task2.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("task2.txt"))))
        {
            out.writeUTF("Some text");
            out.writeInt(2022);
            out.writeFloat(200.4F);
            out.writeUTF("some long text will be input here just for some case " +
                    "\n Ukraine will win in war,just wait a bit");

            out.flush();

            System.out.println(in.readUTF());
            System.out.println(in.readInt());
            System.out.println(in.readFloat());
            System.out.println(in.readUTF());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
