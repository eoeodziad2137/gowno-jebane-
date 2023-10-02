import java.util.Scanner;


public class lat
{
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);
    
        System.out.println("Podaj imie");
        String imie = scan.nextLine();

        System.out.println("Podaj wiek");
        int wiek = scan.nextInt();

        System.out.print(imie);

        if (wiek >= 18) 
        {
            System.out.println(" jest pełnoletni");
        }
        else
        {
            System.out.println(" nie jest pelnoletni");
        }

    }
}