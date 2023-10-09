package dependency_injection_java;

public class Pedido {
    private int id;
    private String descricao;


    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Pedido [id= " + id + ", descricao= " + descricao + "]";
    }

}