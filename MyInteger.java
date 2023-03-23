public class MyInteger {
    int value;

    public int getValue() {
        return value;
    }
    public MyInteger(int value)
    {
        this.value=value;
    }
    public boolean isEven()
    {
        if(value%2==0)
            return true;
        else
            return false;
    }
    public boolean isOdd()
    {
        if(value%2==0)
            return false;
        else
            return true;
    }
    public boolean isPrime()
    {   prime =0;
        if(value==1)
            return true;
        else
        {
            for(int i=2;i<value;i++)
            {
                if(value%i==0)
                    prime=1;
            }
            if(prime==1)
                return false;
            else
                return true;

        }
    }
    public static boolean isEven(int y)
    {
        if(y%2==0)
            return true;
        else
            return false;
    }
    public static boolean isOdd(int y)
    {
        if(y%2==0)
            return false;
        else
            return true;
    }
    public static boolean isPrime(int y)
    {   prime =0;
        if(y==1)
            return true;
        else
        {
            for(int i=2;i<y;i++)
            {
                if(y%i==0)
                    prime=1;
            }
            if(prime==1)
                return false;
            else
                return true;

        }
    }
    public static boolean isEven(MyInteger y)
    {
        if(y%2==0)
            return true;
        else
            return false;
    }
    public static boolean isOdd(MyInteger y)
    {
        if(y%2==0)
            return false;
        else
            return true;
    }
    public static boolean isPrime(MyInteger y)
    {   prime =0;
        if(y==1)
            return true;
        else
        {
            for(int i=2;i<y;i++)
            {
                if(y%i==0)
                    prime=1;
            }
            if(prime==1)
                return false;
            else
                return true;

        }
    }
    public boolean equals(int y)
    {
        if(y==value)
            return true;
        else
            return false;
    }
    public boolean equals(MyInteger y)
    {
        if(y==value)
            return true;
        else
            return false;
    }




}
