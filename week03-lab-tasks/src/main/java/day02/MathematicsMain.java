package day02;

public class MathematicsMain {
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        for (int i = 0; i < 14; i++){
            System.out.println("Is " + i +" a prime number? Solution: " + mathematics.isPrime(i));
        }
    }
}
