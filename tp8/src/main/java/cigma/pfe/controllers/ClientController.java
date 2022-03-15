package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.ClientService;

public class ClientController {

    ClientService clientService;


    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }
    public ClientController() {
        System.out.println("Call ClientController ....");
    }

    //////////CLIENT/////////


   /* public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
    public void modify(Client c){
        clientService.modify(c);
    }

    public void removeById(long id){
        clientService.removeById(id);
    }
    public Client getById(long id){
        return clientService.getById(id);
    }*/



    ///////////FACTURE/////////////
    public Facture save(Facture f ){
        System.out.println("ClientController level...");
        return clientService.save(f);
    }
    public void modify(Facture f){
        clientService.modify(f);
    }


    public void removeById(long id){
        clientService.removeById(id);
    }
    public Facture getById(long id){
        return clientService.getById(id);
    }

}
