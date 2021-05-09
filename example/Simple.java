package example;

public class Simple {

    public static void main(String[ ] args)

    {

        Simple obj = new Simple( );

        obj.start( );

    }

    void start( )

    {

        long [ ] P= {3, 4, 5};

        long [ ] Q= method (P);

        System.out.print (P[0] + P[1] + P[2]+ ":");

        System.out.print (Q[0] + Q[1] + Q[2]);

    }

    long [ ] method (long [ ] R)

    {

        R [1]=7;

        return R;

    }

}
