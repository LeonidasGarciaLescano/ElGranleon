package general;

import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;
import modeloAnimal.Animal;
import modeloArea.Area;
import modeloVeterinario.Veterinario;
import modeloVeterinario.VeterinarioCirujano;
import modeloVeterinario.VeterinarioZoologico;

/**
 * @author Leonidas Garcia Lescano
 */
public class Config {

    public static void cargarVeterinarios() {
        //VETERINARIOS POR DEFECTO
        Veterinario vet1 = new VeterinarioCirujano("VET-0001", "clave123", "Juan Pérez", "123456789", "juan@mail.com", "12345678", new Date());
        Veterinario vet2 = new VeterinarioCirujano("VET-0002", "clave456", "Ana Gómez", "234567891", "ana@mail.com", "23456789", new Date());
        Veterinario vet3 = new VeterinarioCirujano("VET-0003", "clave789", "Carlos Ruiz", "345678912", "carlos@mail.com", "34567890", new Date());
        Veterinario vet4 = new VeterinarioZoologico("VET-0004", "clave101", "Lucía Sánchez", "456789123", "lucia@mail.com", "45678901", new Date());
        Veterinario vet5 = new VeterinarioZoologico("VET-0005", "clave202", "Miguel Torres", "567891234", "miguel@mail.com", "56789012", new Date());
        Veterinario vet6 = new VeterinarioZoologico("VET-0006", "clave303", "Laura Peña", "678912345", "laura@mail.com", "67890123", new Date());
        Veterinario vet7 = new VeterinarioZoologico("VET-0007", "clave404", "Ricardo López", "789123456", "ricardo@mail.com", "78901234", new Date());
        Veterinario vet8 = new VeterinarioZoologico("VET-0008", "clave505", "Marta Díaz", "891234567", "marta@mail.com", "89012345", new Date());
        Veterinario vet9 = new VeterinarioZoologico("VET-0009", "clave606", "Esteban Romero", "912345678", "esteban@mail.com", "90123456", new Date());

        Area areaFelina = Sistema.areas.obtenerArreglo()[0];
        Area areaReptil = Sistema.areas.obtenerArreglo()[1];
        Area areaPrimate = Sistema.areas.obtenerArreglo()[2];

        //REGISTROS DE VETERINARIOS EN AREA FELINA
        areaFelina.registrarVeterinario(vet1);
        areaFelina.registrarVeterinario(vet2);
        areaFelina.registrarVeterinario(vet3);

        //REGISTROS DE VETERINARIOS EN AREA REPTIL
        areaReptil.registrarVeterinario(vet4);
        areaReptil.registrarVeterinario(vet5);
        areaReptil.registrarVeterinario(vet6);

        //REGISTROS DE VETERINARIOS EN AREA PRIMATE
        areaPrimate.registrarVeterinario(vet7);
        areaPrimate.registrarVeterinario(vet8);
        areaPrimate.registrarVeterinario(vet9);

    }

