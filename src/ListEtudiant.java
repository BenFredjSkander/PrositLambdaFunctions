import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ListEtudiant implements GestionEtudiant {

	@Override
	public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
		for(Etudiant et: etudiants) {
			consumer.accept(et);
		}
		
		
		
	}

	@Override
	public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate,
			Consumer<Etudiant> cons) {
		for(Etudiant et: etudiants) {
			if(predicate.test(et)) {
			cons.accept(et);
			}
		}
	}

	@Override
	public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
		// TODO Auto-generated method stub
		String res = "";
		for(Etudiant et: etudiants) {
			res+= f.apply(et);
		}
		System.out.println(res);
		return res;
	}

	@Override
	public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
	
		// TODO Auto-generated method stub
		return supp.get();
	}

	@Override
	public Stream convertListStream(List<Etudiant> l) {
		// TODO Auto-generated method stub
		return l.stream();
	}

}
