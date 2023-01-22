class OuterClass {
    private int outerField;
    private static int staticOuterField;

    class InnerClass {
        private int innerField;

        public void innerMethod() {
            System.out.println("Inner class method");
        }
    }

    public void outerMethod() {
        InnerClass innerObject = new InnerClass();
        innerObject.innerMethod();
        System.out.println("Outer class method");
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.outerMethod();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.innerMethod();
    }
}