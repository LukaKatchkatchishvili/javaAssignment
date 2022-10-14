//2
public class Main {
    String getfun(String[] arr)
    {
        String s=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i].length()<s.length())
                s=arr[i];
        }
        return s;


    }
//1
    public static void main(String[] args) {

        // This method reads the number provided using keyboard
        int a = 3;
        int b = 5;
        int c = 10;
        // Closing Scanner after the use

        int d=b*b-4*a*c;



        System.out.println("answer is  "+d);
    }
}