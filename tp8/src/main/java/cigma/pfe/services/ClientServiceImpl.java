package cigma.pfe.services;
import cigma.pfe.models.Facture;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl  implements ClientService{


    ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL par Constructor");
        this.clientRepository = clientRepository;
    }

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }
    ///////////CLIENTS///////////
    /*public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    public Client modify(Client c) {
        return clientRepository.update(c);
    }

    @Override
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return clientRepository.findById(id);
    }*/


    ///////////FACTURES//////////////////
    public Facture save(Facture f) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(f);
    }

    public Facture modify(Facture f ){
        return clientRepository.modify(f);
    }

    @Override
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Facture getById(long id) {
        return clientRepository.getById(id);
    }

}
