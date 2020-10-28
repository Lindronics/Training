public class ExceptionExample {
    public static void main(String... args) {
        var x = new Accounts();
        try {
            x.salarySlip(20);
            int y = Integer.parseInt("5");
        } catch(AbsentiesException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

// Is the word not Absences???
class AbsentiesException extends Exception {

    private static final long serialVersionUID = 1L;

}


class Accounts {
    public void salarySlip(int absenties) throws AbsentiesException {
        if (absenties>10) {
            throw new AbsentiesException();
        } else {
            System.out.println("asdf");
        }
    }
}