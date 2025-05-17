import org.json.JSONObject;

public class LinearEquationSolver {
    private double a;
    private double b;

    public LinearEquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public JSONObject solve() {
        JSONObject result = new JSONObject();
        result.put("a", a);
        result.put("b", b);

        if (a == 0 && b == 0) {
            result.put("type", "infinite_solutions");
            result.put("message", "Ecuația are o infinitate de soluții.");
        } else if (a == 0) {
            result.put("type", "no_solution");
            result.put("message", "Ecuația nu are soluții.");
        } else {
            double x = -b / a;
            result.put("type", "one_solution");
            result.put("solution", x);
            result.put("message", "Ecuația are o singură soluție.");
        }

        return result;
    }
}
