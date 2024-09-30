
package vezerlo;

import modell.JatekModell;
import nezet.CUInezet;


public class CUIvezerlo {
    
    private JatekModell modell;
    private CUInezet nezet;

    public CUIvezerlo(JatekModell modell, CUInezet nezet) {
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

