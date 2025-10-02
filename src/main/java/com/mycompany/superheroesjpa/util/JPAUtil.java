/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superheroesjpa.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author jonyco
 */
public class JPAUtil {
    private static final String PERSISTENCE_UNIT   = "SuperHeroesPU";
    private static EntityManagerFactory emf;
    
    private JPAUtil(){}
    
    public static EntityManager getEntityManager   (){
        if(emf==null){
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        return emf.createEntityManager();
    }
}
