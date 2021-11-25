package kg.erkin.FunTime.dto.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class RoleDto {
    Long id;

    String name;
}
