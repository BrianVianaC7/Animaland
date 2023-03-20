package animaland;
import java.applet.AudioClip;
import javax.swing.JOptionPane;

/**
 * @author Equipo 2´POO
 */
 //Atributos de cada animal.
public class Animal {
   private String info;
   private AudioClip sound;   
   private String nombre;
   
//getters 
    public String getInfo(int id) {
        switch(id){
            case 1: info=infoLince();
            break;
            case 2: info = infoTigre();
            break;
            case 3: info = infoAguila();
            break;
            case 4: info = infoLeon();
            break;
            case 5: info = infoGrillo();
            break;
            case 6: info = infoGallo();
            break;
            case 7: info = infoDelfin();
            break;
            case 8: info = infoCaballo();
            break;
            case 9: info = infoPerro();
            break;
            case 10: info = infoCerdo();
            break;
        }
        return info;
    }

    public void getSound(int sd) {
        switch(sd){
            case 1: sonidoLince();
            break;
            case 2: sonidoTigre();
            break;
            case 3: sonidoAguila();
            break;
            case 4: sonidoLeon();
            break;
            case 5: sonidoGrillo();
            break;
            case 6: sonidoGallo();
            break;
            case 7: sonidoDelfin();
            break;
            case 8: sonidoCaballo();
            break;
            case 9: sonidoPerro();
            break;
            case 10: sonidoCerdo();
            break;
        }
    }

    public String getNombre(int nb) {
         switch(nb){
            case 1: nombre = "Lince";
            break;
            case 2: nombre = "Tigre";
            break;
            case 3: nombre = "Aguila";
            break;
            case 4: nombre = "León";
            break;
            case 5: nombre = "Grillo";
            break;
            case 6: nombre = "Gallo";
            break;
            case 7: nombre = "Delfin";
            break;
            case 8: nombre = "Caballo";
            break;
            case 9: nombre = "Perro";
            break;
            case 10: nombre = "Cerdo";
            break;
        }
         return nombre;
    }
    
    
   //Metodos para la ventana de animales.
   public String infoLince(){
       String info="Lince.\n\n\nEs un felino de tamaño mucho mayor que un gato "
               + "doméstico.\n Suelen ser muy solitarios, viven apartados, sin "
               + "embargo, \ncuando van a cazar o se desplazan, lo hacen en "
               + "grupos. \nSon ágiles escaladores y la mayoría del tiempo en "
               + "las ramas de los árboles, aguardando por alguna presa,"
               + "\nademás, tiene una excelente visión nocturna";
        return info;
   }
   public void sonidoLince(){
       AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/AudioLince.wav"));
        sound.play();
   }
   
