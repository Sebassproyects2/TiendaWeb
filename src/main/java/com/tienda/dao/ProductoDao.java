
package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductoDao extends JpaRepository<Producto, Long> {
//    Findby: Es el filtro, Precio: es el atributo por el cual se va a filtrar este puede ser cualquiera que este en la clase producto
//            ByDescription: Es la forma por como lo va a organizar, entre parentesis los valores que se van a ocupar
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
     //Ejemplo de método utilizando Consultas con JPQL
    @Query(value="SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
    
     //Ejemplo de método utilizando Consultas con SQL nativo
    @Query(nativeQuery=true,
            value="SELECT * FROM producto where producto.precio BETWEEN :precioInf AND :precioSup ORDER BY producto.descripcion ASC")
    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
    
    //Ejemplo para la tarea
    public List<Producto> findByDescripcionContainingOrderByPrecio(String descripcion);
    
    //TareaS9
    public List<Producto> findByDetalleStartingWithOrderByPrecio(String detalle);
}
