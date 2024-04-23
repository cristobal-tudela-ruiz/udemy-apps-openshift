package cl.backend.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import cl.backend.handler.ProductoHandler;

import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
@EnableWebFlux
public class CategoriaRouter {

    @Bean
    public RouterFunction<ServerResponse> categoriaRouterFunc(ProductoHandler productoHandler) {
        return RouterFunctions
                .route(GET("/api/v1/producto/todos/").and(accept(MediaType.TEXT_EVENT_STREAM)), productoHandler::obtenerProductos)
                .andRoute(GET("/api/v1/producto/" + "{id}").and(accept(MediaType.APPLICATION_JSON)), productoHandler::obtenerProductoPorId);
    }

    @Bean
    CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(false);
        config.addAllowedOrigin("http://localhost");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }

}
