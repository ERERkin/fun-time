package kg.erkin.FunTime.repository;

import kg.erkin.FunTime.dto.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
