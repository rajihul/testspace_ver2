import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
   /* byte[] test = new byte[2];
    test[0] = Byte.MAX_VALUE;
    test[1] = 102;
    System.out.println(test[1]);
    String testString = new String(test, "UTF-8");
    System.out.println(testString);
    */

    //Strings
    String hello = "hello world what are you, I don't know i I am doing nothing. But if that is what you want to do then this will take a lot o memory.";
    byte[] byteArray = hello.getBytes();
    int wordBytes = byteArray.length;
    System.out.println("Byte\tChar\tString");
    for(int i=0; i < wordBytes; i ++)
    {
      System.out.println(byteArray[i] + "\t\t" + (char)byteArray[i] + "\t\t"
      + String.format("%8s", Integer.toBinaryString(byteArray[i] & 0xFF)).replace(' ', '0'));
    }

    /*System.out.println("\nInteger Manipulation");
    int x = 101;
    byte[] intmanip = x.byteValue();
    System.out.println((char)x);*/
  }
}