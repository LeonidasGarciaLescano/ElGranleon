package runner;

import controlador.ControladorInicio;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.GeneradorCodigo;
import general.Sistema;
import modelo.Zoologico;
import java.util.Calendar;
import java.util.Date;
import modelo.Animal;
import modelo.Area;
import modelo.ArregloAnimal;
import modelo.ArregloVeterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class App {

    public static void main(String[] args) {

        //CREACION DEL ZOOLOGICO
        Calendar horaApertura = Calendar.getInstance();
        horaApertura.set(Calendar.HOUR_OF_DAY, 8);

        Calendar horaCierre = Calendar.getInstance();
        horaCierre.set(Calendar.HOUR_OF_DAY, 18);

        Sistema.zoo = new Zoologico("El Gran Leon", "Enrique Zegoviano", 150, horaApertura.getTime(), horaCierre.getTime());

        ArregloAnimal animalesFelinos = new ArregloAnimal(20);
        ArregloVeterinario veterinariosFelinos = new ArregloVeterinario(5);

        ArregloAnimal animalesReptiles = new ArregloAnimal(20);
        ArregloVeterinario veterinariosReptiles = new ArregloVeterinario(5);

        ArregloAnimal animalesPrimates = new ArregloAnimal(20);
        ArregloVeterinario veterinariosPrimates = new ArregloVeterinario(5);

        Sistema.zoo.registrarArea("Area Felina", animalesFelinos, veterinariosFelinos);
        Sistema.zoo.registrarArea("Area Reptil", animalesReptiles, veterinariosReptiles);
        Sistema.zoo.registrarArea("Area Primate", animalesPrimates, veterinariosPrimates);

        //REGISTRO EN AREA FELINA
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Leo", "León", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Nala", "Leona", "Felino", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Tigger", "Tigre", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Cleo", "Gato doméstico", "Felino", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Simba", "León", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Shere Khan", "Tigre", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Chester", "Leopardo", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Puma", "Puma", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Tigra", "Tigre blanco", "Felino", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Miau", "Gato", "Felino", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Luna", "Leona", "Felino", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Zafiro", "Leopardo", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Félix", "Gato", "Felino", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Pinky", "Gato persa", "Felino", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Pantera", "Pantera negra", "Felino", "Macho", new Date());

        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarVeterinarioCirujano("VET-1234", "1234", "Leonidas Garcia Lescano", "910274795", "leonidasgarcia@gmail.com", "60911412", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarVeterinarioCirujano(GeneradorCodigo.generarCodigoVeterinario(), GeneradorCodigo.generarClave(), "Dr. Julio César", "981234567", "juliocesar@gmail.com", "12345678", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[0].registrarVeterinarioCirujano(GeneradorCodigo.generarCodigoVeterinario(), GeneradorCodigo.generarClave(), "Dra. Ana María", "965432198", "anamaria@gmail.com", "87654321", new Date());

        //REGISTRO EN AREA REPTIL
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Rex", "Cocodrilo", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Nilo", "Cocodrilo", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Sasha", "Iguana", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Spike", "Dragón de Komodo", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Luna", "Serpiente de cascabel", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Bongo", "Tortuga", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Zara", "Cobra", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Raptor", "Varano", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Rhea", "Gecko", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Goliath", "Cocodrilo", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Tina", "Serpiente verde", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Leo", "Iguana", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Chili", "Anaconda", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Maya", "Tortuga de mar", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Dino", "Caimán", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Tina", "Cobra real", "Reptil", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Fuego", "Camaleón", "Reptil", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Venus", "Tortuga de tierra", "Reptil", "Hembra", new Date());

        Sistema.zoo.getAreaArreglo().getAreas()[1].registrarVeterinarioZoologico("VET-5678", "5678", "Dra. Elena María", "941234567", "elenamaria@gmail.com", "98765432", new Date());

        //REGISTRO EN AREA PRIMATE
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Cesar", "Mono", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Milo", "Gorila", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Lola", "Chimpancé", "Primate", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Toto", "Macaque", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Kiara", "Gorila", "Primate", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Sasha", "Bonobo", "Primate", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Chester", "Orangután", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Rocco", "Gorila", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Luca", "Lemur", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Bella", "Lemur", "Primate", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Zara", "Tamarin", "Primate", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Gus", "Saki", "Primate", "Macho", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Mia", "Capuchino", "Primate", "Hembra", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarAnimal(GeneradorCodigo.generarCodigoAnimal(), "Nemo", "Aye-aye", "Primate", "Macho", new Date());

        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarVeterinarioCirujano("VET-6969", "6969", "Jorge Raul Haya", "923123112", "jorgeraul@gmail.com", "23145672", new Date());
        Sistema.zoo.getAreaArreglo().getAreas()[2].registrarVeterinarioZoologico(GeneradorCodigo.generarCodigoVeterinario(), GeneradorCodigo.generarClave(), "Dra. Elena María", "941234567", "elenamaria@gmail.com", "98765432", new Date());

        
        try {
            Sistema.veterinariosNoAsignados.registrarVeterinarioCirujano("VET-1523", "1523", "Rex Venegas", "910231485", "VenegasR@gmail.com", "60911413", new Date(), "No asignado");
        } catch (IdDuplicado | LimiteAlcanzado e) {
            
        }
        
        Sistema.veterinarios[0] = Sistema.zoo.getAreaArreglo().getAreas()[0].getArregloVeterinarios();
        Sistema.veterinarios[1] = Sistema.zoo.getAreaArreglo().getAreas()[1].getArregloVeterinarios();
        Sistema.veterinarios[2] = Sistema.zoo.getAreaArreglo().getAreas()[2].getArregloVeterinarios();
        Sistema.veterinarios[3] = Sistema.veterinariosNoAsignados;
        
        Sistema.animales[0] = animalesFelinos;
        Sistema.animales[1] = animalesReptiles;
        Sistema.animales[2] = animalesPrimates;
        
        
        controlador.ControladorInicio Programa = new ControladorInicio();

        Programa.run();

    }

}
