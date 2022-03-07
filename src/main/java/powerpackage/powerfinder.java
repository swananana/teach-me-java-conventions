package powerpackage;
//import java.lang.*;
public class Powerfinder {
    public static int oF(int base, int power) {
        int output = 1;
        for (int i = 0; i<power; i++) {
            output = output * base;
        }
        return output;
    }
}
