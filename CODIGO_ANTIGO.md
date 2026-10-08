# Código antigo (antes do Proxy)
## HighResolutionImage.java
```java
public class HighResolutionImage {

    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
```

## Main.java
```java
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HighResolutionImage> gallery = new ArrayList<>();

        gallery.add(new HighResolutionImage("forest.jpg"));
        gallery.add(new HighResolutionImage("beach.jpg"));
        gallery.add(new HighResolutionImage("mountain.jpg"));

        System.out.println("Gallery created");

        gallery.get(0).display();
        gallery.get(0).display();
    }
}
```

## Problema
- O construtor de `HighResolutionImage` chama `loadFromDisk()`, então toda imagem é carregada no momento em que o objeto é criado.
- As três imagens são carregadas antes de "Gallery created", embora apenas a primeira seja exibida.
- Com centenas de imagens, a abertura da galeria fica lenta e carrega recursos que nunca serão usados.
- Espalhar verificações de carregamento pelo cliente obrigaria cada ponto de exibição a conhecer os detalhes de criação das imagens.
