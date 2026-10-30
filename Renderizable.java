import javax.swing.JComponent;

public interface Renderizable {
    String getId();
    String getNombre();
    int getMemoriaKB();
    void renderizar();
    JComponent obtenerVista();
}
