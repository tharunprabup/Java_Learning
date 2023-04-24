package Pizza;

abstract class Pizzza {
	protected String name;
	protected double cost;

	public Pizzza(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public abstract void pizzzaprice();
}

class MargheritaPizzza extends Pizzza {
	public MargheritaPizzza(String name, double cost) {
		super(name, cost);
	}

	public void pizzzaprice() {
		System.out.println("MargheritaPizza : " + cost);
	}
}

class PeppyChikenPizzza extends Pizzza {
	public PeppyChikenPizzza(String name, double cost) {
		super(name, cost);
	}

	public void pizzzaprice() {
		System.out.println("PeppyChiken Pizza : " + cost);
	}
}

interface PizzzaFactory {
	public Pizzza createPizzza(String name, double cost);
}

class MargheritaPizzzaFactory implements PizzzaFactory {
	public Pizzza createPizzza(String name, double cost) {
		return new MargheritaPizzza(name, cost);
	}
}

class PeppyChikenPizzzaFactory implements PizzzaFactory {
	public Pizzza createPizzza(String name, double cost) {
		return new PeppyChikenPizzza(name, cost);
	}
}

class PizzzaPrice {
	private PizzzaFactory factory;

	public PizzzaPrice(PizzzaFactory factory) {
		this.factory = factory;
	}

	public void pizzzaprice(String name, double cost) {
		Pizzza pizza = factory.createPizzza(name, cost);
		pizza.pizzzaprice();
	}
}


public class AbstractPizzaFactory {
	public static void main(String[] args) {
		PizzzaFactory Margheritafactory = new MargheritaPizzzaFactory();
		PizzzaFactory PeppyChikenfactory = new PeppyChikenPizzzaFactory();

		PizzzaPrice doublecheesemargheritaprice = new PizzzaPrice(Margheritafactory);
		doublecheesemargheritaprice.pizzzaprice("Margherita", 999.9);

		PizzzaPrice peppypaneerprice = new PizzzaPrice(PeppyChikenfactory);
		peppypaneerprice.pizzzaprice("PeppyChiken", 959.9);
	}
}

