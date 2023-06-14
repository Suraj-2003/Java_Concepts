import java.lang.*;

class Base
{
    public int i;
    public int j;

 

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base      // class Derived : public Base
{
    public int x;
    public int y;

    public Derived(int a, int b)
    {
        
        System.out.println("Inside derived constructor");
        this.x = a;
        this.y = b;
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
       
      
     
    }
}


class Derivedx extends Derived     // class Derived : public Base
{
    public int p;
    public int q;

    public Derivedx()
    {
         super(11,21);
        System.out.println("Inside derivedx constructor");
        this.p = 30;
        this.q = 40;
    }

    public void run()
    {
        System.out.println("Inside derivedx sun");
        System.out.println(super.x);
      
     
    }
}
class Inheritance2
{
    public static void main(String a[])
    {
        System.out.println("Inside main");
        Derivedx dobjx = new Derivedx();

        dobjx.run();
    }
}