import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

public class DashboardView extends JFrame {
    private JPanel panelWidgets;
    private JButton btnOrdenar;
    private JButton btnListar;

    public DashboardView() {
        setTitle("Panel de Control Empresarial");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        JLabel lblTitulo = new JLabel("Dashboard Modular");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        btnOrdenar = new JButton("Ordenar por Memoria");
        btnListar = new JButton("Listar en Consola");

        panelSuperior.add(lblTitulo);
        panelSuperior.add(btnOrdenar);
        panelSuperior.add(btnListar);
        add(panelSuperior, BorderLayout.NORTH);

        panelWidgets = new JPanel(new GridLayout(0, 3, 10, 10));
        JScrollPane scrollPane = new JScrollPane(panelWidgets);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void mostrarWidgets(ArrayList<Renderizable> widgets) {
        panelWidgets.removeAll();
        for (Renderizable w : widgets) {
            panelWidgets.add(w.obtenerVista());
        }
        panelWidgets.revalidate();
        panelWidgets.repaint();
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }
}

