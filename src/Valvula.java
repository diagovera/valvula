public class Valvula {

    private String codigo;
    private int apertura;
    private double presion;
    private boolean activa;

    public Valvula(String codigo, int apertura, double presion) {
        this.codigo = codigo;
        setApertura(apertura);
        setPresion(presion);
        this.activa = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getApertura() {
        return apertura;
    }

    public double getPresion() {
        return presion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setApertura(int apertura) {
        if (apertura < 0 || apertura > 100) {
            throw new IllegalArgumentException("La apertura debe estar entre 0 y 100.");
        }
        this.apertura = apertura;
    }

    public void setPresion(double presion) {
        if (presion < 0) {
            throw new IllegalArgumentException("La presión no puede ser negativa.");
        }
        this.presion = presion;
    }

    public void activar() {
        if (activa) {
            System.out.println("La válvula " + codigo + " ya está activa.");
        } else {
            activa = true;
            System.out.println("La válvula " + codigo + " ha sido activada.");
        }
    }

    public void desactivar() {
        if (!activa) {
            System.out.println("La válvula " + codigo + " ya está desactivada.");
        } else {
            activa = false;
            System.out.println("La válvula " + codigo + " ha sido desactivada.");
        }
    }
}
