package uz.urinov.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "author")

/*@Table(
        name = "author",
        schema = "hr",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_email", columnNames = "email")  // email takrorlanmas (unique) qilish databaseda
        },
        indexes = {
                @Index(name = "idx_first_name", columnList = "first_name"), // first_name bo'yicha tez qidirib topish uchun
                @Index(name = "idx_last_name", columnList = "last_name")   // last_name bo'yicha tez qidirib topish uchun
        }
)
 */
public class Author {

    @Id
    @GeneratedValue    //
            /*(strategy = GenerationType.TABLE, generator = "author_sequence")
    @SequenceGenerator(name = "author_sequence", sequenceName = "author_sequence", allocationSize = 1)
    @TableGenerator(name = "author_id_gen", table = "id_generator",pkColumnName = "id_name", valueColumnName = "id_value",allocationSize = 1)
             */
/*    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
   @SequenceGenerator(name = "author_seq", sequenceName = "author_seq", allocationSize = 50) // eng yaxshi variant shu
 */
    
    private Integer id;

    @Column(name = "f-name", length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;
}
