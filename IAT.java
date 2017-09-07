interface IAT {}

class Unknown implements IAT {
	Unknown() {}
}

class Person2 implements IAT {
	String name;
	IAT mother;
	IAT father;
	
	Person2(String name, IAT mother, IAT father) {
		this.name = name;
		this.mother = mother;
		this.father = father;
	}
}

class ExamplesFamily {
	ExamplesFamily() {}
	
	IAT unknown = new Unknown();
	IAT simplicio = new Person2("Simplicio Laja Padura", this.unknown, this.unknown);
	IAT angelina = new Person2("Angelina Hernandez", this.unknown, this.unknown);
	IAT eustaquio = new Person2("Eustaquio Parducho", this.unknown, this.unknown);
	IAT aniceta = new Person2("Aniceta Castillo", this.unknown, this.unknown);
	IAT fernando = new Person2("Fernando Padura", angelina, simplicio);
	IAT shiela = new Person2("Maria Shiela Parducho", aniceta, eustaquio);
	IAT nisha = new Person2("Nisha Alexis Padura", shiela, fernando);
}