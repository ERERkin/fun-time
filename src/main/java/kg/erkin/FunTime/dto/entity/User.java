package kg.erkin.FunTime.dto.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
//@Builder
@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractEntity {
    @Column
    String login;

    @Column
    String password;

    @Column
    String email;

    @OneToOne
    @JoinColumn(name = "avatar_id")
    WithImage avatar;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;
}
