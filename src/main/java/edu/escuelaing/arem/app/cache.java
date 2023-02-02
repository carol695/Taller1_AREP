
package edu.escuelaing.arem.app;

import java.io.IOException;
import java.util.*;

public class cache {

    private static cache instance;
    private static HashMap<String, String> cache = new HashMap<>();

    /**
     * Constructor for Cache
     */
    private cache() {
    }

    public void saveQuery(String value, String title){
        cache.put(title, value);
    }


    public static cache getInstance() {
        if(instance == null){
            instance = new cache();
        }
        return instance;
    }

     /**
             * Metodo que devuelve si el cache contiene la key
     *
             * @param key la key a buscar
     * @return true si el cache contiene la key, false en caso contrario
     */
    public boolean contains(String key) {
        return cache.containsKey(key);
    }

    /**
     * Metodo que obtiene el valor asociado a una key
     *
     * @param key Key a buscar
     * @return Valor asociado a la key
     */
    public String get(String key) {
        return cache.get(key);
    }


}





