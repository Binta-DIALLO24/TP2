import java.util.Set;

class Professeur extends Personne {
    private Set<String> specialite;
    public Professeur(String nom, String prenom, int Anneenaissnce, String email, Set<String> specialite) {
        super(nom, prenom, Anneenaissnce, email);
        this.specialite= specialite;
    }

    interface ProfesseurInterface
    {
        void  enseigner();
        void corrigerExamen();
    }
    public void enseigner()
    {
        System.out.println("Monsieur" + nom +"enseigne");
    }
    public void corrigerExamen()
    {
        System.out.println("Monsieur" + nom + "fait la correction d'un examem");
    }
}


