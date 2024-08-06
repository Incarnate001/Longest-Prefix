import java.util.Scanner;

class longest_postfix

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

        for(int i = k-1;i > 0;i--)

        {

            char ch = a[0].charAt(i);

            for(int j = 1;j < terms;j++)

            {

                if(ch != a[j].charAt(i))

                {

                    StringBuffer p = new StringBuffer(e);

                    p.reverse();

                    System.out.println("Longest prefix : " + p);

                    System.exit(0);

                }

            }

            e+= ch;

        }

        StringBuffer p = new StringBuffer(e);

        p.reverse();

        System.out.println("LoNgEsT PrEfIx : " + p + " \uD83D\uDE0A");

    }
}
