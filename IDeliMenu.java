interface IDeliMenu {}

class Soup implements IDeliMenu {
	String name;
	int price;
	boolean isVegetarian;

	Soup(String name, int price, boolean isVegetarian){
		this.name = name;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements IDeliMenu {
	String name;
	int price;
	boolean isVegetarian;
	String dressing;

	Salad(String name, int price, boolean isVegetarian, String dressing){
		this.name = name;
		this.price = price;
		this.isVegetarian = isVegetarian;
		this.dressing =dressing;
	}

}

class Sandwich implements IDeliMenu {
	String name;
	int price;
	String breadType;
	String filling1;
	String filling2;

	Sandwich(String name, int price, String breadType, String filling1, String filling2){
		this.name = name;
		this.price = price;
		this.breadType = breadType;
		this.filling1 = filling1;
		this.filling2 = filling2;
	}
}

class ExamplesMenu {
	ExamplesMenu() {}

	IDeliMenu q = new Soup("Mushroom Soup", 30, true);
	IDeliMenu r = new Soup("Chicken Soup", 50, false);
	IDeliMenu s = new Salad("Ceasar Salad", 40, false, "Ceasar");
	IDeliMenu t = new Salad("All Veggies Salad", 60, true, "Thousand Island");
	IDeliMenu u = new Sandwich("PBJ", 50, "Plain", "Peanut Butter", "Jelly");
	IDeliMenu v = new Sandwich("HamandCheese", 30, "Wheat", "Ham", "Cheese");
}