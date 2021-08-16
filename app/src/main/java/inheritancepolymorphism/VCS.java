package inheritancepolymorphism;

public class VCS {

    private ArrayList<Commit> commitHistory;
    private int HEAD;

    public VCS() {
        commitHistory = new ArrayList<Commit>();
        HEAD = -1;
    }

    public int commit(Commit commit) {
        history.add(commit);
        HEAD += 1;
        return HEAD;
    }

    public int get() {
        int state = 0;
        for (int i = 0; i <= HEAD; i++) {
            state = commitHistory.get(i).update(state);
        }
    }

    public void checkout(int newHEAD) {
        HEAD = newHead;
    }

}