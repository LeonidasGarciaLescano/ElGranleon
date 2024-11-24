package controladorVetZoo;

import estilos.Fuente;
import general.Utilidades;
import modeloDiagnostico.Diagnostico;
import vista.frmVerDiagnostico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerDiagnostico {

    private frmVerDiagnostico vistaDiagnostico;

    public ControladorVerDiagnostico(Diagnostico diagnostico) {
        vistaDiagnostico = new frmVerDiagnostico();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaDiagnostico.getContentPane());
        vistaDiagnostico.TxtAreaDescripcion.setText(diagnostico.getDescripcion());
        vistaDiagnostico.TxtResultado.setText(diagnostico.getResultado());

        if (diagnostico.getExamenFisico() != null) {
            vistaDiagnostico.TxtEstado.setText(diagnostico.getExamenFisico().getEstado());
            vistaDiagnostico.TxtTemperatura.setText(String.valueOf(diagnostico.getExamenFisico().getTemperaturaCorporal()));
            vistaDiagnostico.TxtFrecuencia.setText(String.valueOf(diagnostico.getExamenFisico().getFrecuenciaCardiaca()));
            vistaDiagnostico.TxtFechaExamen.setText(diagnostico.getExamenFisico().getFechaExamen().toString());
        }

        if (diagnostico.getSintomas().obtenerArreglo() != null) {
            Utilidades.llenarTablaSintomas(vistaDiagnostico.TblSintomas, diagnostico.getSintomas());
        }

        if (diagnostico.getMedicamentos().obtenerArreglo() != null) {
            Utilidades.llenarTablaMedicamentos(vistaDiagnostico.TblReceta, diagnostico.getMedicamentos());
        }

    }

    public void run() {
        vistaDiagnostico.setVisible(true);
    }

}
