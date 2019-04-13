package com.tradisys.odyssey.apg.s2w.store;

import java.util.List;
import java.util.Optional;

public interface BaseStore<T> {
    int insert(T t);
    void update(int id, T t);
    void deleteById(int id);
    Optional<T> findById(int id);
    List<EntityWithId<T>> findAll();
}
