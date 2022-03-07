package powerpackage;
import java.lang.*;
public class Powerfinder {
    public static int oF(int xyz, int pqr) {
        int p = 1;
        for (int i = 0; i<pqr; i++) {
            p = p * xyz;
        }
        return p;
    }
}
