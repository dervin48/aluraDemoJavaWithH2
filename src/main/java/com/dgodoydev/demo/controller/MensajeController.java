/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgodoydev.demo.controller;

import com.dgodoydev.demo.model.Mensaje;
import com.dgodoydev.demo.service.MensajeServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author durvingodoy
 */
@RestController
public class MensajeController {
    @Autowired
    private MensajeServicio rest;
    
    @PostMapping
    public Mensaje save(@RequestBody Mensaje entity){
        return rest.save(entity);
    }
    
    @GetMapping
    public List<Mensaje> findall(){
        return rest.findAll();
    }
}
