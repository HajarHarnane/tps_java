package cigma.pfe;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.models.ClientNormal;
import cigma.pfe.models.ClientVip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("ctrl1");

        ctrl.save(new Client("OMAR"));
        ctrl.save(new ClientVip("OMAR","top"));
        ctrl.save(new ClientNormal("OMAR",5));



    }
}
