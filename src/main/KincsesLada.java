
package main;

import modell.JatekModell;
import nezet.CUInezet;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.CUIvezerlo;


public class KincsesLada {

    
    public static void main(String[] args) {
        
        JatekModell modell = new JatekModell();
        //KonzolNezet nezet = new KonzolNezet();
        //FelugroNezet felNezet = new FelugroNezet();
        
        //new KonzolVezerlo(modell, nezet);
        
        //new FelugroVezerlo(modell,felNezet);
        
        CUInezet nezet; //közös őst csinálunk, hogy ezzel hivatkozni tudjuk az utódjaira --> polimorfizmus
        nezet = new KonzolNezet();
        new CUIvezerlo(modell, nezet);
        //nezet = new FelugroNezet();
       //new KonzolVezerlo(modell, nezet);
        nezet = new FelugroNezet();
        new CUIvezerlo(modell,nezet);
        
        
        
    }
    
}
