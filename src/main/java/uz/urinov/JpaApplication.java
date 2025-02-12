package uz.urinov;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.urinov.models.Author;
import uz.urinov.repositories.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	//	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository) {
		return args -> {
			var author = Author.builder()
					.firstName("Ali")
					.lastName("Aliyev")
					.age(31)
					.email("ali@doe.com")
//					.createdAt(LocalDateTime.now())
					.build();
			repository.save(author);
		};
	}

}
