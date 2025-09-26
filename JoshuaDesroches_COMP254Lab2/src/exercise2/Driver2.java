package exercise2;

public class Driver2 {
    public static void main(String[] args){
        // Generate an array of 40 doubles with varying values
        double[] x = new double[10000];
        for (int i = 0; i < x.length; i++) {
            x[i] = 1.0 + (i * 0.247) % 99.0; // values between 1.0 and 100.0
        }


        int trials = 10;
        int n = x.length; // initialize n to the length of x
        try {
            if (args.length > 0)
                trials = Integer.parseInt(args[0]);
            if (args.length > 1)
                n = Integer.parseInt(args[1]); // set n, not x
        } catch (NumberFormatException e) { }
        double[] start = x; // remember the original starting value



        System.out.println("Testing prefixAverage1...");
        for (int t=0; t < trials; t++) {
            long startTime = System.currentTimeMillis();
            x = PrefixAverage.prefixAverage1(x);
            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;

            String strArray = ""; // Reset for each trial
            for (int j = 0; j < x.length; j++) {
                strArray += String.format("[%.2f]", x[j], j+1);
                if (j < x.length - 1) strArray += ", ";
            }
            System.out.println(strArray + String.format(" took %12d milliseconds", elapsed));
        }


        System.out.println("Testing prefixAverage2...");
        x = start;
        for (int t=0; t < trials; t++) {
            long startTime = System.currentTimeMillis();
            x = PrefixAverage.prefixAverage2(x);
            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;

            String strArray = ""; // Reset for each trial
            for (int j = 0; j < x.length; j++) {
                strArray += String.format("[%.2f]", x[j], j+1);
                if (j < x.length - 1) strArray += ", ";
            }
            System.out.println(strArray + String.format(" took %12d milliseconds", elapsed));
        }
    }


}
