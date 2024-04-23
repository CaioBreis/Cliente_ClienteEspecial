package enti;

public class Cliente extends ClienteEspecial {
    protected double limite;

    public gerente(String nome, int id, double saldo, double limite) {
        super(nome, id, saldo);
        this.limite = limite;

    }

    public double nalteraSalario(double vlr) {
        if (vlr <= this.saldo + this.limite) {
            this.saldo -= vlr;
            return saldo;
        } else {
            System.out.println("nao tem o limite");
            return limite+saldo-vlr;
        }

    }

    @Override
    public String toString() {
        return "gerente{" + "Nome=" + this.nome + " ,id=" + this.id + " ,saldo=" + this.saldo + " ,limite=" + this.limite + "}";
    }
}
