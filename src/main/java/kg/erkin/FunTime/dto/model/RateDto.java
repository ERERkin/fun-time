package kg.erkin.FunTime.dto.model;

import kg.erkin.FunTime.dto.entity.RoomType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RateDto {
    Long id;

    Long minute;

    BigDecimal amount;

    RoomTypeDto roomType;
}
