package cpe.back.card.model;

import fr.cpe.card.model.CardDTO;
import fr.cpe.card.model.CardFamilyDTO;
import fr.cpe.card.model.CardTypeDTO;
import fr.cpe.user.model.UserDTO;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class CardEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "health_point")
    private int health_point;

    @Column(name = "price")
    private int price;

    @Column(name = "id_type")
    private long id_type;

    @Column(name = "id_family")
    private long id_family;

    @Column(name = "id_user")
    private long id_user;

    // @ManyToOne(fetch = FetchType.EAGER)
    // @JoinColumn(name = "id_type", nullable = false)
    // private CardTypeEntity type;

    // @ManyToOne(fetch = FetchType.EAGER)
    // @JoinColumn(name = "id_family", nullable = false)
    // private CardFamilyEntity family;

    // @ManyToOne(fetch = FetchType.EAGER)
    // @JoinColumn(name = "id_user")
    // private UserDTO user;

    public CardEntity() {  }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealthPoint() {
        return this.health_point;
    }

    public void setHealthPoint(int health_point) {
        this.health_point = health_point;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getIdFamily() {
        return this.id_family;
    }

    public void setIdFamily(long id_family) {
        this.id_family = id_family;
    }

    public long getIdType() {
        return this.id_type;
    }

    public void setIdType(long id_type) {
        this.id_type = id_type;
    }

    public long getIdUser() {
        return id_user;
    }

    public void setUser(long id_user) {
        this.id_user = id_user;
    }

    public CardDTO toDTO() {
        CardDTO cardDTO = new CardDTO();
        cardDTO.setId(this.id);
        cardDTO.setTitle(this.title);
        cardDTO.setDescription(this.description);
        cardDTO.setHealthPoint(this.health_point);
        cardDTO.setPrice(this.price);
        cardDTO.setIdType(this.id_type);
        cardDTO.setIdFamily(this.id_family);
        cardDTO.setIdUser(this.id_user);

        return cardDTO;
    }
}
