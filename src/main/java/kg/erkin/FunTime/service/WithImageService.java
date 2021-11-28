package kg.erkin.FunTime.service;

import kg.erkin.FunTime.dto.entity.WithImage;
import kg.erkin.FunTime.dto.model.WithImageDto;
import kg.erkin.FunTime.service.base.BaseService;

public interface WithImageService extends BaseService<WithImageDto> {
    WithImageDto saveWithImage(WithImage withImage);
}
