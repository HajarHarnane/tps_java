package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.ClientService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClientController {

    ClientService clientService;


    public Client save(Client c ){
        return    clientService.save(c);
    }
    public Client modify(Client c){
        return  clientService.modify(c);
    }
    public void removeById(long id){
        clientService.removeById(id);
    }

    public Client getById(long id){
        return clientService.getById(id);
    }
    public List<Client> getAll(){
        return clientService.getAll();
    }

    // Facture
    public Facture create(Facture f){
        return clientService.create(f);
    }
    public List<Facture> read(){
        return clientService.read();
    }
    public void delete(long id){
        clientService.delete(id);
    }
    public Facture update(Facture f){
        return  clientService.update(f);
    }
}
