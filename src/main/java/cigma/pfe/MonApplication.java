package cigma.pfe;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.*;


public class MonApplication {

    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) c.getBean("controller");


           /* OneToMany
            Client client = new Client("Omar");
            List<Facture> factures = Arrays.asList(new Facture(1000.0,"facture1",client),new Facture(2000.0,"facture2",client));
            client.setFactures(factures);
            ctrl.save(client);*/



           /* ManyToMany
            Client client = new Client("OMAR");
            List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
            client.setPromotions(promotions);
            ctrl.save(client);*/


          /*  OneToOne
            Client client = new Client("OMAR");
            CarteFidelio carteFidelio = new CarteFidelio("BL9");
            carteFidelio.setClient(client);
            client.setCarteFidelio(carteFidelio);
            ctrl.save(client);*/


        /////////////////// Exercice 5pts///////////////


            Facture facture = new Facture(1500.0,"facture1") ;
            List<Produit> produits = Arrays.asList(new Produit("Produi1",20.00),new Produit("Produit2",30.00));
            facture.setProduits(produits);
            ctrl.create(facture);



            Client client = new Client("OMAR");
            Adresse adresse = new Adresse("Sidi ALI ","FES","Morocco");
            adresse.setClient(client);
            client.setAdresse(adresse);
            ctrl.save(client);

    }
}