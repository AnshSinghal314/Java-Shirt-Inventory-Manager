package collectionFramework.shirt_project;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Service {
	List<Shirt> shirts = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void Load() {
		shirts.add(new Shirt("Polo  ", "Blue", 2700.00, 34));
		shirts.add(new Shirt("Polo ", "White", 2200.00, 32));
		shirts.add(new Shirt("LouisP", "Black", 2700.00, 36));
		shirts.add(new Shirt("ParkA", "Grey", 2400.00, 34));
		shirts.add(new Shirt("AllenS", "Green", 2600.00, 38));
		shirts.add(new Shirt("Raymond", "Yellow", 2100.00, 32));
		shirts.add(new Shirt("Tommy ", "Green", 3000.00, 38));
		shirts.add(new Shirt("H&M   ", "Pink", 1800.00, 30));
		shirts.add(new Shirt("Zara  ", "Yellow", 3500.00, 40));
		shirts.add(new Shirt("Arrow", "Gray", 2000.00, 42));
	}
	
	//save shirts
	public void saveShirts() {
		System.out.println("Enter shrit Brand");
		String brand = sc.nextLine();
		System.out.println("Enter shrit Color");
		String Color = sc.nextLine();
		System.out.println("Enter shrit Price");
		double price = Double.parseDouble(sc.nextLine());
		System.out.println("Enter shirt size");
		int size = Integer.parseInt(sc.nextLine());
		Shirt newShirt = new Shirt(brand , Color , price ,size);
		shirts.add(newShirt);
		System.out.println("Shirts added successfully:");	
	}
	
	//View all shirts
	public void viewAllShirts() {
		if(shirts.isEmpty()) {
			System.out.println("No shirts avaliable :");
			return;
		}
		for(Shirt x: shirts) {
			System.out.println(x);
		}
		System.out.println("All shirts are viewed");
	}
	
	//access shirts by brand
	public void accessShirtsByBrand() {
		System.out.println("Enter the brand name :");
		String brand = sc.nextLine();
		int x = 0;
		for(Shirt s: shirts) {
			if(s.brand.equalsIgnoreCase(brand)) {
				System.out.println(s);
				x = 1;
			}
		}
		if(x == 0 ) {
			System.out.println("No shirts are found for brand :"+brand);
		}else {
			System.out.println("All Shirts accessed successfully for brand :"+brand);
		}	
	}
	
	//access shirts by price
	public void accessShirtsByPricerange() {
		System.out.println("Enter the size :");
		int Size = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the min price :");
		double minPrice = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the max price :");
		double maxPrice = Double.parseDouble(sc.nextLine());
		int x = 0;
		for(Shirt s: shirts) {
			if(s.price >= minPrice && s.price <= maxPrice) {
				System.out.println(s);
				x=1;
			}
		}
		if(x==0) {
			System.out.println("No shirts found in the price range: " + minPrice + " to " + maxPrice);
		}
		else {
			System.out.println("All Shirts accessed successfully in the price range: form" + minPrice + " to " + maxPrice);
		}
	}
	
	public void accessShirtsByPriceandSize() {
		System.out.println("Enter the size :");
		int size = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the min price :");
		double minPrice = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the max price :");
		double maxPrice = Double.parseDouble(sc.nextLine());
		boolean found = false;
		for(Shirt s: shirts) {
			if(s.size == size && s.price >= minPrice && s.price <= maxPrice) {
				System.out.println(s);
				found = true;
			}
		}
		if(!found) {
			System.out.println("No shirts found in the price range: " + minPrice + " to " + maxPrice + "and size" + size);
		}
		else {
			System.out.println("All Shirts accessed successfully in the price range: form" + minPrice + " to " + maxPrice + "and size" + size);
		}
	}

	public void sortonSizeLowtoHigh() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparingInt(s -> s.size));
			for(Shirt s: temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by size from low to high successfully");
	}

	public void sortSizeHightoLow() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparingInt((Shirt s) -> s.size).reversed());
			for(Shirt s: temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by size form high to low successfully");
		
	}

	public void sortOnBrandLowToHigh() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparing(s -> s.brand));
		for(Shirt s: temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by brand from low to high successfully.");
	}

	public void sortOnBrandHighToLow() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparing((Shirt s) -> s.brand).reversed());
		for(Shirt s: temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by brand from high to low successfully.");
	}

	public void sortOnPriceLowToHighAndIfPriceIsSameThenSortOnSizeLowToHigh() {
		List<Shirt> temp = new ArrayList<>(shirts);
		temp.sort(Comparator.comparing((Shirt s) -> s.price).thenComparingInt(s -> s.size));
		for(Shirt s: temp) {
			System.out.println(s);
		}
		System.out.println("Shirts sorted by price from low to high successfully.");
	}

	public void listAllBrands() {
		List<String> brands = new ArrayList<>();
		for(Shirt s: shirts) {
			if(!brands.contains(s.brand))
				brands.add(s.brand);
		}
		System.out.println("All brands are :"+brands);
	}
	
	
	
}
