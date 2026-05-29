package model.entity;

public class Atendimento {

    private int id;
    private Pet pet;
    private String servico;
    private double valor;
    private StatusAtendimento status;

    public Atendimento(int id, Pet pet, String servico, double valor){

        this.id = id;
        this.pet = pet;
        this.servico = servico;
        this.valor = valor;
        this.status = StatusAtendimento.Agendado;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusAtendimento getStatus() {
        return status;
    }

    public void setStatus(StatusAtendimento status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return String.format(
                "Atendimento{id=%d, pet='%s', cliente='%s', servico='%s', valor=R$%.2f, status=%s}",
                id, pet.getNome(), pet.getCliente().getNome(), servico, valor, status
        );
    }

}