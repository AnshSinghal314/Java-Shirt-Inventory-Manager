package collectionFramework.shirt_project;

public class Shirt {

	String brand,color;
	double price;
	int size;
	
	Shirt(){
		
	}
	Shirt(String brand, String color, double price, int size){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.size=size;
	}
	public String toString() {
		return "Shirt [brand=" + brand + "\tcolor=" + color + "\tprice=" + price + "\tsize=" + size + "]";
	}

}
