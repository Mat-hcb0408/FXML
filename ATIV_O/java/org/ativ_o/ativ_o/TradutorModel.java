package org.ativ_o.ativ_o;

import java.util.HashMap;

public class TradutorModel {
    private HashMap<String, String> traducaoInglesPortugues;

    public TradutorModel() {
        traducaoInglesPortugues = new HashMap<String, String>();

        // Adicionando palavras e suas traduções
        traducaoInglesPortugues.put("Hello", "Olá");
        traducaoInglesPortugues.put("Goodbye", "Adeus");
        traducaoInglesPortugues.put("Please", "Por favor");
        traducaoInglesPortugues.put("Thank you", "Obrigado");
        traducaoInglesPortugues.put("Yes", "Sim");
        traducaoInglesPortugues.put("No", "Não");
        traducaoInglesPortugues.put("Dog", "Cachorro");
        traducaoInglesPortugues.put("Cat", "Gato");
        traducaoInglesPortugues.put("House", "Casa");
        traducaoInglesPortugues.put("Car", "Carro");
    }

    // Método para obter a tradução
    public String traduzir(String palavraIngles) {
        return traducaoInglesPortugues.getOrDefault(palavraIngles, "Tradução não encontrada");
    }
}

