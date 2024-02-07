package Presentation;

import Metier.Compte;

/**
 * @author med20
 **/
public class GestionComptesApp {
    public static void main(String[] args) {
        Compte c1 = new Compte();
        c1.setNum(Long.valueOf(11111));
        c1.setNomClient("Ahmed");
        c1.setSolde(20000);

        Compte c2 = new Compte();
        c2.setNum(Long.valueOf(22222));
        c2.setNomClient("Hajar");
        c2.setSolde(3000);

        c1.retirer(19000);
        c2.retirer(45000);

        c1.deposer(15000);

        System.out.println(c1.afficherCompte());
        System.out.println(c2.afficherCompte());

    }
}
