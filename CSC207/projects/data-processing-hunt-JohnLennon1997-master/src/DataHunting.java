import java.util.stream.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class DataHunting {
	

	public static void Set1a() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/discoveries.txt"));

		System.out.println(
				str.map(s -> Integer.parseInt(s))
				.filter(s -> s >= 10)
		        .count());
				str.close();
		
		str.close();
	}

	public static void Set1b() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/discoveries.txt"));

		System.out.println(
				str.map(s -> Integer.parseInt(s))
				.reduce(0, Integer:: max));
		str.close();
	}
		
		
	

	public static void Set1c() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/discoveries.txt"));

		System.out.println(
				str.map(s -> Integer.parseInt(s))
				.reduce(0, Integer:: sum));
		str.close();
	}



	public static void Set2a() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/Marathon.txt"));

		System.out.println(
				str.map(s -> s.split(","))
				.filter(s -> s[8].equals("0"))
				.map(s -> Double.parseDouble(s[7]))
				.reduce(10.0, Double :: min) + " minutes per mile");
		str.close();
	}

	public static void Set2b() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/Marathon.txt"));

		System.out.println(
				str.map(s -> s.split(","))
				.filter(x -> x[9].equals("0"))
				.filter(x -> x[8].equals("0"))
				.count());
				
		str.close();
	}

	public static void Set2c() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/Marathon.txt"));

		System.out.println(
				str.map(s -> s.split(","))
				.map(s -> Double.parseDouble(s[6]))
				.reduce(0.0, Double :: max)
				+ " minutes");
				
		str.close();
	}

	public static void Set3a() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/presidents.txt"));

		System.out.println(
				str.map(s -> Integer.parseInt(s))
				.filter(s -> s <= 35)
				.count());
		str.close();

	}

	public static void Set3b() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/presidents.txt"));

		System.out.println(
				
				str.map(s -> Integer.parseInt(s))
				.filter(s -> 40 <= s && s <= 60)
				.count()/1.20);
		str.close();
	}

	public static void Set3c() throws IOException{
		Stream<String> str = Files.lines(Paths.get("/home/lennonjo/CSC207/projects/data-processing-hunt-JohnLennon1997-master/src/presidents.txt"));

		System.out.println(
				str.map(s -> Integer.parseInt(s))
				.reduce(0, Integer:: max));
		str.close();
	}

	public static void main(String[] args) throws IOException{
		System.out.println("Data set 1: Scientific Discoveries");
		System.out.println("Question a) How many years had 0 major discoveries?");
		Set1a();
		System.out.println("Question b) What was the most discoveries reported in one year?");
		Set1b();
		System.out.println("Question c) What is the total number of discoveries in the set?");
		Set1c();
		System.out.println("Data set 2: Marathon training records");
		System.out.println("Question a) How fast is the fastest run of more than 5 miles in the data set?");
		Set2a();
		System.out.println("Question b) How many long (> 5 miles) runs occurred before 2004?");
		Set2b();
		System.out.println("Question c) What is the longest (by time) run in the data set?");
		Set2c();
		System.out.println("Data set 3: Presidential Approval Ratings");
		System.out.println("Question a) How many times was the approval rating below 35%?");
		Set3a();
		System.out.println("Question b) What percentage of ratings are between 40% and 60%?");
		Set3b();
		System.out.println("Question c) What was the President's highest approval rating?");
		Set3c();
	}
}
