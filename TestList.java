import java.util.*;
import java.nio.ByteBuffer;

class TestList
{
  public static void main(String[] args)
  {
    ArrayList<String, Integer> testList = new ArrayList<>();
    testList.add("hello", new Integer(3));
    testList.add("world", new Integer(3));
    testList.add("butts", new Integer(3));
    testList.add("testing", new Integer(3));

    System.out.println(testList.get(0) + " " + testList.get(1));

   /* long a = 45;
    byte[] len;

    ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
    buffer.putLong(a);

    len = buffer.array();

    System.out.println(len.length);

    */
  }
}