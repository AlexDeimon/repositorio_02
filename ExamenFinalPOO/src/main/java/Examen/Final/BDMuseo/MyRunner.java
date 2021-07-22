/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Final.BDMuseo;

import Examen.Final.BDMuseo.repositorios.ExposicionRepositorio;
import Examen.Final.BDMuseo.repositorios.ObraRepositorio;
import Examen.Final.BDMuseo.repositorios.MuseoRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author DIEGO
 */
@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private ObraRepositorio obraRepositorio;
    
    @Autowired
    private MuseoRepositorio museoRepositorio;
    
    @Autowired
    private ExposicionRepositorio exposicionRepositorio;

    @Override
    public void run(String... args) throws Exception {     
        
    }
}
