
package nezet;

import java.util.Scanner;

public class KonzolNezet {
    private static final Scanner sc = new Scanner(System.in);
    public void megjelenit(String tartalom){
        System.out.println(tartalom);
    }
     
    public int bekeres() {
        megjelenit("Szerinted melyik ládában van a kincs? (1,2,3): ");
        return sc.nextInt();
    }
}
