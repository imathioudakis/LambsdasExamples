package gr.fullstack.java.sixth;

public class MainGFIinteger {

    public static void main(String[] args) {

        //Integer version of GenericFunctionalInterface
        GenericFunctionalInterface<Integer> factorial = num -> {
            int res = 1;
            for(int i=1; i <= num; i++)
                res = res*i;
            return res;
        };

        System.out.println("Running with Integer >>> "+factorial.run(5));
    }
}
