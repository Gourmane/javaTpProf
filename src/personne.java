import java.util.Scanner;
public class personne 
{
    
    int mat;
    String no;
    float salb;
    float prime;
    
    
    //constructeur par defaut
    public personne()
    {
        
    }
    //constructeur parametre
    
    public personne(int m,String n,float s,float p)
    {
        mat=m;
        no=n;
        salb=s;
        prime=p;
    }
    
    public void saisie()
    {
        Scanner sc = new Scanner(System.in);
        
        int aig=0;
        
        while(aig != 1)
        {
        try
        {
            System.out.println("Saisir le matricule : ");
            mat=sc.nextInt();
            aig=1;
        }
        catch(Exception e1)
        {
            System.out.println("err: taper un nbre entier ??????????");
            aig=0;
            sc.next();
        }
        }
        System.out.println("Saisir le Nom : ");
        
        try
        {
            no=sc.next();
        }
        catch(Exception e2)
        {
            System.out.println("err: taper une c.de caracteres  ??????????");
        }
        
        System.out.println("Saisir le s.de base : ");
        
        try
        {
            salb=sc.nextFloat();
        }
        catch(Exception e3)
        {
            System.out.println("err: taper un nbre reel   salaire ??????????");
        }
        
        System.out.println("Saisir la prime : ");
        
        try
        {
            prime=sc.nextFloat();
        }
        catch(Exception e4)
        {
            System.out.println("err: taper un nbre reel prime  ??????????");
        }
        
          
                 
        
            
            
            
        
        
    }
    
    public void consulter()
    {
        System.out.println("Matricule est : "+mat);
         System.out.println("Nom est : "+no);
          System.out.println("S.base est : "+salb);
           System.out.println("Prime est : "+prime);
    }
    
    public void net()
    {
        float cal=salb+prime;
         System.out.println("le salaire net est : "+cal);
        
    }
}
