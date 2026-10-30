import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardController {
    private Dashboard modelo;
    private DashboardView vista;

    public DashboardController(Dashboard modelo, DashboardView vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.getBtnOrdenar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.ordenarPorMemoria();
                vista.mostrarWidgets(modelo.getWidgets());
            }
        });

        this.vista.getBtnListar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Renderizable w : modelo.getWidgets()) {
                    w.renderizar();
                }
            }
        });

        this.vista.mostrarWidgets(this.modelo.getWidgets());
    }
}

