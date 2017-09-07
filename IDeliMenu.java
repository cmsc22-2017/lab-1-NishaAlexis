interface IDeliMenu {}

class Soup implements IDeliMenu {
	NamePrice soup;
	boolean isVegetarian;

	Soup(NamePrice soup, boolean isVegetarian){
		this.soup = soup;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements IDeliMenu {
	NamePrice salad;
	boolean isVegetarian;
	String dressing;

	Salad(NamePrice salad, boolean isVegetarian, String dressing){
		this.salad = salad;
		this.isVegetarian = isVegetarian;
		this.dressing =dressing;
	}

}

class Sandwich implements IDeliMenu {
	NamePrice sandwich;
	String breadType;
	String filling1;
	String filling2;

	Sandwich(NamePrice sandwich, String breadType, String filling1, String filling2){
		this.sandwich = sandwich;
		this.breadType = breadType;
		this.filling1 = filling1;
		this.filling2 = filling2;
	}
}

class NamePrice { // TODO Remove this class, I think it's unecessary (we'll discuss a better solution soon)
	String name;
	int price;

	NamePrice(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class ExamplesMenu {
	ExamplesMenu() {}

	NamePrice a = new NamePrice("Mushroom Soup", 30);
	NamePrice b = new NamePrice("Chicken Soup", 50);
	NamePrice c = new NamePrice("Ceasar Salad", 40);
	NamePrice d = new NamePrice("All Veggies Salad", 60);
	NamePrice e = new NamePrice("PBJ", 50);
	NamePrice f = new NamePrice("HamandCheese", 30);

	IDeliMenu q = new Soup(a, true);
	IDeliMenu r = new Soup(b, false);
	IDeliMenu s = new Salad(c, false, "Ceasar");
	IDeliMenu t = new Salad(d, true, "Thousand Island");
	IDeliMenu u = new Sandwich(e, "Plain", "Peanut Butter", "Jelly");
	IDeliMenu v = new Sandwich(f, "Wheat", "Ham", "Cheese");

}
