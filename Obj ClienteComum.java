package enti;

public class ClienteComum {
    protected String nome;
    protected int id;
    protected double saldo;

    public ClienteComum(String nome, int id, double saldo) {
        this.nome = nome;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alteraSaldo(double deposito) {
        this.saldo += deposito;
    }

    public double nalteraSaldo(double saque) {
        saldo = saldo - saque;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ClienteComum{" +
                "nome='" + this.nome + '\'' +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
