
import Controladores.ListaControler;
import Modelos.ListaModel;
import Vistas.frmListas;


public class main {

    public static void main(String[] args) {
       
       frmListas VistaLista = new frmListas(null, true);
       ListaModel ModeloLista = new ListaModel();
       
       ListaControler ControladorLista = new ListaControler(VistaLista, ModeloLista);
    }
}
