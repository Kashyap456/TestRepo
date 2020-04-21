public class CombinationLock {
    private String lock;

    public CombinationLock(String lock) {
        this.lock = lock;
    }

    public String getClue(String guess) {
        String clue = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == lock.charAt(i)) {
                clue += lock.charAt(i);
            }
            else if (lock.contains(String.valueOf(guess.charAt(i)))) {
                clue += "+";
            }
            else {
                clue += "*";
            }
        }
        return clue;
    }

}
