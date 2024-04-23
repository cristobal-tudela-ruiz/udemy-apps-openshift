package cl.backend.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;

public class Producto implements Serializable {

    @Id
    private Integer id;
    private String titulo;
    private String resumen;
    private String detalle;
    private Integer id_categoria;
    private Integer id_sub_categoria;
    private String marca;
    private String nombre_foto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Integer getId_sub_categoria() {
        return id_sub_categoria;
    }

    public void setId_sub_categoria(Integer id_sub_categoria) {
        this.id_sub_categoria = id_sub_categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre_foto() {
        return nombre_foto;
    }

    public void setNombre_foto(String nombre_foto) {
        this.nombre_foto = nombre_foto;
    }

}
