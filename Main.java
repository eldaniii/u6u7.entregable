package u6.u7.entregable;
import u6.u7.entregable.Artista;
import u6.u7.entregable.Festival;
import u6.u7.entregable.Manager;
import u6.u7.entregable.Musico;

public class Main {
    public static void main(String[] args) {
        Manager manager1 =  new Manager("GERENTE DE LA BANDA DEL MOCO", 644918220);
        Musico musico1 = new Musico("PACO", 19);
        Musico musico2 = new Musico("PEPE", 39);
        Musico musico3 = new Musico("RAÚL", 22);
        Artista artista1 = new Artista("BANDA DEL MOCO", Artista.estilos_musicales.POP, 4500, manager1);
        Artista artista2 = new Artista("BANDA LA BANDILLA", Artista.estilos_musicales.POP, 4500, manager1);
        Artista artista3 = new Artista("BANDA INVENTADA3", Artista.estilos_musicales.INDIE, 4500, manager1);
        Festival festival = new Festival("EL FESTIVAL", 41950);

        System.out.println(artista1.getNombre());
        System.out.println(artista1.getManager_asociado());
        artista1.imprimeMusicos();
        artista1.addMusico(musico3);
        artista1.addMusico(musico2);
        artista1.addMusico(musico1);
        artista1.imprimeMusicos();

      
        festival.inscribeArtista(Artista.estilos_musicales.POP, artista1);
        festival.inscribeArtista(Artista.estilos_musicales.POP, artista2);
        festival.inscribeArtista(Artista.estilos_musicales.INDIE, artista3);
        festival.cuantosInscritos();
        festival.artistasInscritos();
    }
}
