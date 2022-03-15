package cigma.pfe.services;
import cigma.pfe.models.Facture;

public interface ClientService {
    /*Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);*/
    Facture save(Facture f);
   
    Facture modify(Facture f);

    void removeById(long id);

    Facture getById(long id);
}
