public class Main {
    
    public static void main(String[] args) {

        Elevador elevador = new Elevador(6, 0, 0, 12);

        elevador.addpassageiro();
        elevador.addpassageiro();
        elevador.subir();
        elevador.removerpassageiro();
        elevador.removerpassageiro();
        elevador.descer();
        elevador.addpassageiro();
        elevador.addpassageiro();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.addpassageiro();
        elevador.addpassageiro();
        elevador.addpassageiro();
        elevador.removerpassageiro();
        elevador.removerpassageiro();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.removerpassageiro();
        elevador.subir();
        elevador.addpassageiro();
        elevador.addpassageiro();
        elevador.descer();
        elevador.removerpassageiro();
        elevador.subir();
        elevador.addpassageiro();
        elevador.addpassageiro();

        System.out.println("");
        System.out.println("== Informações do Elevador ===");
        System.out.println("Capacidade máxima: " + elevador.getCapacidade() + " passageiros");
        System.out.println("Quantidade de andares: " + elevador.getUltimoAndar());
        System.out.println("");
        System.out.println("|| Andar atual => " + elevador.getCapacidade() + "ª");
        System.out.println("|| Passageiros => " + elevador.getQtdPassageiros());

    }
}