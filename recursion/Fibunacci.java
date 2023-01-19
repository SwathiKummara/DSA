package recursion;

public class Fibunacci {
    public static void main(String[] args) {
        Fibunacci main = new Fibunacci();
        System.out.println(main. fibunacci(30));
        System.out.println(main.fibunacci(-2));

    }
   public int fibunacci(int n){
//base
        if(n == 0 || n == 1){
            return n;
        }
        //uninten
        if (n <0){
            return -1;
        }
        //recursive
        return fibunacci(n-1)+fibunacci(n-2);
   }
}