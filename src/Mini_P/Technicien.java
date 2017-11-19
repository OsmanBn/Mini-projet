package Mini_P;
public class Technicien extends Employe{
    protected int nbUnites;
    
    public Technicien(String m,String n, String p, int a,int d, int nb){       //constructeur de la classe AgentProd, tient compte de son attribut nbUnites
        super(m,n,p,d,a);
        nbUnites=nb;
    }
    
    double calculerSalaire(){
        salaire=nbUnites*5+salaireBase;
        return salaire;
    }
}
