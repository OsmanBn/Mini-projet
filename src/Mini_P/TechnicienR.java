package Mini_P;
public class TechnicienR extends Technicien implements Risque{
    public TechnicienR(String m, String n, String p, int a, int d, int nb){
        super(m,n,p,a,d,nb);
    }
    double calculerSalaire(){
        super.calculerSalaire();
        salaire+=prime;
        return salaire;
    }
}
