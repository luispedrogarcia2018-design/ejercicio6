import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class ClockWidget implements Renderizable {
    private String id;
    private String nombre;
    private int memoriaKB;
    private String hora;

    public ClockWidget(String id, String nombre, int memoriaKB, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.memoriaKB = memoriaKB;
        this.hora = hora;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getMemoriaKB() {
        return memoriaKB;
    }

    @Override
    public void renderizar() {
        System.out.println(nombre + " (" + hora + ")");
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(nombre));
        JLabel label = new JLabel(hora, SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        return panel;
    }
}
