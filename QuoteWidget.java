import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class QuoteWidget implements Renderizable {
    private String id;
    private String nombre;
    private int memoriaKB;
    private String frase;

    public QuoteWidget(String id, String nombre, int memoriaKB, String frase) {
        this.id = id;
        this.nombre = nombre;
        this.memoriaKB = memoriaKB;
        this.frase = frase;
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
        System.out.println(nombre + ": \"" + frase + "\"");
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(nombre));
        JLabel label = new JLabel("<html><center>" + frase + "</center></html>", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        return panel;
    }
}

