package wrappers;

public class WrapperDemo3 {
    public static void main(String[] args) {
        double d1 = Double.parseDouble("3.14"); // convert a String to a primitive
        System.out.println("d1 = " + d1); // result is d1 = 3.14
        Double d2 = Double.valueOf("3.14"); // create a Double obj
        System.out.println("d2 value = " + d2);

        long aLong1 = Long.parseLong("101010", 2); // binary String to a  primitive
        System.out.println("aLong1 = " + aLong1); // result is: aLong1 = 42
        Long aLong2 = Long.valueOf("101010", 2); // binary String to  Long object
        System.out.println("aLong2 value = " + aLong2); // result is:  aLong2 value = 42
    }
}
