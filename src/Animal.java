import java.util.ArrayList;
import java.util.List;

public class Animal {
    // Atributos
    private int idAnimal;
    private String nomeAnimal;
    private String especie;
    private String coloracao;
    public static List<Integer> listaIDs = new ArrayList<>();

    // Construtores
    public Animal() {
    }

    public Animal(int idAnimal, String nomeAnimal, String especie, String coloracao) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.coloracao = coloracao;
        listaIDs.add(idAnimal);
    }

    // Getters e setters
    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColoracao() {
        return coloracao;
    }

    public void setColoracao(String coloracao) {
        this.coloracao = coloracao;
    }
}
