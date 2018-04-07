import java.util.ArrayList;

/** Class for testing the running times of various functions on
 *  different inputs. Usage:
 *      java Asymptotics x n
 *  (where x and n are positive integers and x is less than 5)
 *  prints the number of seconds that functionx(n) takes to run. */
public class Asymptotics {

    public static void main(String[] args) {
        if (args.length > 1) {
            try {
                int func = Integer.parseInt(args[0]);
                long arg = Long.parseLong(args[1]);
                if (arg < 0) {
                    usage();
                    return;
                }
                Stopwatch timer = new Stopwatch();
                switch (func) {
                case 1: function1(arg);
                    break;
                case 2: function2(arg);
                    break;
                case 3: function3(arg);
                    break;
                case 4: function4(arg);
                    break;
                case 5: function5(arg);
                    break;
                default: usage();
                        return;
                }
                System.out.println(timer.elapsedTime() + " seconds elapsed");
            } catch (NumberFormatException e) {
                usage();
            }
        } else {
            usage();
        }
    }

    public static void function1(long n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++) {
                a.add(0);
                a.clear();
            }
        }
    }

    public static void function2(long n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < n; i++){
            for (; j < i; j++) {
                a.add(0);
                a.clear();
            }
        }
    }


    public static void function3(long n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n*n; j++) {
                a.add(0);
                a.clear();
            }
        }
    }

    /** Fill in the body of this function so that its running time is
     *  n^(1/2) and so that it returns true if and only if n is prime. */
    public static boolean function4(long n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
	    long md = (int) (Math.sqrt(n) + 0.5);
        for(int i = 2; i <= md; i += 1) {
            for(int j = 0; j <= 10000; j += 1) {
            a.add(0);
            a.clear();   
            }
            if(n % i == 0) return false;
        }
        return true;
    }

    /** Fill in the body of this function so that its best case running
     *  time is log(n) and its worst case running time is n. */
    public static void function5(long n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(n % 2 == 0) {
            for(int i = 1; i <= n; i += 1) {
                for (int j = 0; j < 100000; j++) {
                    a.add(0);
                    a.clear();
                }
            }
        } else {
            for(int i = 1; i <= n; i *= 2) {
                for (int j = 0; j < 10000000; j++) {
                    a.add(0);
                    a.clear();
                }
            }
        }
    }

    public static void usage() {
        System.out.println("To run function x with input n (where x and n " +
                           "are positive integers and x is less than 5) use" +
                           " the command 'java Asymptotics x n'");
    }

}
