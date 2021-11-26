package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.Role;
import kg.erkin.FunTime.dto.entity.WithImage;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    Long id;

    String login;

    String password;

    String email;

    List<ImageDto> avatar;

    RoleDto role;
}
