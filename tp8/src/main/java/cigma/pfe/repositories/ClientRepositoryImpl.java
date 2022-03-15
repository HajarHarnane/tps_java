package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientRepositoryImpl implements ClientRepository {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();

    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }

    /*public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        return null;

    }
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }


    public Client update(Client c) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null ;
    }




    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }*/

    ////////////FACTURE///////////
    public Facture save(Facture f) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();

        return null;

    }
    public void deleteById(long idFacture) {
        em.getTransaction().begin();
        Facture clientInDataBase = em.find(Facture.class,idFacture);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }


    public Facture modify(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setDate(f.getDate());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null ;
    }

    @Override
    public Facture getById(long idFacture) {
        return em.find(Facture.class,idFacture);
    }


}

