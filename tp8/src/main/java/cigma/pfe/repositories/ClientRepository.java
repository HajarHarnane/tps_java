package cigma.pfe.repositories;
import cigma.pfe.models.Facture;

public interface ClientRepository {

  /* Client save(Client c);
   Client update(Client c);
   void deleteById(long idClient);
   Client findById(long idClient);*/
   Facture save(Facture f);
   Facture modify(Facture f);
   void deleteById(long idFacture);
   Facture getById(long idFacture);

}
