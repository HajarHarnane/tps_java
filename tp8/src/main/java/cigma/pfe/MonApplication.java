package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MonApplication {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

        ///////////////////////CLIENT/////////////

        // save clients
        //ctrl.save(new Client("nouhaila"));
        //ctrl.save(new Client("lina"));

        // modify client
        //ctrl.modify(new Client(1,"kkkk"));

        // re,ove client
       //ctrl.removeById(1L);

        //read client
        //Client found = ctrl.getById(1);


       /////////////FACTURES////////////



       // ctrl.save(new Facture(new Date("01/01/2022"),10));
        //ctrl.save(new Facture(new Date("01/01/2022"),40));
        //ctrl.removeById(1);
        //ctrl.modify(new Facture(3,new Date("15/12/2022"),20));


    }
}
