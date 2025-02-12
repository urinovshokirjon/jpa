package uz.urinov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.urinov.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {


}
