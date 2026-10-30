import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dashboard {
    private ArrayList<Renderizable> widgets;

    public Dashboard() {
        this.widgets = new ArrayList<>();
    }

    public void agregarWidget(Renderizable widget) {
        widgets.add(widget);
    }

    public ArrayList<Renderizable> getWidgets() {
        return widgets;
    }

    public Renderizable buscarPorId(String id) {
        for (Renderizable w : widgets) {
            if (w.getId().equalsIgnoreCase(id)) {
                return w;
            }
        }
        return null;
    }

    public Renderizable buscarPorNombre(String nombre) {
        for (Renderizable w : widgets) {
            if (w.getNombre().equalsIgnoreCase(nombre)) {
                return w;
            }
        }
        return null;
    }

    public void ordenarPorMemoria() {
        Collections.sort(widgets, new Comparator<Renderizable>() {
            @Override
            public int compare(Renderizable w1, Renderizable w2) {
                return Integer.compare(w1.getMemoriaKB(), w2.getMemoriaKB());
            }
        });
    }

    public void ejecutarInteraccion(String id) {
        Renderizable w = buscarPorId(id);
        if (w instanceof Interactiva) {
            ((Interactiva) w).interactuar();
        }
    }
}

