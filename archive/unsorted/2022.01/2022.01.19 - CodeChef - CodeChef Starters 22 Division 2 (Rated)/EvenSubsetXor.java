package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class EvenSubsetXor {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {

        int num = sc.readInt();
        int kok = 3;
        while (num > 0) {
            if (Integer.bitCount(kok) % 2 == 0) {
                out.print(kok+" ");
                num--;
            }
            kok++;

        }
              out.printLine();

    }
}