    public static void cargarAnimales() {

        //ANIMALES POR DEFECTO
        //FELINOS
        Animal animal1 = new Animal("ANI-0001", "León", "Felino", "Mamífero", "Macho", new Date());
        Animal animal2 = new Animal("ANI-0002", "Tigre", "Felino", "Mamífero", "Hembra", new Date());
        Animal animal3 = new Animal("ANI-0003", "Jaguar", "Felino", "Mamífero", "Macho", new Date());
        Animal animal4 = new Animal("ANI-0004", "Pantera", "Felino", "Mamífero", "Hembra", new Date());
        Animal animal5 = new Animal("ANI-0005", "Gato", "Felino", "Mamífero", "Macho", new Date());
        Animal animal16 = new Animal("ANI-0016", "Leopardo", "Felino", "Mamífero", "Macho", new Date());
        Animal animal17 = new Animal("ANI-0017", "Lince", "Felino", "Mamífero", "Hembra", new Date());
        Animal animal18 = new Animal("ANI-0018", "Gato Montés", "Felino", "Mamífero", "Macho", new Date());
        Animal animal19 = new Animal("ANI-0019", "Ocelote", "Felino", "Mamífero", "Hembra", new Date());
        Animal animal20 = new Animal("ANI-0020", "Puma", "Felino", "Mamífero", "Macho", new Date());

        //REPTILES
        Animal animal6 = new Animal("ANI-0006", "Iguana", "Reptil", "Reptil", "Hembra", new Date());
        Animal animal7 = new Animal("ANI-0007", "Cocodrilo", "Reptil", "Reptil", "Macho", new Date());
        Animal animal8 = new Animal("ANI-0008", "Lagarto", "Reptil", "Reptil", "Macho", new Date());
        Animal animal9 = new Animal("ANI-0009", "Serpiente", "Reptil", "Reptil", "Hembra", new Date());
        Animal animal10 = new Animal("ANI-0010", "Tortuga", "Reptil", "Reptil", "Hembra", new Date());
        Animal animal21 = new Animal("ANI-0021", "Camaleón", "Reptil", "Reptil", "Hembra", new Date());
        Animal animal22 = new Animal("ANI-0022", "Boa", "Reptil", "Reptil", "Macho", new Date());
        Animal animal23 = new Animal("ANI-0023", "Caimán", "Reptil", "Reptil", "Macho", new Date());
        Animal animal24 = new Animal("ANI-0024", "Anaconda", "Reptil", "Reptil", "Hembra", new Date());
        Animal animal25 = new Animal("ANI-0025", "Víbora", "Reptil", "Reptil", "Macho", new Date());

        //PRIMATE
        Animal animal11 = new Animal("ANI-0011", "Gorila", "Primate", "Mamífero", "Macho", new Date());
        Animal animal12 = new Animal("ANI-0012", "Mono Capuchino", "Primate", "Mamífero", "Macho", new Date());
        Animal animal13 = new Animal("ANI-0013", "Orangután", "Primate", "Mamífero", "Hembra", new Date());
        Animal animal14 = new Animal("ANI-0014", "Chimpancé", "Primate", "Mamífero", "Hembra", new Date());
        Animal animal15 = new Animal("ANI-0015", "Tití", "Primate", "Mamífero", "Macho", new Date());
        Animal animal26 = new Animal("ANI-0026", "Mandril", "Primate", "Mamífero", "Macho", new Date());
        Animal animal27 = new Animal("ANI-0027", "Babuino", "Primate", "Mamífero", "Hembra", new Date());
        Animal animal28 = new Animal("ANI-0028", "Mono Araña", "Primate", "Mamífero", "Macho", new Date());
        Animal animal29 = new Animal("ANI-0029", "Tití Pigmeo", "Primate", "Mamífero", "Hembra", new Date());
        Animal animal30 = new Animal("ANI-0030", "Colobo", "Primate", "Mamífero", "Macho", new Date());

        Area areaFelina = Sistema.areas.obtenerArreglo()[0];
        Area areaReptil = Sistema.areas.obtenerArreglo()[1];
        Area areaPrimate = Sistema.areas.obtenerArreglo()[2];

        //REGISTROS DE ANIMALES  EN AREA FELINA
        areaFelina.registrarAnimal(animal1);
        areaFelina.registrarAnimal(animal2);
        areaFelina.registrarAnimal(animal3);
        areaFelina.registrarAnimal(animal4);
        areaFelina.registrarAnimal(animal5);
        areaFelina.registrarAnimal(animal16);
        areaFelina.registrarAnimal(animal17);
        areaFelina.registrarAnimal(animal18);
        areaFelina.registrarAnimal(animal19);
        areaFelina.registrarAnimal(animal20);

        //REGISTRO DE ANIMALES  EN AREA REPTIL
        areaReptil.registrarAnimal(animal6);
        areaReptil.registrarAnimal(animal7);
        areaReptil.registrarAnimal(animal8);
        areaReptil.registrarAnimal(animal9);
        areaReptil.registrarAnimal(animal10);
        areaReptil.registrarAnimal(animal21);
        areaReptil.registrarAnimal(animal22);
        areaReptil.registrarAnimal(animal23);
        areaReptil.registrarAnimal(animal24);
        areaReptil.registrarAnimal(animal25);

        //REGISTROS DE ANIMALES EN AREA PRIMATE
        areaPrimate.registrarAnimal(animal11);
        areaPrimate.registrarAnimal(animal12);
        areaPrimate.registrarAnimal(animal13);
        areaPrimate.registrarAnimal(animal14);
        areaPrimate.registrarAnimal(animal15);
        areaPrimate.registrarAnimal(animal26);
        areaPrimate.registrarAnimal(animal27);
        areaPrimate.registrarAnimal(animal28);
        areaPrimate.registrarAnimal(animal29);
        areaPrimate.registrarAnimal(animal30);

    }

    public static void cargarAreas() {
        Area areaFelina = new Area("Area Felina");
        Area areaReptil = new Area("Area Reptil");
        Area areaPrimate = new Area("Area Primate");

        //REGISTRO EN EL SISTEMA
        try {
            Sistema.areas.registrarArea(areaFelina);
            Sistema.areas.registrarArea(areaReptil);
            Sistema.areas.registrarArea(areaPrimate);

            System.out.println("Configuracion correcta");

        } catch (IdDuplicado | LimiteAlcanzado e) {
            System.out.println(e.getMessage());
        }
    }

}
