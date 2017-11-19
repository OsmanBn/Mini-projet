package Mini_P;
public abstract class Employe {
    
    protected String matricule;
    protected String nom;
    protected String prenom;
    protected int age;
    protected int date;
    protected double salaire;
    protected static double salaireBase = 110000;
            
    abstract double calculerSalaire();                              //methode qui calcul le salaire

    
    String getNom(){
        return "L'employe "+nom+" "+prenom;
    }
    
    public Employe(String m, String n, String p, int a, int d){
        matricule = m;
        nom = n;
        prenom = p;
        age = a;
        date = d;
    }
}