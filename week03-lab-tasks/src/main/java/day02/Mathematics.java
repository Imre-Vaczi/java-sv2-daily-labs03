package day02;

public class Mathematics {

    public boolean isPrime(int number){
        if (number == 1 | number == 0){
            return false;
        }
        else if (number == 2 | number == 3){
            return true;
        }
        else{
            int divisors = 0;
            for (int i = 2; i < (number/2)+1; i++){
                  if (number % i == 0){
                      divisors++;
                  }
              }return !(divisors >0);
        }
    }
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        for (int i = 0; i < 14; i++){
            System.out.println("Is " + i +" a prime number? Solution: " + mathematics.isPrime(i));
        }
    }
}
