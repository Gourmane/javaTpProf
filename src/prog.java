import java.util.Scanner;
public class prog {
    public static void main(String[] arg)
    {
        int choix=0;
         int aig=0;
        Scanner sc=new Scanner(System.in);
        personne p1 = new personne();
        
        while(choix != 9)
        {
        System.out.println("         1  saisie");
        System.out.println("         2  consultation");
        System.out.println("         3  net");
        System.out.println("         9  Exit");
        System.out.println("  taper votre choix : ");
       
         try
        {
            
            choix=sc.nextInt();
            aig=1;
        }
        catch(Exception e1)
        {
            System.out.println("err: taper un nbre entier ??????????");
            aig=0;
            sc.next();
        }
        switch(choix)
        {
            case 1:
                
        
        
        System.out.println("                        Saisie");
        p1.saisie();
        break;
        
            case 2:
        System.out.println("                        affichage");
        p1.consulter();
        break;
            case 3:
        System.out.println("                        Calcul et affichage du net");
        p1.net();
        break;
        
            case 9:
                System.out.println("bye bye have a good day see you next week");
                break;
                
            default:
                System.out.println(" erreur taper 1 ou 2 ou 3 ou 9");
                break;
    }
    }
}
}