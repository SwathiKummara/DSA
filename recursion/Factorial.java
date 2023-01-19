package recursion;

class Factorial {
    public static void main(String[] args) {
        Factorial main = new Factorial();
        System.out.println(main.factorial(30));
        System.out.println(main.factorial(-2));
    }

    public int factorial(int n) {
        if (n<0){
            return -1;
        }
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        else {
            return n * factorial(n - 1);
        }
    }
}
