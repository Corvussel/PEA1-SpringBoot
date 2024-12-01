/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Trabajador;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author russe
 */
@Controller
public class FormController {


    //Get
    @GetMapping(value = "/")
    public String getIndex() { 
        return "index";
    }

    @GetMapping(value = "/usuarioForm")
    public String getViewUser(Model modelo) {

        modelo.addAttribute("user", new User());
        return "loginUser";
    }

    @GetMapping(value = "/trabajadorForm")
    public String getViewTrabajador(Model modelo) {

        modelo.addAttribute("trabajador", new Trabajador());
        return "Trabajador";
    }


    //Post
    @PostMapping(value = "/success")
    public String getResultLoginView(@ModelAttribute User user, Model modelo) {

        modelo.addAttribute("user", user);
        return "Success";
    }

    @PostMapping(value = "/sueldoTrabajador")
    public String getSueldoTrabajadorView(@ModelAttribute Trabajador trabajador, Model modelo) {
 
        //
        trabajador.CalcularSueldo();
        modelo.addAttribute("trabajador", trabajador);
        return "sueldoTrabajador";
    }
}
