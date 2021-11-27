package kg.erkin.FunTime.dto.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@SuperBuilder
public class RateDto extends AbstractDto {
    Long minute;

    BigDecimal amount;

    RoomTypeDto roomType;
}
