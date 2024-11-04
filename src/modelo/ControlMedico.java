package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControlMedico {

    private String id, idAnimal, idVeterinario;
    private Date fechaRegistro, fechaUltimaMod;
    private Diagnostico diagnostico;
    private InformeMedico informeMedico;

    public ControlMedico(String id, String idAnimal, String idVeterinario, Date fechaRegistro, Date fechaUltimaMod) {
        this.id = id;
        this.idAnimal = idAnimal;
        this.idVeterinario = idVeterinario;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaMod = fechaUltimaMod;
    }

    public void registrarDiagnostico(Object[] datosDiagnostico, Object[] datosExamenFisico, Object[][] datosSintomas, Object[][] datosMedicamentos) {

        if (datosDiagnostico.length != 0) {

            String descripcion, resultado;

            descripcion = (String) datosDiagnostico[0];
            resultado = (String) datosDiagnostico[1];

            diagnostico = new Diagnostico(descripcion, resultado);

            String estado;
            double temperaturaCorporal;
            int frecuenciaCardiaca;
            Date fechaExamen;

            estado = (String) datosExamenFisico[0];
            temperaturaCorporal = (double) datosExamenFisico[1];
            frecuenciaCardiaca = (int) datosExamenFisico[2];
            fechaExamen = (Date) datosExamenFisico[3];

            diagnostico.registrarExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, fechaExamen);

            if (datosSintomas.length != 0) {
                estado = "";
                String gravedad;

                for (Object[] datosSintoma : datosSintomas) {
                    estado = (String) datosSintoma[0];
                    gravedad = (String) datosSintoma[1];
                    diagnostico.registrarSintoma(estado, gravedad);
                }
            }

            if (datosMedicamentos.length != 0) {
                String nombre;
                double cantidad;
                int intervaloHora, dias;

                for (Object[] datosMedicamento : datosMedicamentos) {
                    nombre = (String) datosMedicamento[0];
                    cantidad = (double) datosMedicamento[1];
                    intervaloHora = (int) datosMedicamento[2];
                    dias = (int) datosMedicamento[3];
                    diagnostico.registrarMedicamento(nombre, cantidad, intervaloHora, dias);
                }
            }

        }

    }

    public void registrarInformeMedico(double peso, double altura, String observaciones) {
        informeMedico = new InformeMedico(peso, altura, observaciones);
    }

    public String getId() {
        return id;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public String getIdVeterinario() {
        return idVeterinario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Date getFechaUltimaMod() {
        return fechaUltimaMod;
    }

}
