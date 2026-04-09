public class Organo {
    private final int idPaciente;
    private String estado;

    public Organo(int idPaciente, String estado) {
        this.idPaciente = idPaciente;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("ID del paciente: " + idPaciente + ", Estado:" + estado);
    }
}

class Corazon extends Organo {
    private int frecuenciaCardiaca;

    public Corazon(int idPaciente, String estado, int frecuenciaCardiaca) {
        super(idPaciente, estado);
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("La frecuencia cardiaca es: " + frecuenciaCardiaca);
    }

    public void comprobarFrecuenciaCardiaca() {
        if (frecuenciaCardiaca < 60) {
            System.out.println("La frecuencia cardiaca es baja.");
        } else if (frecuenciaCardiaca > 100) {
            System.out.println("La frecuencia cardiaca es alta.");
        } else {
            System.out.println("La frecuencia cardiaca es normal.");
        }
    }
}

class Pulmon extends Organo {
    private int capacidadPulmonar;

    public Pulmon(int idPaciente, String estado, int capacidadPulmonar) {
        super(idPaciente, estado);
        this.capacidadPulmonar = capacidadPulmonar;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("La capacidad pulmonar es: " + capacidadPulmonar);
    }
}