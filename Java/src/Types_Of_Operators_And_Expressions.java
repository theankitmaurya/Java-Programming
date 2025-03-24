public class Types_Of_Operators_And_Expressions {
        public static void main(String[] args) {
                // Types of Operators ->
                // 1. Arithmetic Operators -> +, -, *, /, %, ++, --
                int a = 10;
                int b = 5;
                System.out.println(a + b);
                System.out.println(a - b);
                System.out.println(a * b);
                System.out.println(a / b);
                System.out.println(a % b);
                a++;
                System.out.println(a);
                b--;
                System.out.println(b);
                // 2. Assignment Operators -> =, +=, -=, *=, /=
                int c = 5;
                System.out.println(c);
                int d = 5;
                c += d;
                System.out.println(c);
                c -= d;
                System.out.println(c);
                c *= d;
                System.out.println(c);
                c /= d;
                System.out.println(c);
                // 3. Comparison Operators -> ==, >=, <=
                int e = 5;
                int f = 4;
                System.out.println(e == f);
                System.out.println(e >= f);
                System.out.println(e <= f);
                // 4. Logical Operators -> &&, ||, !
                int g = 5;
                int h = 3;
                int i = 2;
                System.out.println(g > h && g > i);
                System.out.println(g > h || g > i);
                System.out.println(!(g > h || g > i));
                // 5. Bitwise Operators -> &, | (operates bitwise)
                System.out.println(2 & 3);
                System.out.println(2 | 3);
        }
}
