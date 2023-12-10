/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

/**
 *
 * @author Hector
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejemplo 

    1:

public class Juego {

        public static void main(String[] args) {
            // Código principal
            FabricaPersonajes fabricaGuerreros = new FabricaGuerreros();
            Personaje guerrero = fabricaGuerreros.crearPersonaje();
            guerrero.atacar();
            guerrero.moverse();

            FabricaPersonajes fabricaMagos = new FabricaMagos();
            Personaje mago = fabricaMagos.crearPersonaje();
            mago.atacar();
            mago.moverse();
        }
    }

    //Interfaz del personaje
    interface Personaje {

        void atacar();

        void moverse();
    }

    //Interfaz de la fabrica
    interface FabricaPersonajes {

        Personaje crearPersonaje();
    }

    class FabricaGuerreros implements FabricaPersonajes {

        @Override
        public Personaje crearPersonaje() {
            return new Guerrero();
        }
    }

    class FabricaMagos implements FabricaPersonajes {

        @Override
        public Personaje crearPersonaje() {
            return new Mago();
        }
    }

    //Clases de productos
    class Guerrero implements Personaje {

        @Override
        public void atacar() {
            System.out.println("El guerrero ataca con su espada");
        }

        @Override
        public void moverse() {
            System.out.println("El guerrero se desplaza por el campo de batalla");
        }
    }

    class Mago implements Personaje {

        @Override
        public void atacar() {
            System.out.println("El mago lanza un hechizo");
        }

        @Override
        public void moverse() {
            System.out.println("El mago se mueve con gracia utilizando su bastón");
        }
    }

    ---------------------------------------------------------------------------------------------------------
    Ejemplo 2:

public class CarreraDeAutos {

        public static void main(String[] args) {
            // Crear un auto de Fórmula 1 usando la fábrica de Fórmula 1
            FabricaAutosDeCarrera fabricaFormula1 = new FabricaFormula1();
            AutoDeCarrera autoFormula1 = fabricaFormula1.crearAutoDeCarrera();
            autoFormula1.acelerar();
            autoFormula1.frenar();

            // Crear un auto de rally usando la fábrica de rally
            FabricaAutosDeCarrera fabricaRally = new FabricaRally();
            AutoDeCarrera autoRally = fabricaRally.crearAutoDeCarrera();
            autoRally.acelerar();
            autoRally.frenar();
        }
    }

    // Interfaz del producto
    interface AutoDeCarrera {

        void acelerar();

        void frenar();
    }

// Clases de productos concretas
    class AutoFormula1 implements AutoDeCarrera {

        @Override
        public void acelerar() {
            System.out.println("Acelerando el auto de Fórmula 1");
        }

        @Override
        public void frenar() {
            System.out.println("Frenando el auto de Fórmula 1");
        }
    }

    class AutoRally implements AutoDeCarrera {

        @Override
        public void acelerar() {
            System.out.println("Acelerando el auto de rally");
        }

        @Override
        public void frenar() {
            System.out.println("Frenando el auto de rally");
        }
    }

// Interfaz de la fábrica
    interface FabricaAutosDeCarrera {

        AutoDeCarrera crearAutoDeCarrera();
    }

// Implementaciones concretas de la fábrica
    class FabricaFormula1 implements FabricaAutosDeCarrera {

        @Override
        public AutoDeCarrera crearAutoDeCarrera() {
            return new AutoFormula1();
        }
    }

    class FabricaRally implements FabricaAutosDeCarrera {

        @Override
        public AutoDeCarrera crearAutoDeCarrera() {
            return new AutoRally();
        }
    }

}

}
