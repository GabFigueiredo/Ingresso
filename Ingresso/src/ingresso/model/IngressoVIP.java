package ingresso.model;

public class IngressoVIP extends Ingresso {
    private double TAXA_VIP; 

    public IngressoVIP(String nomeEvento, String dataEvento, double valorBase, double taxa) {
        super(nomeEvento, dataEvento, valorBase);
        this.TAXA_VIP = taxa;
    }

    @Override
    public double calcularValor() {
        return valorBase + TAXA_VIP;  // Valor base + taxa
    }

    @Override
    public void imprimirIngresso() {
        System.out.println("Ingresso VIP");
        System.out.println("Evento: " + nomeEvento);
        System.out.println("Data: " + dataEvento);
        System.out.println("Valor: R$ " + calcularValor());
    }

    public double getTAXA_VIP() {
        return TAXA_VIP;
    }
    
}