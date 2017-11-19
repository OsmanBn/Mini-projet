package Mini_P;
public class Manutentionnaire extends Employe{
    protected int heureTaf;
    
    public Manutentionnaire(String m, String n, String p, int a, int d, int h){       //constructeur tient compte du nombre d'heure de travail
        super(m,n,p,d,a);
        heureTaf = h;
    }
    
    double calculerSalaire(){
        salaire = heureTaf*65;
        return salaire+salaireBase;
    }
}
