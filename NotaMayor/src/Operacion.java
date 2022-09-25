import java.util.Scanner;

public class Operacion {

	Scanner sc = new Scanner(System.in);
	private Alumno[] alumno = new Alumno[10];

	public void crearAlumno() {
		
		for (int i = 0; i < alumno.length; i++) {

			System.out.println("Ingrese los datos del estudiante #"+(i+1));
			System.out.println("Nombre:");
			String nombre = sc.next();

			System.out.println("Apellido:");
			String apellido = sc.next();

			System.out.println("Nota final:");
			double notaFinal = sc.nextDouble();

			alumno[i] = new Alumno(nombre, apellido, notaFinal);
		}
	}

	public void mostrarAlumno() {

		System.out.println("\n**Lista de alumnos ingresados**");

		for (int i = 0; i < alumno.length; i++) {

			System.out.println("Nombre: " + alumno[i].getNombre() + " " + alumno[i].getApellido() + " " + " Nota: "
					+ alumno[i].getNotaFinal());
		}
	}

	public void mostrarAlumnoNotaAlta() {

		int notaMayor = 0;
		boolean[] mayorNota = new boolean[alumno.length];
		int cantidadMayorNota = 0;

		for (int i = 0; i < alumno.length; i++) {
			if (alumno[i].getNotaFinal() >= alumno[notaMayor].getNotaFinal()) {
				notaMayor = i;
				mayorNota[i] = true;
				cantidadMayorNota++;
			} else
				mayorNota[i] = false;
		}

		if (cantidadMayorNota == 1) {
			System.out.println("\n**Alumno con la nota más alta**");
			System.out.println(alumno[notaMayor].getNombre() + " " + alumno[notaMayor].getApellido()
					+ " con una nota de: " + alumno[notaMayor].getNotaFinal());
		} else {

			System.out.println("\n**Un total de " + cantidadMayorNota + " alumnos tienen la nota más alta "
					+ alumno[notaMayor].getNotaFinal() + "** Estos son: ");

			for (int i = 0; i < mayorNota.length; i++) {

				if (mayorNota[i] == true) {
					System.out.println("\n" + alumno[i].getNombre() + " " + alumno[i].getApellido());
				}
			}
		}
	}
}
