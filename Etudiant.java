class  Etudiant extends Personne
{
        private String numEtudiant;
        private  String classe;
    private int Annenaissance;

    public Etudiant(String nom, String prenom, int i)
    {
        super(nom, prenom, Anneenaissance, email);
        this.numEtudiant=generereNumEtudiant();
        this.classe=classe;

    }

    private String generereNumEtudiant()
    {
          String id = String.format("%03d");
        return nom +(nom.length() + Annenaissance + "000" + id);

    }
    enum Classe
    {
        L3, M1, M2;
    }

    interface EtudiantInterface
    {
        void  sinscrire();
        void  suivreCour();
        void passerExamen();
    }
    public void sinscrire()
    {
        System.out.println("l'etudiante" + prenom + nom + "s'est inscrit");
    }
    public void suivreCour()
    {
        System.out.println("l'etudiante" + prenom + nom + "suit des cours");
    }

    public void passerExamen()
    {
        System.out.println("l'etudiante" + prenom + nom + "suit des cours");
    }


}


