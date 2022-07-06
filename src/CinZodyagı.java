import java.util.Scanner;


public class CinZodyagı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğum yılınızı giriniz");

        int dogum_yili = input.nextInt();

        if (dogum_yili % 12 == 0) {

            System.out.println("Çin zodyağı burcunuz:maymun");
        }

        else if (dogum_yili % 12 == 1){

            System.out.println("Çin zodyağı burcunuz:horoz");
        }
        else if (dogum_yili % 12 == 2) {

            System.out.println("Çin zodyağı burcunuz:köpek");
        }
        else if (dogum_yili % 12 == 3){

            System.out.println("Çin zodyağı burcunuz:domuz");
        }


        else if (dogum_yili % 12 == 4){

            System.out.println("Çin zodyağı burcunuz:fare");
        }

        else if (dogum_yili % 12 == 5){

            System.out.println("Çin zodyağı burcunuz:öküz");
        }

        else if (dogum_yili % 12 == 6){

            System.out.println("Çin zodyağı burcunuz:kaplan");
        }

        else if (dogum_yili % 12 == 7){

            System.out.println("Çin zodyağı burcunuz:tavşan");
        }

        else if (dogum_yili % 12 == 8){

            System.out.println("Çin zodyağı burcunuz:ejderha");
        }

        else if (dogum_yili % 12 == 9){

            System.out.println("Çin zodyağı burcunuz:yılan");
        }

        else if (dogum_yili % 12 == 9){

            System.out.println("Çin zodyağı burcunuz:at");
        }
        else if (dogum_yili % 12 == 9){

            System.out.println("Çin zodyağı burcunuz:koyun");
        }
    }
}