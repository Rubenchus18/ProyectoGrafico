package Modelo;

import java.util.HashMap;

public class Mesa {
    private String nombreMesa;
    private HashMap<String, Integer> comanda;

    public Mesa(String nombreMesa) {
        this.nombreMesa = nombreMesa;
        this.comanda = new HashMap<>();
    }

    public String getMesas() {
        return nombreMesa; 
    }

    public HashMap<String, Integer> getComanda() {
        return comanda; 
    }

    public void agregarProducto(String producto, int cantidad) {
        comanda.put(producto, comanda.getOrDefault(producto, 0) + cantidad);
    }
    public void eliminarProducto(String producto, int cantidad) {
        comanda.put(producto, comanda.getOrDefault(producto, 0) - cantidad);
    }
}


