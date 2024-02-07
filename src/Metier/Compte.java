package Metier;

/**
 * @author med20
 **/
public class Compte {
    private Long num;
    private String nomClient;
    private double solde;

    public Compte() {
    }

    public Compte(Long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String afficherCompte() {
        return "Compte{" +
                "num=" + num +
                ", nomClient='" + nomClient + '\'' +
                ", solde=" + solde +
                '}';
    }

    public void retirer(double montant){
        if(montant < 0){
            throw new RuntimeException("Montant doit etre > 0");
        }
        else if (this.solde > montant){
            this.solde-=montant;
        }
        else
            throw new RuntimeException("Solde insuffisant");
    }
    public void deposer(double montant){
        if (montant>0)
         this.solde+=montant;
        else
            throw new RuntimeException("Montant doit etre > 0");
    }
}
