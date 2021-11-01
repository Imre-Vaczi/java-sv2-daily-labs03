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
}
