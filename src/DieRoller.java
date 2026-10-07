import java.util.Random;

public class DieRoller
{

    public static void main(String[] args)
    {
        Random rand = new Random();
        int die1, die2, die3, sum;
        int roll = 1;

        System.out.printf("%-8s %-8s %-8s %-8s %-8s%n", "Roll","Die1", "Die2", "Die3", "Sum");
        do
        {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;

            sum = die1 + die2 + die3;

            System.out.printf("%-8d %-8d %-8d %-8d %-8d%n", roll, die1, die2, die3, sum);
            roll++;
        } while (die1 != die2 || die1 != die3);


    }
}
