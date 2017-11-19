package Mini_P;
public class Commerciaux extends Employe {
    protected double chiffreAff;
    
    public Commerciaux(String m, String n, String p, int a, int d, double chiffre) {
        super(m, n, p, a, d);
        chiffreAff = chiffre;
    }
    
    double calculerSalaire(){                                   //Calcul 20% du chiffre d'affaire mensuel
        salaire = (20*chiffreAff)/100;
        return salaire;
    }
    
}