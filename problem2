class Main
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c;

        int sumFibonacci = 2; // Starts with 2, because it adds on the first even-numbered fibonacci term. See line 7.

        while (true) {
            c = a + b;
            if (c > 4000000) {
                break;
            }
            if (c % 2 == 0)
            {
                sumFibonacci += c;
            }
            a = b;
            b = c;
        }

        System.out.println("Total: "+sumFibonacci);
    }
}
