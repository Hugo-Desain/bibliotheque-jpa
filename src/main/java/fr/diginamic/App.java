package fr.diginamic;

import entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Livre livre = em.find(Livre.class, 3);
        if (livre != null){
            System.out.println(livre);
        }
        em.close();
        emf.close();
    }
}
