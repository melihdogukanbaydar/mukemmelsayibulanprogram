import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,sum = 0;
        System.out.println("Bir Sayı Giriniz");
        number = input.nextInt();
        for ( int i =1; i < number; i++){
            if (number % i == 0){
              sum += i;
            }

        }
        if ((sum == number) && (number > 0)){
            System.out.println("Mükemmel Sayıdır : " + number);
        } else if ((!(sum == number) && (number > 0))) {
            System.out.println("Mükemmel Sayı Değildir : " + number);

        } else if (number < 0 ) {
            System.out.println("Geçersiz Bir Sayı Girdiniz. Pozitif Bir Sayı Giriniz");

        }

    }


    }
