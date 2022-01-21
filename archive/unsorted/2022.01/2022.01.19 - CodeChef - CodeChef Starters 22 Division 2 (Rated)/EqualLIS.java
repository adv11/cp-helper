package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class EqualLIS {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {
        int num = sc.readInt();
        if(num==2){
            out.printLine("NO");
            return;
        }
        if (num % 2 == 0) {
            out.printLine("YES");
            int l = 2, r = num;
            while (l != r) {
                out.print(l + " " + r + " ");
                r--;
                l++;
            }
            out.print(1 + " " + r);
        }

        else {
            out.printLine("YES");
            int l = 1, r = num;
            while (l <= r) {
                if (l == r) {
                    out.print(l);
                    break;
                } else {
                    out.print(l + " " + r + " ");
                }
                r--; l++;
            }
        }

        out.printLine();
    }
}
