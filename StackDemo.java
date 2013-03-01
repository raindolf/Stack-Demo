//**************************************************************************
// This is a demo program that uses a stack algorithm for reading
// a file and printing its lines in reverse order.
//Kindly contribute code or send me a mail here iraindolf@gmail.com
//**************************************************************************
import java.util.*;
import java.io.*;
public class StackDemo
{
  public static void main (String args[]) throws IOException
  {
    Stack<String> stack = new Stack<String>();
    Scanner in = new Scanner(new FileReader("new/stackdemo.txt"));
    while (in.hasNext())
      stack.push(in.nextLine());
    in.close();
    while (!stack.empty())
      System.out.println(stack.pop());
  }
}
