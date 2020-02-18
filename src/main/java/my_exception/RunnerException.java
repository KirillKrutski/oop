package my_exception;
public class RunnerException {

    public static void main(String[]args) throws MyScaryException {
        Story good = new Story(200);
            try{
                good.setWords(99);
            } catch(MyScaryException ex){

        System.err.println("BAD STORY! SHAME ON YOU!");
        ex.getMessage();
    } finally {
                System.out.println();
        System.out.println("Finally");
    }
}
}