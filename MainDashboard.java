public class MainDashboard {
    public static void main(String[] args) {
        Dashboard modelo = new Dashboard();

        modelo.agregarWidget(new WeatherWidget("W1", "Clima Central", 120, 24));
        modelo.agregarWidget(new ClockWidget("W2", "Reloj Local", 45, "10:30 AM"));
        modelo.agregarWidget(new TaskWidget("W3", "Tarea Diaria", 80, "Revisar Correos"));
        modelo.agregarWidget(new QuoteWidget("W4", "Frase del Dia", 30, "El exito es la suma de pequenos esfuerzos."));
        modelo.agregarWidget(new WeatherWidget("W5", "Clima Sucursal Norte", 110, 18));
        modelo.agregarWidget(new ClockWidget("W6", "Reloj Tokio", 45, "01:30 AM"));
        modelo.agregarWidget(new TaskWidget("W7", "Inventario", 95, "Actualizar stock"));
        modelo.agregarWidget(new QuoteWidget("W8", "Filosofia", 25, "La simplicidad es clave."));
        modelo.agregarWidget(new WeatherWidget("W9", "Clima Almacen", 105, 21));
        modelo.agregarWidget(new ClockWidget("W10", "Reloj Nueva York", 50, "12:30 PM"));

        DashboardView vista = new DashboardView();
        new DashboardController(modelo, vista);

        vista.setVisible(true);
    }
}
