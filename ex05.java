package JavaCoding;

public class ex05 {
    public static void main (String[]args)
    {
      String s1 = "My name is rahul";
      int r = 0, c = 0;
      char a[] = s1.toCharArray ();
      char b[][] = new char[10][10];
      for (int i = 0; i < a.length; i++)
        {
      if (a[i] != ' ')
        {
          b[r][c] = a[i];
          c++;
        }
      else
        {
          b[r][c] = '\0';
          r++;
          c = 0;
        }
        }
      c = 0;
      for (int i = r; i >= 0; i--)
        {
      while (b[i][c] != '\0')
        {
          System.out.print (b[i][c]);
          c++;
        }
      System.out.print (" ");
      c = 0;
        }
    }
}
