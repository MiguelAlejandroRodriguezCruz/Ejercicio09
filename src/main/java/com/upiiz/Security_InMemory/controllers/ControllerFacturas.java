package com.upiiz.Security_InMemory.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class ControllerFacturas {
    @GetMapping("/listar")
    public String listar() {
        return "Listado - sin seguridad";
    }

    @GetMapping("/actualizar")
    public String actualizar() {
        return "Actualizado - con seguridad";
    }

    @GetMapping("/eliminar")
    public String eliminar() {
        return "eliminar - con seguridad";
    }

    @GetMapping("/crear")
    public String crear() {
        return "crear - con seguridad";
    }
}
