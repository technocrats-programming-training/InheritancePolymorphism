/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritancepolymorphism;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAddCommit() {
        VCS vcs = new VCS();
        AddCommit excommit = new AddCommit(5);
        vcs.commit(excommit);
        assert vcs.get() == 5; 
        vcs.checkout(0);
        assert vcs.get() == 0;
    }

    @Test public void testMultiplyCommit() {
        VCS vcs = new VCS();
        MultiplyCommit excommit = new MultiplyCommit(5);
        vcs.commit(excommit);
        assert vcs.get() == 0; 
        vcs.checkout(0);
        assert vcs.get() == 0;
    }

    @Test public void testBothCommits() {
        VCS vcs = new VCS();
        AddCommit excommit1 = new AddCommit(5);
        MultiplyCommit excommit2 = new MultiplyCommit(5);
        vcs.commit(excommit1);
        assert vcs.get() == 5; 
        vcs.commit(excommit2);
        assert vcs.get() == 25; 
        vcs.checkout(0);
        assert vcs.get() == 0;
    }
}
