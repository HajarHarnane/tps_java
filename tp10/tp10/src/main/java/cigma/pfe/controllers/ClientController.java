package cigma.pfe.controllers;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value = "ctrl1")
public class ClientController {
    @Autowired
    ClientService clientService;

    public ClientController(ClientService clientService ){
        System.out.println("creation bean controller");
    }

    public Client save(Client c ){
        return    clientService.save(c);
    }


}

