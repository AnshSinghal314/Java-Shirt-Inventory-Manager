package collectionFramework.shirt_project;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Shirt Project :-");
		Service service = new Service();
		service.Load();
		String continueChoice ;
		
		do {
			System.out.println("Press 1 to Add shirt");
			System.out.println("Press 2 to View all shirts");
			System.out.println("Press 3 to Access all shirts on brand");
			System.out.println("Press 5 to Access all shirts on price");
			System.out.println("Press 6 to Access all shirts on price and size");
			System.out.println("Press 7 to sort on size low to high");
			System.out.println("Press 8 to sort on size high to low");
			System.out.println("Press 11 to sort on brand low to high");
			System.out.println("Press 12 to sort on brand high to low");
			System.out.println("Press 13 to sort on price low to high and if price is same then sort on size low to high");
			System.out.println("Press 17 to list all brands");
			System.out.println("Press 0 to Exit ");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
				case 1 :
					service.saveShirts();
					break;
				case 2 : 
					service.viewAllShirts();
					break;
				case 3 : 
					service.accessShirtsByBrand();
					//System.out.println("All shirts are accessed on brand");
					break;
				case 5 : 
					service.accessShirtsByPricerange();
					break;
				case 6 :
					service.accessShirtsByPriceandSize();
					break;
				case 7 :
					service.sortonSizeLowtoHigh();
					break;
				case 8 :
					service.sortSizeHightoLow();
					break;
				case 11 :
					service.sortOnBrandLowToHigh();
					break;
				case 12 :
					service.sortOnBrandHighToLow();
					break;	
				case 13 :
					service.sortOnPriceLowToHighAndIfPriceIsSameThenSortOnSizeLowToHigh();
					break;
				case 17 :
					service.listAllBrands();
					break;
				case 0 : 
					System.out.println("Thank you for using shirt Project! Application Exiting.....");
					System.exit(0);
				default: 
					System.out.println("Invalid choice, please try again");
			}
			System.out.println("Do you want to continue ? (yes/no)");
			continueChoice = sc.nextLine();
		}while(continueChoice.equalsIgnoreCase("yes"));
			System.out.println("======Thank You Application Ends!!======");
	}
}
