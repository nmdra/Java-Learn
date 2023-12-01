package examples;

class fibo {
    static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int num = 10;
        int ans = fib(num);

        System.out.println("fib(" + num + ") = " + ans);

    }
}

/* TODO
    -  Caching    
*/

