package SpringRestRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * COSA DA APPROFONDIRE:
 * se faccio le richieste HTTP (sia su POSTMAN che su HAL)
 * non mi dà l'ID!!!!
 * E se provo a fare PATCH mi crea in realtà un nuovo record
 */

@RepositoryRestResource(
        path = "repo-prog-languages",
        collectionResourceDescription = @Description("RestRepository for Programming Languages")
)
public interface ProgrammingLanguageRepository extends JpaRepository <ProgrammingLanguage, Long> {
}
