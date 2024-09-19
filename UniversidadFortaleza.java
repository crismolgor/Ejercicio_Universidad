package UNIVERSIDAD;

public class UniversidadFortaleza {
/*La solución del problema es la solución N°1

Primeramente nos indican que un director de programa puede ser un profesor 
del departamento, por tanto existe una relación entre la clase Programa y la clase Profesor, por eso se descartan 
la solución 3 y 4 Por ultimo en el enunciado se dice que a una asignatura se asigna un profesor, no lo hace la clase grupo, 
por lo tanto se descarta la solución 2 y concluimos con la solución 1*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Departamento deptoSistemas = new Departamento("115", "Ingeniería de Sistemas", "Edificio SA");
        Profesor profesorPerez = new Profesor("1152390", "Ing Milton", "Ing de Sistemas", deptoSistemas);
        Programa programaIngSistemas = new Programa("115", "Ingeniería de Sistemas", profesorPerez);
        Asginatura asignaturaPOO = new Asginatura("1156420", "Programación Orientada a Objetos", 4);
        Estudiante estudianteJuan = new Estudiante("1152408", "Angel", "Calle 123", "M", "Angel@ufps.edu.co");
        Horario horarioMañana = new Horario("8:00", "10:00", "Salón SA304");
        Horario horarioTarde = new Horario("2:00", "6:00", "Salón SB208");
        Grupo grupo1 = new Grupo("A", 25);
        
        System.out.println("Grupo " + grupo1.getId() + " tiene los siguientes horarios:");
        System.out.println("Horario 1: " + horarioMañana.getHora_ini()+ " " + horarioMañana.getHora_fin() + horarioMañana.getSalon());
        System.out.println("Horario 2: " + horarioTarde.getHora_ini()+ " " + horarioTarde.getHora_fin() +  horarioTarde.getSalon());
        System.out.println("El programa:  " + programaIngSistemas.getNombre() + " está dirigido por el profesor: " + programaIngSistemas.getDirector().getNombre());
        System.out.println("El estudiante:  " + estudianteJuan.getNombre() + " está inscrito en el grupo:  " + grupo1.getId());
        System.out.println("La asignatura: " + asignaturaPOO.getNombre() + " se dicta en el grupo:  " + grupo1.getId());
    }
}

