package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "TFactures")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long id;
    private double amount;
    private String description;

    @ManyToOne()
    @JoinColumn(name = "Client_id")
    private Client client;

    @ManyToMany(cascade ={CascadeType.PERSIST})
    @JoinTable(name = "my_join_table_Facture_Produit",joinColumns = @JoinColumn(name = "Facture_fk",referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn(name="Produit_fk",referencedColumnName="id"))
    private List<Produit> produits;


    public Facture( double amount,String description) {

        this.amount = amount;
        this.description = description;
    }
    public Facture( double amount,String description,Client client) {

        this.amount = amount;
        this.description = description;
        this.client = client;
    }

}