package ingresso.model;

public class IngressoNormal extends Ingresso {

    public IngressoNormal(String nomeEvento, String dataEvento, double valorBase) {
        super(nomeEvento, dataEvento, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase;  // Valor normal
    }

    @Override
    public void imprimirIngresso() {
        System.out.println("Ingresso Normal");
        System.out.println("Evento: " + nomeEvento);
        System.out.println("Data: " + dataEvento);
        System.out.println("Valor: R$ " + calcularValor());
    }
}