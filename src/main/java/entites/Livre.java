package entites;

import jakarta.persistence.*;

@Entity
@Table(name = "LIVRE")

public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String auteur;



    /**
     * Getter
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     * @return titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter
     * @param titre titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Getter
     * @return auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Setter
     * @param auteur auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Livre{");
        sb.append("id=").append(id);
        sb.append(", titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
