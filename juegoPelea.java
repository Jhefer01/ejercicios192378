// Clase abstracta para los personajes base
abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int poder;
    protected String habilidadEspecial;

    public Personaje(String nombre, int poder, String habilidadEspecial) {
        this.nombre = nombre;
        this.vida = 100; // Todos los personajes comienzan con 100 de vida
        this.poder = poder;
        this.habilidadEspecial = habilidadEspecial;
    }

    public abstract int usarHabilidadEspecial();
    
    public int atacarNormal() {
        return this.poder;
    }

    public void recibirDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }
}

// Personajes específicos
class Guerrero extends Personaje {
    public Guerrero() {
        super("Guerrero", 15, "Golpe Devastador");
    }

    @Override
    public int usarHabilidadEspecial() {
        return this.poder * 2; // Doble daño
    }
}

class Mago extends Personaje {
    public Mago() {
        super("Mago", 12, "Bola de Fuego");
    }

    @Override
    public int usarHabilidadEspecial() {
        return this.poder * 2 + 5; // Daño mágico adicional
    }
}

class Ninja extends Personaje {
    public Ninja() {
        super("Ninja", 13, "Ataque Sorpresa");
    }

    @Override
    public int usarHabilidadEspecial() {
        return (int)(this.poder * 1.8); // Daño moderado pero consistente
    }
}

// Clase principal del juego
class JuegoPeleas {
    private Personaje jugador1;
    private Personaje jugador2;
    private java.util.Scanner scanner;

    public JuegoPeleas() {
        scanner = new java.util.Scanner(System.in);
    }

    public void iniciarJuego() {
        seleccionarPersonajes();
        combate();
        anunciarGanador();
    }

    private void seleccionarPersonajes() {
        System.out.println("=== SELECCIÓN DE PERSONAJES ===");
        System.out.println("Jugador 1, elige tu personaje:");
        jugador1 = seleccionarPersonaje(1);
        System.out.println("\nJugador 2, elige tu personaje:");
        jugador2 = seleccionarPersonaje(2);
    }

    private Personaje seleccionarPersonaje(int numJugador) {
        System.out.println("1. Guerrero (Poder alto, Habilidad: Golpe Devastador)");
        System.out.println("2. Mago (Poder medio, Habilidad: Bola de Fuego)");
        System.out.println("3. Ninja (Poder equilibrado, Habilidad: Ataque Sorpresa)");
        System.out.print("Selecciona (1-3): ");
        
        int opcion = scanner.nextInt();
        
        if (opcion == 1) {
            return new Guerrero();
        } else if (opcion == 2) {
            return new Mago();
        } else if (opcion == 3) {
            return new Ninja();
        } else {
            return new Guerrero();
        }
    }
    


    private void combate() {
        boolean turnoJugador1 = true;

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            mostrarEstado();
            
            Personaje atacante = turnoJugador1 ? jugador1 : jugador2;
            Personaje defensor = turnoJugador1 ? jugador2 : jugador1;
            
            realizarTurno(atacante, defensor, turnoJugador1 ? 1 : 2);
            
            turnoJugador1 = !turnoJugador1;
        }
    }

    private void realizarTurno(Personaje atacante, Personaje defensor, int numJugador) {
        System.out.println("\nTurno del Jugador " + numJugador + " (" + atacante.getNombre() + ")");
        System.out.println("1. Ataque Normal");
        System.out.println("2. Usar Habilidad Especial");
        System.out.print("Elige tu acción (1-2): ");
        
        int accion = scanner.nextInt();
        int dano = 0;

        if (accion == 1) {
            dano = atacante.atacarNormal();
            System.out.println(atacante.getNombre() + " realiza un ataque normal!");
        } else {
            dano = atacante.usarHabilidadEspecial();
            System.out.println(atacante.getNombre() + " usa " + atacante.habilidadEspecial + "!");
        }

        defensor.recibirDano(dano);
        System.out.println("¡" + defensor.getNombre() + " recibe " + dano + " de daño!");
    }

    private void mostrarEstado() {
        System.out.println("\n=== ESTADO DE LA BATALLA ===");
        System.out.println("Jugador 1 - " + jugador1.getNombre() + ": " + jugador1.getVida() + " HP");
        System.out.println("Jugador 2 - " + jugador2.getNombre() + ": " + jugador2.getVida() + " HP");
    }

    private void anunciarGanador() {
        System.out.println("\n=== FIN DE LA BATALLA ===");
        if (!jugador1.estaVivo()) {
            System.out.println("¡Jugador 2 (" + jugador2.getNombre() + ") es el ganador!");
        } else {
            System.out.println("¡Jugador 1 (" + jugador1.getNombre() + ") es el ganador!");
        }
    }

    public Personaje getJugador1() {
        return jugador1;
    }

    public void setJugador1(Personaje jugador1) {
        this.jugador1 = jugador1;
    }

    public Personaje getJugador2() {
        return jugador2;
    }

    public void setJugador2(Personaje jugador2) {
        this.jugador2 = jugador2;
    }

    public java.util.Scanner getScanner() {
        return scanner;
    }

    public void setScanner(java.util.Scanner scanner) {
        this.scanner = scanner;
    }
}

// Clase principal para ejecutar el juego
public class juegoPelea {
    public static void main(String[] args) {
        JuegoPeleas juego = new JuegoPeleas();
        juego.iniciarJuego();
    }
}