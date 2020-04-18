package vaadin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="wrestlers")
@Data
@AllArgsConstructor
public class Wrestler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "wrestlingOrganisationType")
    @Enumerated(EnumType.STRING)
    private WrestlingOrganisationType wrestlingOrganisationType;
    @Column(name = "image")
    private String image;

    public Wrestler() {
    }

    public Wrestler(String name, WrestlingOrganisationType wrestlingOrganisationType, String image) {
        this.name = name;
        this.wrestlingOrganisationType = wrestlingOrganisationType;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WrestlingOrganisationType getWrestlingOrganisationType() {
        return wrestlingOrganisationType;
    }

    public void setWrestlingOrganisationType(WrestlingOrganisationType wrestlingOrganisationType) {
        this.wrestlingOrganisationType = wrestlingOrganisationType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

