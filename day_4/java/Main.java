public class Main {
    public static void main(String... args) {
        QA hsbc = new HSBC();
        hsbc.test();

        BankOfEngland asdf = new HSBC();
        asdf.showBalance();

        BankOfEngland asdf2 = new Barclays();
        asdf2.showBalance();

        test(new HSBC());
    }

    public static void test(BankOfEngland x) {
        x.showBalance();
    }
}