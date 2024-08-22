package CustomerTask;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Stream;

	public class CustomerMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			List<Customer>customer = new ArrayList<Customer>();
			try {
				customer.add(new Customer (1,"stuti","patna" , 95000,sdf.parse("2001-03-31")));
				customer.add(new Customer (1,"smita","delhi" , 85000,sdf.parse("2001-03-06")));
				customer.add(new Customer (1,"menka","banglore" , 70000,sdf.parse("2001-05-21")));
				customer.add(new Customer (1,"mani","pune" , 50000,sdf.parse("2001-02-29")));
				customer.add(new Customer (1,"sweta","chennai" , 30000,sdf.parse("2001-07-31")));
				customer.add(new Customer (1,"ravi","bhopal" , 45000,sdf.parse("2001-06-07")));
				customer.add(new Customer (1,"rohan","indore" , 67000,sdf.parse("2001-03-09")));
				customer.add(new Customer (1,"nihal","mumbai" , 85000,sdf.parse("2001-08-12")));
				customer.add(new Customer (1,"anshu","varansi" , 80000,sdf.parse("2001-09-14")));
				customer.add(new Customer (1,"amisha","patna" , 66000,sdf.parse("2001-10-16")));
			}catch(ParseException e) {
				e.printStackTrace();
			}
			// premium id > 80000

			 System.out.println(" Customer Records:");
			 customer.forEach(System.out::println); 
			 
			System.out.println("Customer with premium > 80000");
	        Stream<Customer> filter1 = customer.stream().filter(x -> x.getPremium() >= 90000);
			filter1.forEach(x -> {
				System.out.println(x);
			});
			// sorted by name 
			
			System.out.println("customer records");
			System.out.println("Sort By Name-wise  ");
			Collections.sort(customer, (c1, c2) -> {
				return c1.getCustName().compareTo(c2.getCustName());
			});
			customer.forEach(x -> {
				System.out.println(x);
			});
			// sorted by dob
			
			System.out.println("Sort By Date of Birth  ");
			Collections.sort(customer, (c1, c2) -> {
				return c1.getDateOfBirth().compareTo(c2.getDateOfBirth());
			});
			customer.forEach(x -> {
				System.out.println(x);
			});
		}
	}


