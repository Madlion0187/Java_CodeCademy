import java.util.ArrayList;

public class PrimeDirective
{
    public boolean isPrime(int number)
    {
        if ( number == 2)
        {
            return true;
        } else if ( number < 2)
        {
            return false;
        }

        for (int i = 2; i < number; i++)
        {
            if ( number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int number : numbers)
        {
            if (isPrime(number))
            {
                primes.add(number);
            }
        }

        return primes;
    }

    public static void main(String[] args)
    {
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        PrimeDirective pd = new PrimeDirective();

        System.out.println(pd.isPrime(5));

        System.out.println(pd.onlyPrimes(numbers));
    }
}
