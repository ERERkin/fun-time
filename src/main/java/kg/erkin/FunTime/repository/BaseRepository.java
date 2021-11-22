package kg.erkin.FunTime.repository;

import kg.erkin.FunTime.dto.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository extends JpaRepository<BaseEntity, Long> {
}
