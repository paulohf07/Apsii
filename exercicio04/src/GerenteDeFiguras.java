import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica fig) {
        figuras.add(fig);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        if (figuras.isEmpty()) {
            return 0.0;
        }
        double maiorArea = figuras.get(0).calculaArea();
        for (FiguraGeometrica fig : figuras) {
            if (fig.calculaArea() > maiorArea) {
                maiorArea = fig.calculaArea();
            }
        }
        return maiorArea;
    }

    public double calculaAreaTotalDeFiguras() {
        double total = 0.0;
        for (FiguraGeometrica fig : figuras) {
            total += fig.calculaArea();
        }
        return total;
    }

    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }
}
