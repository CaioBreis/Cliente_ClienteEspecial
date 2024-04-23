package enti;

public class Cliente {
    protected String nome;
    protected  int id;
    protected  double saldo;

    public funcionario(String nome, int id, double saldo) {
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

    public double getSalario() {
        return saldo;
    }

    public void setSalario(double salario) {
        this.saldo = salario;
    }
    public void alteraSalario(double deposito) {
         this.saldo += deposito;

    }
    public double nalteraSalario(double saque) {
       saldo= saldo - saque;
        return this.saldo;

    }


    @Override
    public String toString() {
        return "funcionario{" +
                "nome='" + this.nome + '\'' +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
