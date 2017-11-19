/*
    projet Entreprise
    By OUSSOUMANOU BENOIT
    matricule: 16B156FS
*/
package Mini_P;
import java.util.Scanner;
public class Salary {

    public static void main(String[] args) {
        int choix,type;
        boolean F;
        Scanner ch = new Scanner(System.in);
        
        Scanner nb = new Scanner(System.in);                                    //permet de saisir le nombre max d'employer
        System.out.println("Saisir le nombre max d'employe dans l'entreprise: ");
        int max = nb.nextInt();
        
        Personnel p= new Personnel (max);        
        do{                                                                     //Boucle qui affiche les differentes options du menu
            System.out.println("\nChoisir une des options : ");
            System.out.println(" 1.Ajouter un employe."
                    + " \n 2.Afficher les salaires des employes."
                    + " \n 3.Afficher le salaire moyen."
                    + " \n 4.Fin du programme.");
            choix = ch.nextInt();
            F=false;
        
            switch(choix){                                                      //Instructions qui gere les differents choix
            case 1:                                                             //Demande à l'utilisateur les informations sur l'employe
            {
                if (p.getIndice()==max){                                        //verifie si le nombre max d'employe est atteint
                    System.out.println("Le nombre max d'employe est atteint!");
                }
                else{
                    Scanner N = new Scanner(System.in);
                    System.out.println("saisir le nom de l'employe: ");
                    String nom = N.nextLine();
        
                    Scanner P = new Scanner(System.in);
                    System.out.println("saisir le prenom de l'employe: ");
                    String prenom = P.nextLine();

                    Scanner A = new Scanner(System.in);
                    System.out.println("saisir l'age de l'employe: ");
                    int age = A.nextInt();
        
                    Scanner D = new Scanner(System.in);
                    System.out.println("saisir la date d'entree en service de l'employe: ");
                    int date = D.nextInt();
                    
                    
                    boolean typeCond;
                    do{                                                         //boucle qui affiche les differents types d'employe
                    typeCond=false;    
                    System.out.println("De quel type d'employe s'agit il?"
                            + "\n  1.vendeur"
                            + "\n  2.AgentRep"
                            + "\n  3.technicien"
                            + "\n  4.Manutentionnaire"
                            + "\n  5.technicien a risque"
                            + "\n  6.Manutentionnaire a risque)");
                    Scanner t = new Scanner(System.in);
                    type = t.nextInt();
                    
                    switch(type){                                               //Instruction qui gere la creation des differents types d'employe
                        case 1:{
                            Scanner CV = new Scanner(System.in);
                            System.out.println("saisir le chiffre d'affaire mensuel de l'employe: ");
                            double chiffreV = CV.nextDouble();
                    
                            Vendeur e1 = new Vendeur("ECAM",nom,prenom,age,date,chiffreV);
                            p.ajouterEmploye(e1);
                        }
                        break;
                            
                        case 2:{
                            Scanner CA = new Scanner(System.in);
                            System.out.println("saisir le chiffre d'affaire mensuel de l'employe: ");
                            double chiffreA = CA.nextDouble();
                            
                            AgentRep e1 = new AgentRep("ECAM",nom,prenom,age,date,chiffreA);                            
                            p.ajouterEmploye(e1);
                        }
                        break;
                            
                        case 3:{
                            Scanner nbU = new Scanner(System.in);
                            System.out.println("saisir le nombre d'unites fabriques par le technicien: ");
                            int Unites = nbU.nextInt();
                            
                            Technicien e1 = new Technicien("ECAM",nom,prenom,age,date,Unites);                            
                            p.ajouterEmploye(e1);
                        }
                        break;
                        
                        case 4:{
                            Scanner h = new Scanner(System.in);
                            System.out.println("saisir le nombre d'heure de travail du manutentionnaire: ");
                            int heure = h.nextInt();
                            
                            Manutentionnaire e1 = new Manutentionnaire("ECAM",nom,prenom,age,date,heure);                            
                            p.ajouterEmploye(e1);
                        }
                        break;
                        
                        case 5:{
                            Scanner nbU = new Scanner(System.in);
                            System.out.println("saisir le nombre d'unites fabriques par le technicien a risque: ");
                            int Unites = nbU.nextInt();
                            
                            TechnicienR e1 = new TechnicienR("ECAM",nom,prenom,age,date,Unites);                            
                            p.ajouterEmploye(e1);
                        }
                        break;
                        
                        case 6:{
                            Scanner h = new Scanner(System.in);
                            System.out.println("saisir le nombre d'heure de travail du manutentionnaire a risque: ");
                            int heure = h.nextInt();
                            
                            ManutentionnaireR e1 = new ManutentionnaireR("ECAM",nom,prenom,age,date,heure);                            
                            p.ajouterEmploye(e1);
                        }
                        break;
                        default:
                            System.out.println("erreur! ce type d'employe n'existe pas.");
                            typeCond=true;
                        }
                    }while(typeCond==true);

                    
                    System.out.println("L'employe a bien ete ajoute.");
                }
            }
            break;
            
            case 2:{
                p.calculerSalaires();
            }
            break;
            
            case 3:{
                
                p.salaireMoyen();
            }
            break;
            
            case 4:{
                System.out.println("Fin du programme.");
                F=true;
            }
            break;
                
            default:{
                System.out.println("Saisir un des numeros (1, 2, 3 ou 4):");
            }
            break;
        }
        }while(F==false);
        
        /*Personnel p = new Personnel(100);
        AgentRep e1 = new AgentRep ("002ECAM","François","Dany",31,2015,86000);
        Technicien e2 = new Technicien ("003ECAM","Barakouda","Commando",22,2012,9970);
        Manutentionnaire e3 = new Manutentionnaire ("004ECAM","Zouf","leboss",31,1999,196);
        TechnicienR e4 = new TechnicienR ("005ECAM","Atangana","junior",23,2009,5500);
        ManutentionnaireR e5 = new ManutentionnaireR ("006ECAM","Nomo","sylvie",31,2017,145);
        
        p.ajouterEmploye(e1);
        p.ajouterEmploye(e2);
        p.ajouterEmploye(e3);
        p.ajouterEmploye(e4);
        p.ajouterEmploye(e5);
        
        p.calculerSalaires();        
        p.salaireMoyen();*/
    }

}