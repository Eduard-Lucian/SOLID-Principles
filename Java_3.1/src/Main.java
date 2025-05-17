import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LinearEquationSolver solver = new LinearEquationSolver(2, -4);
        JSONObject solution = solver.solve();

        System.out.println(solution.toString(2));

        try (FileWriter file = new FileWriter("output.json")) {
            file.write(solution.toString(2));
            System.out.println("Rezultatul a fost salvat în output.json");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fișierului: " + e.getMessage());
        }
    }
}
