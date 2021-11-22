package kg.erkin.FunTime.service;

import java.util.List;

public interface BaseCrudService<T> {
    T getById(Long id);

    T save(T item);

    List<T> getAll();

    void deleteById(Long id);
}
