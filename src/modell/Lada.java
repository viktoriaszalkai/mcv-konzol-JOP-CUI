package modell;

public class Lada {
    private String anyag, felirat;
    private boolean kincs;

    public Lada(String anyag, String felirat) {
        this(anyag, felirat, false);
    }
    
    public Lada(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }
    //akkor lesz getterből setter, ha referencia(nagybetűs - String(ezzel egyébként nincs probléma))
    //-> nem magát kell visszaadni, hanem lamésoljuk vagy egy kollekciót(beépített lista(arraylist,hashset)) adjuk vissza
    //getter ne fedje fel a belső típust!!!!!!!

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }

//    public void setKincs(boolean kincs) {
//        this.kincs = kincs;
//    }
    //helyette inkább két berszédes metódut használjunk
    
    public void kincsetElhelyez(){
       this.kincs = true;
    }
    public void kincsetKivesz(){
       this.kincs = false;
    }
    
        
}
