package Mini_P;
public class ManutentionnaireR extends Manutentionnaire implements Risque {
    
    public ManutentionnaireR(String m, String n, String p, int a, int d, int h){
        super(m,n,p,a,d,h);
    }
    double calculersalaire(){
        salaire+=prime;
        return salaire;
    }
}
