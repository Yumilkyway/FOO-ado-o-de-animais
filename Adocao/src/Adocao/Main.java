package Adocao;

public class Main {
    úblic static void Main(String[] args) {
        CentroAdocao centro = new CentroAdocao();

        // criando os animais
        Gato gato1 = new Gato("Niko", 7, "Saudável", "Siamês", "Branco creme com manchas escuras nas extreminades (patas, orelhas e rabo)");
        Cachorro cachorro1 = new Cachorro("Lumi", 5, "Vacinado", "Pastor Alemão", "Pelagem preta no dorso com marcas douradas no restante do corpo");

        // cadastrar
        centro.cadastrarAnimal(gato1);
        centro.cadastrarAnimal(cachorro1);

        // criando uma pessoa
        Tutor tutor1 = new Tutor("Maria Olivia", "123.456.789-00", "(43) 98765-4321");

        // adotar
        boolean adocaoRealizada = centro.realizarAdocao(tutor1, gato1);

        if(adocaoRealizada) {
            System.out.println("Adoção realizada com sucesso.");
            System.out.println("Animais adotados por " + tutor1.getNome() + ": ");
            for (Animal animal : tutor1.getAnimaisAdotados()) {
                System.out.println("- " + animal.getNome());
            }
        } else {
            System.out.println("Adoção não realizada.");
        }

        System.out.println(\nAnimais disponíveis: );
        for (Animal animal : centro.listarAnimais()) {
            System.out.println("- " + animal.getNome())
        }
    }
}