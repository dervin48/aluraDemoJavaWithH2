/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgodoydev.demo.service;

import com.dgodoydev.demo.model.Mensaje;
import com.dgodoydev.demo.repository.MensajeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author durvingodoy
 */
@Service
public class MensajeServicio {
    
    @Autowired
    private MensajeRepo crud;
    
    //servicios REST
    
    //CREATE
    
    public Mensaje save(Mensaje entity){
        return crud.save(entity);
    }
    
    public List<Mensaje> findAll(){
        return crud.findAll();
    }
}
