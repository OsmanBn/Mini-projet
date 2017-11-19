package Mini_P;
public class AgentRep extends Commerciaux {
    
    public AgentRep(String m,String n, String p, int a, int d, double chiffre){
        super(m,n,p,a,d,chiffre);
    }
    
    double calculerSalaire(){
        super.calculerSalaire();
        salaire+=200;
        return salaire + salaireBase;
    }
}