   public String infoTigre(){
      String info="Tigre\n\nEl tigre es un mamífero, del orden de los carnívoros "
              + "y que pertenece a la familia de los félinos. Es el más grande "
              + "de los felinos, midiendo entre un metro y medio y tres metros y "
              + "pesa entre 100 y 360 kilos. Vive entre 15 y 20 años y es una "
              + "especie en grave peligro de extinción.";
        return info;
   }
   public void sonidoTigre(){
        AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/AudioTigre.wav"));
        sound.play();
   }
   public String infoAguila(){
       String info="Águilas.\n\n\nEl aguila pertenece a la familia de las aves "
               + "rapaces. Se les llama así porque son aves que utilizan sus "
               + "fuertes garras y picos para cazar y alimentarse. Son muy "
               + "veloces y son carnívoras. Además, su maravillosa visión es su "
               + "sentido más desarrollado. Pueden apresar a sus presas desde "
               + "grandes distancias. Muchas águilas se alimentan principalmente"
               + " de peces (como el salmón y la trucha) También se alimentan de"
               + " reptiles, pequeños mamíferos como conejos, perezosos, z"
               + "arigueyas, zorros, etc. y pequeñas aves como lechuzas.";
        return info;
   }
   public void sonidoAguila(){
         AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/SonidoAguila.wav"));
        sound.play();
   }
   public String infoLeon(){
           String info="León.\n\n\nEl leon es un animal salvaje que habita "
                   + "principalmente en África y Asia. Suelen encontrarse en "
                   + "zonas boscosas, en sabanas y zonas semidesérticas. Son "
                   + "mamíferos y carnívoros. Le llaman el Rey de la Selva "
                   + "(aunque no habita en la selva precisamente). Es el felino "
                   + "más grande, después del tigre, pesa entre 200 y 300 kg, "
                   + "mide entre 2 metros y 2 metros y medio y su gran rugido "
                   + "puede escucharse a varios kilómetros de distancia. Los "
                   + "machos se distinguen por su gran melena de color castaño, "
                   + "las hembras no tienen melena. Viven en manadas que pueden "
                   + "llegar hasta los 30 miembros";
           return info;
   }
   public void sonidoLeon(){
       AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/AudioLeon.wav"));
        sound.play();  
   }
   public String infoGrillo(){
       String info="Grillo\n\nLos grillos son insectos que se encuentran en el "
               + "suelo, escondidos bajo plantas muertas, o en plantas vivas. "
               + "Como todos los insectos, los grillos tienen un cuerpo de tres "
               + "partes, dos antenas y tres pares de patas articuladas. Los "
               + "grillos también tienen alas.";
        return info;
   }
   public void sonidoGrillo(){
        AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/AudioGrillo.wav"));
        sound.play();
   }
   public String infoGallo(){
       String info="Gallo\n\nEl gallo es el macho de la gallina y se diferencia "
               + "de ésta por el plumaje más vivamente coloreado, por una cresta"
               + " más desarrollada, por la presencia de espolones en las patas "
               + "y por el canto potente y característico de este ave.\nComo "
               + "aves que son, estos animales de granja tienen el cuerpo "
               + "recubierto de plumas que les protegen del frío y del calor, de"
               + " la humedad de los rayos del sol y de los arañazos.";
        return info;
   }
   public void sonidoGallo(){
      AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Gallo.wav"));
        sound.play();
   }
   public String infoDelfin(){
       String info="Delfín Los delfines son unos de los animales más "
               + "inteligentes del mundo, se comunican usando una variedad de "
               + "sonidos parecidos a clics, silbidos y otras vocalizaciones. "
               + "Los Delfines respiran aire fresco, al igual que todos los "
               + "mamíferos marinos. Esto lo hacen a través de un "
               + "orificio ubicado en la parte superior de sus espaldas.Existen "
               + "40 especies de delfines conocidas. La mayoría de las especies "
               + "de delfines viven en el océano, mientras que los delfines de "
               + "agua dulce viven en los ríos más grandes del mundo.\n";
        return info;
   }
   public void sonidoDelfin(){
         AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Delfin.wav"));
        sound.play();
   }
   public String infoCaballo(){
       String info="Caballo\nUn caballo es un animal mamífero que forma parte de"
               + " la familia de los équidos. Los caballos se caracterizan por "
               + "sus largas extremidades y por su cola formada por una gran "
               + "cantidad de cerdas extensas. Las razas más grandes pueden "
               + "presentar ejemplares con una altura de 1,80 metros y un peso "
               + "cercano a la tonelada.";
        return info;
   }
   public void sonidoCaballo(){
       AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Caballo.wav"));
        sound.play();
   }
   public String infoPerro(){
       String info="Perro\n El perro pertenece a la especie de los cánidos. Su "
               + "tamaño, forma y pelaje varían en función de la raza de perro. "
               + "... Sus funciones son muy diversas según las cualidades, "
               + "tamaño y carácter de cada perro. Es un animal inteligente y "
               + "leal a su amo, de ahí su fama de ser el mejor amigo del hombre."
               + "";
        return info;
   }
   public void sonidoPerro(){
        AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Perro.wav"));
        sound.play(); 
   }
   public String infoCerdo(){
       String info="Cerdo\n\nEl cerdo es un animal vertebrado que posee una "
               + "cabeza grande con un hocico alargado, utiliza su hocico para "
               + "localizar y escarbar alimentos, ya que es muy agudo, tiene dos"
               + " pezuñas cuyo peso es repartido uniformemente en ambos dedos, "
               + "tiene ojos pequeños y una cola pequeña que puede tener varias "
               + "formas: rizada, retorcida o recta.\nPoseen 44 dientes. Los "
               + "traseros están adaptados para aplastar los alimentos. Algunas "
               + "especies de cerdos todavía tienen colmillos procedentes del "
               + "jabalí que son usados para consumir raíces del suelo y a "
               + "veces, para cazar otros animales. Pero la mayoría de cerdos, "
               + "ya no los tienen.";
        return info;
   }
   public void sonidoCerdo(){
         AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/AudioCerdo.wav"));
        sound.play();
   }
}
