
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUTD= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_categoria")
    private Long idCategoria;
    private Long descripcion;
    private Long rutaImagen;
    private Long activo;

    public Categoria() {
    }

    public Categoria(Long descripcion, Long rutaImagen, Long activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
    
}
