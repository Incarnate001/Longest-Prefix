import java.util.Scanner;

class longest_prefix

{

    public static void main(int terms)

    {

        String a[] = new String[terms];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter " + terms + " terms");

        String d = "";

        for(int i = 0;i < terms;i++)

        {

            a[i] = in.nextLine();

            a[i]=a[i].toUpperCase();

            d+= a[i]+" ";

        }

        String e = "";

        String k1 = methods.smallest(d);

        int k = k1.length();

        for(int i = 0;i < k;i++)

        {

            char ch = a[0].charAt(i);

            for(int j = 1;j < terms;j++)

            {

                if(ch != a[j].charAt(i))

                {

                    System.out.println("LoNgEsT PrEfIx : " + e + " \uD83D\uDE0A");

                    System.exit(0);

                }

            }

            e+= ch;

        }

        System.out.println("Longest Prefix : " + e );

    }

}

