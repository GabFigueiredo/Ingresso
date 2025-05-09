/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresso.controller;

/**
 *
 * @author gabri
 */
import ingresso.model.Ingresso;
import ingresso.model.IngressoMeia;
import ingresso.model.IngressoNormal;
import ingresso.model.IngressoVIP;
import java.util.ArrayList;
import java.util.List;

public class IngressoController {
    private List<Ingresso> ingressos;

    public IngressoController() {
        this.ingressos = new ArrayList<>();
    }

    public void cadastrarIngresso(String tipo, String nomeEvento, String dataEvento, double valorBase) {
        Ingresso ingresso;

        switch (tipo.toLowerCase()) {
            case "meia" -> ingresso = new IngressoMeia(nomeEvento, dataEvento, valorBase);
            case "normal" -> ingresso = new IngressoNormal(nomeEvento, dataEvento, valorBase);
            default -> {
                System.out.println("Tipo de ingresso inválido.");
                return;
            }
        }

        ingressos.add(ingresso);
        System.out.println("Ingresso cadastrado com sucesso.");
    }
    
    public void cadastrarIngressoVIP(String tipo, String nomeEvento, String dataEvento, double valorBase, double taxaVIP) {
        Ingresso ingresso;

        ingresso = new IngressoVIP(nomeEvento, dataEvento, valorBase, taxaVIP);

        ingressos.add(ingresso);
        System.out.println("Ingresso cadastrado com sucesso.");
    }

    public List<Ingresso> listarIngressos() {
        return this.ingressos;
    }
    
    public Ingresso buscarIngressoPorId(int id) {
    for (Ingresso ingresso : ingressos) {
        if (ingresso.getId() == id) {
            return ingresso;
        }
    }
    return null; // Retorna null caso o ingresso não seja encontrado
}
}

