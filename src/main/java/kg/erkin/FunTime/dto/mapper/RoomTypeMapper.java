package kg.erkin.FunTime.dto.mapper;

import kg.erkin.FunTime.dto.entity.RoomType;
import kg.erkin.FunTime.dto.model.RoomTypeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class RoomTypeMapper implements BaseMapper<RoomType, RoomTypeDto>{
    @Override
    public RoomType dtoToEntity(RoomTypeDto dto) {
        return null;
    }

    @Override
    public RoomTypeDto entityToDto(RoomType entity) {
        return null;
    }
}
