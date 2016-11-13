class swap
{
   public static void main(String args[])
    {
       int x,y;
       System.out.print("Enter the first number to be swapped:");
       x=Integer.parseInt(System.console().readLine());
       System.out.print("Enter the second number to be swapped:");
       y=Integer.parseInt(System.console().readLine());
       System.out.println("The values before swapping are:");
       System.out.println("x value:    "  +x);
       System.out.println("y value:    "  +y);
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("The values after swapping are:");
       System.out.println("x value:    "   +x);
       System.out.println("y value:    "   +y);
    }
}