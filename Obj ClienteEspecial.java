package enti;

public class Cliente_Especial extends ClienteComum {
    protected double limite;

    public Cliente_Especial(String nome, int id, double saldo, double limite) {
        super(nome, id, saldo);
        this.limite = limite;
    }

    @Override
    public double nalteraSaldo(double vlr) {
        if (vlr <= this.saldo + this.limite) {
            this.saldo -= vlr;
            return saldo;
        } else {
            System.out.println("Limite excedido.");
            return saldo; // ou retorne um valor específico, dependendo do comportamento desejado
        }
    }

    @Override
    public String toString() {
        return "Cliente_Especial{" +
                "nome='" + this.nome + '\'' +
                ", id=" + id +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
