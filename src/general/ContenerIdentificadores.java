package general;

import java.io.Serializable;
import libs.SerializadoraGEN;

/**
 * @author Leonidas Garcia Lescano
 */
public class ContenerIdentificadores implements Serializable {

    private int idCtrlMedico =1, idCtrlOpr = 1, idHistorias = 1;

    public int getIdCtrlMedico() {
        return idCtrlMedico;
    }

    public int getIdCtrlOpr() {
        return idCtrlOpr;
    }

    public int getIdHistorias() {
        return idHistorias;
    }

    public void setIdCtrlMedico(int idCtrlMedico) {
        this.idCtrlMedico = idCtrlMedico;
    }

    public void setIdCtrlOpr(int idCtrlOpr) {
        this.idCtrlOpr = idCtrlOpr;
    }

    public void setIdHistorias(int idHistorias) {
        this.idHistorias = idHistorias;
    }

}
