class MusicSuno {
    public void play() {}; // This can be accessed anywhere in the class, package, subclass and also in the whole codebase
    protected String name; // This can be accessed in class, package, subclass but not in the whole codebase
    int i; // This can be accessed in class, package, but not in the subclass and the whole codebase
    private String artist; // This can be accessed only in class, but not in the package, subclass and also in the whole codebase
}

public class Access_Modifiers_In_Java {
    public static void main(String[] args) {
/*
        Access modifiers determine whether other classes can use a particular field or invoke a particular method that can be public, private, protected or default (no modifier)

        Modifier        |    class    |   package   |    subclass   |    world   |
        public          |      Y      |      Y      |        Y      |      Y     |
        protected       |      Y      |      Y      |        Y      |      N     |
        default (no)    |      Y      |      Y      |        N      |      N     |
        private         |      Y      |      N      |        N      |      N     |
*/
    }
}
