/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Final.BDMuseo.repositorios;

import Examen.Final.BDMuseo.modelos.Exposicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DIEGO
 */
@Repository
public interface ExposicionRepositorio extends JpaRepository<Exposicion, Long>{
    
}
