package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClientServiceImp implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ClientServiceImp(ClientRepository clientRepository) {
        System.out.println("creation bean service");

    }
    @Override
    public Client save(Client c ){
        return clientRepository.save(c);
    }




}
