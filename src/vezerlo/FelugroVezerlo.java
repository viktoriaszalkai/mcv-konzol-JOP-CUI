
package vezerlo;

import modell.JatekModell;
import nezet.CUInezet;
import nezet.FelugroNezet;



public class FelugroVezerlo {
    private JatekModell modell;
    private CUInezet nezet;

    public FelugroVezerlo(JatekModell modell, CUInezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        start();
    }

    public void start() {
       nezet.megjelenit(modell.kezdes());
       modell.setValasztas(nezet.bekeres());
       nezet.megjelenit(modell.ellenorzes());
    }
}
