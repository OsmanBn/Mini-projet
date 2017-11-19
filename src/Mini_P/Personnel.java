package Mini_P;

public class Personnel {
    int nbE = 1000;
    double som=0;
    Employe[] Personnel = new Employe[nbE];
    int j;
    int i=0;
    //double a=0;
    
    public Personnel(int max){
        nbE=max;
    }
    
    void ajouterEmploye(Employe e){
        if (i<nbE){
            Personnel[i] = e;
            i++;
        }
        else{
            System.out.println("Impossible d'ajouter "+e.getNom());
        }
    }
    
    void calculerSalaires(){
        if (i==0){
            System.out.println("Imposssible d'afficher les salaires. Il n'y a aucun employe dans cette entreprise.");
        }
        else{
            for(j=0;j<i;j++){
                System.out.println(Personnel[j].getNom()+" a un salaire de "+Personnel[j].calculerSalaire()+" francs CFA \n");
            }
        }
    }
    
    double salaireMoyen(){
        int sM;
        if (i==0){
            System.out.println("Impossible d'afficher le salaire moyen! Il n'y a aucun employe dans cette entreprise.");
            sM=0;
        }
        else{
            for(j=0;j<i;j++){
                som+=Personnel[j].calculerSalaire();
            }
            sM = (int)som/i;
            System.out.println("Le salaire moyen est : "+sM);
        }
        return sM;
    }
    
    double getIndice(){
        return i;
    }
    /*void licencierEmploye(Employe e){
        if(Personnel[2]!=e){
            Personnel[2]=null;
        }
        System.out.println("vous venez de mettre "+e.getNom()+" au chômage...");
    }*/
}
