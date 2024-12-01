public class Primes {
    public static void main(String[] args) {
        //I assume you want me to do it this way but the next way is better and essentially the same

        // int topNumber = Integer.parseInt(args[0]);
        // boolean[] allValues = new boolean[topNumber + 1];
        // for (int i = 0; i < allValues.length; i++) {
        //     allValues[i] = true;
        // }
        // allValues[0] = false;
        // allValues[1] = false;

        // for (int i = 3; i < allValues.length; i++) {
        //     allValues[i] = i % 2 != 0;
        // }
        // for (int i = 3; i < allValues.length; i++) {
        //     if (allValues[i]) {
        //         for (int u = i + 1; u < allValues.length; u++) {
        //             if (allValues[u]) {
        //                 allValues[u] = u % i != 0;
        //             }
        //         }
        //     }
        // }


        int topNumber = Integer.parseInt(args[0]);

        //Initializing
        boolean[] allValues = new boolean[topNumber + 1];
        allValues[0] = false;
        allValues[1] = false;
        for (int i = 2; i < allValues.length; i++) {
            allValues[i] = true;
        }


        for (int i = 0; i < allValues.length; i++) {
            if (allValues[i]) {
                for (int u = i + 1; u < allValues.length; u++) {
                    if (allValues[u]) {
                        allValues[u] = u % i != 0;
                    }
                }
            }
        }

        //Printing
        System.out.println("Prime numbers up to " + topNumber + ":");
        int howMany = 0;
        for (int i = 0; i <  allValues.length; i++) {
            if(allValues[i]) {
                howMany++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + howMany + " primes between 2 and " + topNumber + " (" + (int)(((double)howMany / topNumber) * 100) + "% are primes)");
    }
}