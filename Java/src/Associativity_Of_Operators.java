public class Associativity_Of_Operators {
        public static void main(String[] args) {
                int a = 6 + 5 - 4 * 3 / 2;
                System.out.println(a);
                // a = 11 - 12 / 2
                // = 11 - 6
                // = 5

                int b = 6 - 5 * 4 / 3 + 2;
                System.out.println(b);
                // b = 6 - 20 / 3 + 2
                // = 6 - 6 + 2
                // = 6 - 4
                // = 2

                int c = 6 * 5 / 4 + 3 - 2;
                System.out.println(c);
                // c = 30 / 4 + 1
                // = 7 + 1
                // = 8

                int d = 6 / 5 + 4 - 3 * 2;
                System.out.println(d);
                // d = 6 / 5 + 4 - 3 * 2
                // = 1 + 4 - 6
                // = 5 - 6
                // = -1

                // Firstly, we see the precedence of the operators. If an operator have same
                // precedence then we will check for its associativity.
                // Link:
                // https://community.codenewbie.org/images/k8FTgzQh7KSvfQIsrGfINIrWbLOiBy-U7QRT9C7mMuQ/w:880/mb:500000/ar:1/aHR0cHM6Ly9kZXYt/dG8tdXBsb2Fkcy5z/My5hbWF6b25hd3Mu/Y29tL3VwbG9hZHMv/YXJ0aWNsZXMvYXAx/cTgwM2htdzhyNW9u/bThwNG8uZ2lm
        }
}
