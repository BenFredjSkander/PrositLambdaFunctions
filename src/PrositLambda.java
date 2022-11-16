import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class PrositLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Etudiant> ets = new ArrayList<>();

		ets.add(new Etudiant(5, "Ets", 24));
		ets.add(new Etudiant(2, "Moha", 66));

		ListEtudiant listEtudiant = new ListEtudiant();
		listEtudiant.afficherEtudiants(ets, t -> System.out.println(t));
		System.out.println("************");
				
				listEtudiant.creeEtudiant(() -> new Etudiant(3, "Yasmine", 6));
				System.out.println("************");

				listEtudiant.afficherEtudiantSelonFiltre(ets, t-> t.age>30, t -> System.out.println(t));
				System.out.println("************");
				
				listEtudiant.afficherNomEtudiant(ets, t->t.nom);

				System.out.println("************");


	}

}
