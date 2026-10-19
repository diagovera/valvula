public class Main {
    public static void main(String[] args) {

        Valvula valvula1 = new Valvula("V-001", 50, 120.5);
        Valvula valvula2 = new Valvula("V-002", 0, 80.0);

        System.out.println("=== Estado inicial ===");
        mostrar(valvula1);
        mostrar(valvula2);

        System.out.println();
        System.out.println("=== Se activa solo la válvula 1 ===");
        valvula1.activar();
        valvula1.activar(); // ya estaba activa
        mostrar(valvula1);
        mostrar(valvula2);

        System.out.println();
        System.out.println("=== Cambios válidos ===");
        valvula1.setApertura(75);
        valvula1.setPresion(150.0);
        mostrar(valvula1);

        System.out.println();
        valvula1.desactivar();
        mostrar(valvula1);

        System.out.println();
        System.out.println("=== Pruebas de validaciones ===");

        try {
            valvula1.setApertura(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            valvula1.setApertura(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            valvula1.setPresion(-5.5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        mostrar(valvula1);
    }

    private static void mostrar(Valvula v) {
        System.out.println("Válvula " + v.getCodigo()
                + " | apertura: " + v.getApertura() + "%"
                + " | presión: " + v.getPresion()
                + " | activa: " + v.isActiva());
    }
}
