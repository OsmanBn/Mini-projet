package Mini_P;
public class Vendeur extends Commerciaux{
    
    public Vendeur(String m,String n, String p, int a, int d, double chiffre){
        super(m,n,p,a,d,chiffre);
    }
    
    double calculerSalaire(){                                           //ajoute 100 francs aux 20% du chiffre d'affaire mensuel
        super.calculerSalaire();
        salaire+=100 + salaireBase;
        return salaire;
    }
}