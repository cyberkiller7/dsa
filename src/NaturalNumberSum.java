public class NaturalNumberSum {
    public static void main(String args[]){
        System.out.println(sumOfNaturalNumbers(5));
    }

    public static int sumOfNaturalNumbers(int n)
    {
        if(n==0 || n==1)
            return n;
        return n + sumOfNaturalNumbers(n-1);
    }
}
