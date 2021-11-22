package kg.erkin.FunTime.service.impl;

import kg.erkin.FunTime.dto.entity.BaseEntity;
import kg.erkin.FunTime.repository.BaseRepository;
import kg.erkin.FunTime.service.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseCrudServiceImpl implements BaseCrudService<BaseEntity> {
    @Autowired
    BaseRepository baseRepository;

    @Override
    public BaseEntity getById(Long id) {
        return baseRepository.getById(id);
    }

    @Override
    public BaseEntity save(BaseEntity item) {
        return baseRepository.save(item);
    }

    @Override
    public List<BaseEntity> getAll() {
        return baseRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        baseRepository.deleteById(id);
    }
}
