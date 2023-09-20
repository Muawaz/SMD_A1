/* 

It's also known as the "deadly diamond of death" or just the 
 "diamond inheritance problem." 

Now, let's say you have another class, All-rounder, that inherits 
from both Class Batsman and Class Bowler. This is where the diamond 
problem comes into play. Class All-rounder effectively inherits from 
Class Cricketer through two different paths, one through Class Batsman 
and another through Class Bowler.

When you try to access a member or method (Print()) of Class Cricketer 
through an instance of Class All-rounder, the compiler may face ambiguity. 
It doesn't know which path to follow to get to Class Cricketer because 
it has two equally valid paths (through Class Batsman and through 
Class Bowler).

*/

interface Cricketer {
    // Declare three variables
    String Name = "";
    int Age = 0;
    String Nationality = "";

    // Declare a method
    void Print();
}

class Batsman implements Cricketer {
    private String Name;
    private int Age;
    private String Nationality;
    private int Score;
    private int BatsmanRanking;

    public Batsman(String name, int age, String nationality, int score, int batsmanRanking) {
        this.Name = name;
        this.Age = age;
        this.Nationality = nationality;
        this.Score = score;
        this.BatsmanRanking = batsmanRanking;
    }

    @Override
    public void Print() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Nationality: " + Nationality);
        System.out.println("Score: " + Score);
        System.out.println("Batsman Ranking: " + BatsmanRanking);
    }

    // Additional method for getting ranking
    public int getRanking() {
        return BatsmanRanking;
    }

    // public static void main(String[] args) {
    //     Batsman batsman = new Batsman("John", 30, "England", 1200, 5);
        
    //     System.out.println("Batsman Details:");
    //     batsman.Print();
        
    //     System.out.println("Batsman Ranking: " + batsman.getRanking());
    // }
}

class Bowler implements Cricketer {
    private String Name;
    private int Age;
    private String Nationality;
    private int Wickets;
    private int BowlerRanking;

    public Bowler(String name, int age, String nationality, int wickets, int bowlerRanking) {
        this.Name = name;
        this.Age = age;
        this.Nationality = nationality;
        this.Wickets = wickets;
        this.BowlerRanking = bowlerRanking;
    }

    @Override
    public void Print() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Nationality: " + Nationality);
        System.out.println("Wickets: " + Wickets);
        System.out.println("Bowler Ranking: " + BowlerRanking);
    }

    // Additional method for getting ranking
    public int getRanking() {
        return BowlerRanking;
    }

    // public static void main(String[] args) {
    //     Bowler bowler = new Bowler("Alice", 25, "Australia", 150, 3);
        
    //     System.out.println("Bowler Details:");
    //     bowler.Print();
        
    //     System.out.println("Bowler Ranking: " + bowler.getRanking());
    // }
}

class AllRounder implements Cricketer {
    private Batsman batsman;
    private Bowler bowler;
    private int Ranking; // Overall ranking

    public AllRounder(String name, 
                    int age, 
                    String nationality, 
                    int score, 
                    int batsmanRanking, 
                    int wickets, 
                    int bowlerRanking, 
                    int ranking) {

        this.batsman = new Batsman(name, 
                                age, 
                                nationality, 
                                score, 
                                batsmanRanking);

        this.bowler = new Bowler(name, 
                                age, 
                                nationality, 
                                wickets, 
                                bowlerRanking);
        this.Ranking = ranking;
    }

    
    @Override
    public void Print() {
        System.out.println("All-Rounder Details:");
        // Print All-Rounder-specific details
        batsman.Print(); // Delegate to Batsman's Print method
        bowler.Print(); // Delegate to Bowler's Print method
    }

    public int getRanking() {
        return Ranking;
    }

    public int getBatsmanRanking() {
        return batsman.getRanking();
    }

    public int getBowlerRanking() {
        return bowler.getRanking();
    }

    // public static void main(String[] args) {
    //     AllRounder allRounder = new AllRounder("John", 30, "England", 1200, 5, 150, 3, 7);

    //     System.out.println("All-Rounder Details:");
    //     allRounder.Print();

    //     System.out.println("All-Rounder Ranking: " + allRounder.getRanking());
    //     System.out.println("Batsman Ranking: " + allRounder.getBatsmanRanking());
    //     System.out.println("Bowler Ranking: " + allRounder.getBowlerRanking());
    // }
}

public class Q1MainDriver {
    public static void main(String[] args) {
        AllRounder allRounder = new AllRounder("John", 30, "England", 1200, 5, 150, 3, 7);

        System.out.println("All-Rounder Details:");
        allRounder.Print();

        System.out.println("All-Rounder Ranking: " + allRounder.getRanking());
        System.out.println("Batsman Ranking: " + allRounder.getBatsmanRanking());
        System.out.println("Bowler Ranking: " + allRounder.getBowlerRanking());
    }
}