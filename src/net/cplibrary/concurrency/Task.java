package net.cplibrary.concurrency;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface Task {
    void read(InputReader in);

    void solve();

    void write(OutputWriter out, int testNumber);
}
