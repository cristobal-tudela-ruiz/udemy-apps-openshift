package cl.backend.dao;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import cl.backend.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ProductoRepository extends ReactiveCrudRepository<Producto, Integer> {

    @Query("SELECT * FROM producto WHERE id LIKE :id")
    Mono<Producto> findById(int id);

    @Query("SELECT * FROM producto")
    Flux<Producto> getAll();

}
