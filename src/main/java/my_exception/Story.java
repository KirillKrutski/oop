package my_exception;

public class Story {
    private int words;

    public Story(int words) {
        this.words = words;
    }

    public void setWords(int words) throws MyScaryException {
        if (words < 100) {
            throw new MyScaryException();
        }
        this.words = words;
    }
}
