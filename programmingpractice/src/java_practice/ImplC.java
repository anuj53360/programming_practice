package java_practice;

interface BaseI { void method(); }

class BaseC
{
   public void method()
   {
      System.out.println("Inside BaseC::method");
   }
}

class ImplC extends BaseC implements BaseI
{
   public static void main(String []s)
   {
	   int mask = 0x000F;
       int value = 0x2222;
       System.out.println(value & mask);
	   
	   
      (new ImplC()).method();
   }
}