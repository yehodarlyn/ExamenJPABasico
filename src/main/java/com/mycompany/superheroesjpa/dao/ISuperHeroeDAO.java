/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superheroesjpa.dao;

import com.mycompany.superheroesjpa.entity.SuperHeroe;
import java.util.List;

/**
 *
 * @author jonyco
 */
public interface ISuperHeroeDAO {
    
    void insertar(SuperHeroe e);
    
    void actualizar(SuperHeroe e);
    
    void eliminar(Long id);
    
    SuperHeroe buscar(Long id);
    
    List<SuperHeroe> listar();
}
