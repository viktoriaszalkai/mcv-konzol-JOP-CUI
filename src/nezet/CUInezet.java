
package nezet;


public abstract class CUInezet {
    //közös ős, itt összegyűjtjük, ami a nézetekben "közös", örököltetjük a nézeteket
    //nem tudja hol akarjuk megjeleniteni ezért nem lehet shout se jop
    public abstract void megjelenit(String tartalom); 
    //abstract--nincs kapcsos zárójel mert "nem akar csincsálni semmit
    public abstract int bekeres();
}
