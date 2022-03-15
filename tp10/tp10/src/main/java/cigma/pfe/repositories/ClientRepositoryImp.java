package cigma.pfe.repositories;
import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;
import javax.persistence.*;

@Repository
public class ClientRepositoryImp implements ClientRepository{

    @PersistenceContext
    private EntityManager entitymanager;

    @Override
    public Client save(Client c) {
        entitymanager.persist(c);
        return null;

    }


}
