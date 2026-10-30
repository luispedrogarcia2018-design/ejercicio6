import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class WeatherWidget implements Renderizable, Interactiva {
    private String id;
    private String nombre;
    private int memoriaKB;
    private int tempC;
    private boolean esCelsius;
    private JLabel lblTemp;

    public WeatherWidget(String id, String nombre, int memoriaKB, int tempC) {
        this.id = id;
        this.nombre = nombre;
        this.memoriaKB = memoriaKB;
        this.tempC = tempC;
        this.esCelsius = true;
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
        System.out.println(nombre + ": " + tempC + "°C");
    }

    @Override
    public void interactuar() {
        esCelsius = !esCelsius;
        if (esCelsius) {
            lblTemp.setText(tempC + "°C");
        } else {
            int tempF = (tempC * 9 / 5) + 32;
            lblTemp.setText(tempF + "°F");
        }
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(nombre));

        lblTemp = new JLabel(tempC + "°C", SwingConstants.CENTER);
        JButton btnCambiar = new JButton("Cambiar °C / °F");
        btnCambiar.addActionListener(e -> interactuar());

        panel.add(lblTemp, BorderLayout.CENTER);
        panel.add(btnCambiar, BorderLayout.SOUTH);
        return panel;
    }
}
