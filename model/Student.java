package model;

public class Student extends User{
    private double budget;

    public Student (String userId, String name, String email, double budget) {
        super(userId, name, email);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public void login() {
        System.out.println("Student" + getName() + "is logged in.");
    }

    public void searchRoom(String location, double maxRent) {
        System.out.println(getName() + "is searching for rooms at" + location + "with max rent of " + maxRent);
    }
}
