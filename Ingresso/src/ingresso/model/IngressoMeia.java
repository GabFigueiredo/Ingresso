package ingresso.model;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(String nomeEvento, String dataEvento, double valorBase) {
        super(nomeEvento, dataEvento, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase / 2;  // Meio do valor base
    }

    @Override
    public void imprimirIngresso() {
        System.out.println("Ingresso Meia-Entrada");
        System.out.println("Evento: " + nomeEvento);
        System.out.println("Data: " + dataEvento);
        System.out.println("Valor: R$ " + calcularValor());
    }
}