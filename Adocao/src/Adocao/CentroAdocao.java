package Adocao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CentroAdocao {
    private List<Animal> animais;
    private List<Tutor> tutores;

    public CentroAdocao() {
        this.animais = new ArrayList<>();
        this.tutores = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void cadastrarTutor(Tutor tutor) {
        tutores.add(Tutor)
    }

    public boolean realizarAdocao(Tutor tutor, Animal animal) {
        if (animais.contains(animal) && !animal.getAdotado()) {
            tutor.adotar(animal);
            return true;
        }
        return false;
    }

    public List<Animal> listarAnimais() {
        return animais.stream()
            .filter(animal -> !animal.getAdotado())
            .collect(Collectors.toList())
    }
}