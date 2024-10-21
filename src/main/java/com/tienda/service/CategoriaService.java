
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategoria (boolean activos);
    
}
