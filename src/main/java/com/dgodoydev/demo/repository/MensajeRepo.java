/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dgodoydev.demo.repository;

import com.dgodoydev.demo.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author durvingodoy
 */
public interface MensajeRepo extends JpaRepository<Mensaje, Integer>{
    
}
