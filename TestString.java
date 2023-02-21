import java.io.IOException;

class TestString {
  public static void main(String[] args)  {
    String test = "<put id=hello>";
    
    String[] tag;
    String requiredString;
   

      //Get what's in the tag only
      tag = test.split(">",0);
      //Get the first word after < in the tag
      tag = tag[0].split(" ",0);
      if(tag[0].contains("/"))
      {
        //remove the /
        tag[0] = tag[0].replace("/", "");
      }

   requiredString = tag[0].substring(tag[0].indexOf("<") + +1);

    System.out.println(requiredString);

  }

}