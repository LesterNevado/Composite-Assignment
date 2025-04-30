import java.util.ArrayList;
import java.util.List;

public class College implements NEUComponent {
    private String name;
    private List<NEUComponent> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(NEUComponent component) {
        components.add(component);
    }

    public void remove(NEUComponent component) {
        components.remove(component);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (NEUComponent component : components) {
            total += component.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (NEUComponent component : components) {
            total += component.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (NEUComponent component : components) {
            component.displayDetails();
        }
    }
}
