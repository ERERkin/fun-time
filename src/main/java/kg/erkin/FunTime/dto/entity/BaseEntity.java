package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    @PrePersist
    public void persistCreate() {
        this.dateCreated = LocalDateTime.now();
    }

    @PreUpdate
    public void persistUpdate() {
        this.dateUpdated = LocalDateTime.now();
    }

    public BaseEntity id(Long id){
        this.setId(id);
        return this;
    }
}