package SpringRestRepo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class ProgrammingLanguage {

    /**
     * COSA DA APPROFONDIRE:
     * se faccio le richieste HTTP su POSTMAN, non mi dà l'ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    String name;

    LocalDate yearOfFirstAppearance;

    @Column(nullable = false)
    String inventor;

    public ProgrammingLanguage(){}

    public ProgrammingLanguage(String name, LocalDate yearOfFirstAppearance, String inventor) {
        this.name = name;
        this.yearOfFirstAppearance = yearOfFirstAppearance;
        this.inventor = inventor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYearOfFirstAppearance() {
        return yearOfFirstAppearance;
    }

    public void setYearOfFirstAppearance(LocalDate yearOfFirstAppearance) {
        this.yearOfFirstAppearance = yearOfFirstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
