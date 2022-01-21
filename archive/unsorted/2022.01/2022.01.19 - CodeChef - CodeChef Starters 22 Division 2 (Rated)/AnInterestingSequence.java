package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import static java.lang.Math.log;

public class AnInterestingSequence {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {

        int k = sc.readInt();
        if (k == 1) out.printLine(0);
        else if (k == 0) out.printLine(1);
        else if ((k & (k - 1)) == 0) {
            int result = (int) (log(k) / log(2));
            out.printLine(result);
        } else {
            int res = 0;
            while (k % 2 == 0) {
                k /= 2;
                res++;
            }
            out.printLine(res);
        }
    }
}
