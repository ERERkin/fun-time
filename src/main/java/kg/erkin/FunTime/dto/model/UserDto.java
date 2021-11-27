package kg.erkin.FunTime.dto.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@SuperBuilder
public class UserDto extends AbstractDto{
    String login;

    String password;

    String email;

    List<ImageDto> avatar;

    RoleDto role;
}
