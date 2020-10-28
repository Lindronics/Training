public class CustomException extends Exception {
    private static final long serialVersionUID = 1L;
    
}

class CustomClass {
    public CustomClass(int i) throws CustomException {
        if (i > 5) {
            throw new CustomException();
        }
    }
}

class Test {
    public static void main(String... args) {
        try {
            var x = new CustomClass(7);
        } catch(CustomException e) {
            e.printStackTrace();
        }
    }
}