
public class fizzbuzz {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i != 0) {
                    System.out.println(i);
                    System.out.println("FizzBuzz");
                }
            } else if (i % 3 == 0) {
                System.out.println(i);
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i);
                System.out.println("Buzz");
            }
        }
    }
}
