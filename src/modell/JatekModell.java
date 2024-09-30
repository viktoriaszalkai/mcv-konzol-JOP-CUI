package modell;
public class JatekModell {
    
    private Lada[] ladak;
    private int valasztas;

    public JatekModell() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Bennem van a kincs!");
        ladak[1] = new Lada("ezüst", "Nem bennem van a kincs!", true);
        ladak[2] = new Lada("bronz", "Az arany láda hazudik!");

        //bekeres();
        //megjelenit(ellenorzes());
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat igaz!\n";
        int i = 1;
           for(Lada lada:ladak){
               String a = lada.getAnyag();
               String f = lada.getFelirat();
               s += i++ + ". "+a+"láda-->" + f + "\n";
           }
        return s;
    }

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }

    
    
    public String ellenorzes() {
       String talalt = "Gratulálok eltaláltad!";
       String nemTalalt = "Sajnos nem talált!";
       return ladak[valasztas-1].isKincs() ? talalt: nemTalalt;
    }
    
    
    
   
    
}
