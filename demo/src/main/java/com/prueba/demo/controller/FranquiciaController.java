package com.prueba.demo.controller;

import com.prueba.demo.Franquicia;
import com.prueba.demo.Producto;
import com.prueba.demo.Sucursal;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/franquicias")
public class FranquiciaController {

    // Simulación de base de datos en memoria
    private List<Franquicia> franquicias = new ArrayList<>();

    // Endpoint para agregar una franquicia
    @PostMapping
    public Franquicia agregarFranquicia(@RequestBody Franquicia franquicia) {
        franquicias.add(franquicia);
        return franquicia;
    }

    // Endpoint opcional para ver todas
    @GetMapping
    public List<Franquicia> listarFranquicias() {
        return franquicias;
    }

    @PostMapping("/{nombre}/sucursales")
    public Franquicia agregarSucursal(
            @PathVariable String nombre,
            @RequestBody Sucursal nuevaSucursal) {

        for (Franquicia f : franquicias) {
            if (f.getNombre().equalsIgnoreCase(nombre)) {

                // Si la lista es null, inicializarla
                if (f.getSucursales() == null) {
                    f.setSucursales(new ArrayList<>());
                }

                f.getSucursales().add(nuevaSucursal);
                return f;
            }
        }

        throw new RuntimeException("Franquicia no encontrada");
    }

    @PostMapping("/{nombreFranquicia}/sucursales/{nombreSucursal}/productos")
    public Franquicia agregarProducto(
            @PathVariable String nombreFranquicia,
            @PathVariable String nombreSucursal,
            @RequestBody Producto nuevoProducto) {

        for (Franquicia f : franquicias) {
            if (f.getNombre().equalsIgnoreCase(nombreFranquicia)) {

                for (Sucursal s : f.getSucursales()) {
                    if (s.getNombre().equalsIgnoreCase(nombreSucursal)) {

                        // Inicializar lista si es null
                        if (s.getProductos() == null) {
                            s.setProductos(new ArrayList<>());
                        }

                        s.getProductos().add(nuevoProducto);
                        return f;
                    }
                }

                throw new RuntimeException("Sucursal no encontrada");
            }
        }

        throw new RuntimeException("Franquicia no encontrada");
    }
}