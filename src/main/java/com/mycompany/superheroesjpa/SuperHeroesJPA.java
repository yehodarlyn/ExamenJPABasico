/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superheroesjpa;

import com.mycompany.superheroesjpa.dao.ISuperHeroeDAO;
import com.mycompany.superheroesjpa.dao.SuperHeroeDAO;
import com.mycompany.superheroesjpa.entity.IdentidadSecreta;
import com.mycompany.superheroesjpa.entity.SuperHeroe;
import com.mycompany.superheroesjpa.entity.Universo;

/**
 *
 * @author jonyco
 */
public class SuperHeroesJPA {

    public static void main(String[] args) {
        ISuperHeroeDAO dao = new SuperHeroeDAO();
        
        SuperHeroe spiderman = new SuperHeroe(
                "Spider-Man",
                Universo.MARVEL,
                new IdentidadSecreta("Peter Parker", "New York", "Fotografo"),
                "Con gran poder viene gran responsabilidad"
        );
        
        SuperHeroe batman = new SuperHeroe(
                "Batman",
                Universo.DC,
                new IdentidadSecreta("Bruce Wayne", "Gotham", "Empresario"),
                "Soy la venganza"
                      
        );
        
        SuperHeroe goku = new SuperHeroe(
                "Goku",
                Universo.INDEPENDIENTE,
                new IdentidadSecreta("Kakarotto", "Planeta Tierra", "Guerrero"),
                "¡Kamehameha!"
        );
        
        dao.insertar(spiderman);
        dao.insertar(batman);
        dao.insertar(goku);
        
        // Listar todos los superheroes
        System.out.println("Lista incial de superheroes:");
        dao.listar().forEach(h ->
                System.out.println(h.getId() + " - " + h.getNombre() + " (" + h.getUniverso() + ") ")
        );
        
        //modificar un superheroe
        SuperHeroe batmanBD = dao.buscar(batman.getId());
        batmanBD.getIdentidadSecreta().setCiudad("Ciudad Gotica");
        dao.actualizar(batmanBD);
        
        System.out.println("Lista despues de modificar a Batman:");
        dao.listar().forEach(h -> 
                System.out.println(h.getId() + " - " + h.getNombre() + " [" + h.getIdentidadSecreta().getCiudad() + "] ")
        );
        
        // ELiminar un superheroe
        dao.eliminar(spiderman.getId());
        
        System.out.println("Lista despues de eliminar a Spider-Man:");
        dao.listar().forEach(h ->
                System.out.println(h.getId() + " - " + h.getNombre())
        );
    }
}
