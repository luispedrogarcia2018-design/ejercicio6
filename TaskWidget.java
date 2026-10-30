import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class TaskWidget implements Renderizable, Interactiva {
    private String id;
    private String nombre;
    private int memoriaKB;
    private String tarea;
    private boolean completada;
    private JLabel lblTarea;

    public TaskWidget(String id, String nombre, int memoriaKB, String tarea) {
        this.id = id;
        this.nombre = nombre;
        this.memoriaKB = memoriaKB;
        this.tarea = tarea;
        this.completada = false;
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
        System.out.println(nombre + ": " + tarea + " (Completada: " + completada + ")");
    }

    @Override
    public void interactuar() {
        completada = !completada;
        if (completada) {
            lblTarea.setText(tarea + " [Listo]");
        } else {
            lblTarea.setText(tarea + " [Pendiente]");
        }
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(nombre));

        lblTarea = new JLabel(tarea + " [Pendiente]", SwingConstants.CENTER);
        JButton btnCompletar = new JButton("Cambiar Estado");
        btnCompletar.addActionListener(e -> interactuar());

        panel.add(lblTarea, BorderLayout.CENTER);
        panel.add(btnCompletar, BorderLayout.SOUTH);
        return panel;
    }
}

