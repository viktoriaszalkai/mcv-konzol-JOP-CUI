
package nezet;

import javax.swing.JOptionPane;


public class FelugroNezet extends CUInezet {
    //private static final Scanner sc = new Scanner(System.in);
    @Override
    public void megjelenit(String tartalom){
        JOptionPane.showMessageDialog(null,tartalom);
    }
     
    @Override
    public int bekeres() {
        String bemenet = JOptionPane.showInputDialog("Szerinted melyik ládában van a kincs? (1,2,3): ");
        return  Integer.parseInt(bemenet);
    }
}
