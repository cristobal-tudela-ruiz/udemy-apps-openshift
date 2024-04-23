package cl.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.backend.dao.ProductoRepository;
import cl.backend.model.Producto;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CategoriaService {

    @Autowired
    ProductoRepository categoriaRepository;

    public Flux<Producto> getAllCategorias() {
        return categoriaRepository.findAll().log().delayElements(Duration.ofSeconds(1));
    }

    public Mono<Producto> findById(Integer id) {
        return categoriaRepository.findById(id);
    }

}
