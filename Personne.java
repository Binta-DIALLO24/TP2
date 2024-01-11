public class Personne {
    protected  String nom;
    protected  String prenom;
    protected  int Anneenaissance;
    protected String email;

    public  Personne(String nom, String prenom, int Anneenaissnce, String email)
    {
        this.nom=nom;
        this.prenom=nom;
        this.Anneenaissance=Anneenaissnce;
        this.email=email;


    }
    public  String getNom()
    {
        return  nom;
    }
    public String getPrenom()
    {
        return prenom;
    }
    public int getAnnenaissance()
    {
        return Anneenaissance;
    }
    public  String getEmail()
    {
        return  email;
    }

}
