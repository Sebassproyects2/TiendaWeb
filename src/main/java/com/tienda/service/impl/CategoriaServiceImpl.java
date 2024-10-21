
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategoria(boolean activos) {
        
        List<Categoria> lista = categoriaDao.findAll();
        
        if (activos) {
            //Remueve de la lista los elementos de atributo active que sean falsos
            lista.removeIf(e -> e.isActivo());
        }
        return lista;
    }
    
}
