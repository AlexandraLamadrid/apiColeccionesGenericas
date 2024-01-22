package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); //En el tipo lista se pueden duplicar los elementos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
        
        //imprimir(miLista);

        Set<String> miSet = new HashSet<>();//En el tipo Set NO SE pueden duplicar los elementos
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");//No se duplican las llaves porque es un set y este no permite valores duplicados.
        
        String elementoMapa = miMapa.get("valor3");
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
    }
}
