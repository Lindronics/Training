class Two extends One {
    public Two() {
        super(5);
        System.out.println("two");
    }

    public static void main(String... args) {
        var x = new Two();
    }
}