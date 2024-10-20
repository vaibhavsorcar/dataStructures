import java.util.*;
class program 
{
    public static void(int i, String st, String f)
    {
        if(i == st.length())
        {
            System.out.println(f + " ");
        }
        solve(i+1, s, f+ st.charAt(i));
        solve(i+1, s, f);
    } 
    public static void main(String args[])
    {
        String s = "abc";
        solve(0,s,"");
    }
}