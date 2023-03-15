package Controladores;

import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class ListaControler implements ActionListener{
    
    frmListas VistaLista;
    ListaModel ModeloLista;

    public ListaControler(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        //PONER A LA ESCUCHA BOTONES
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        //LEVANTAR VISTA LISTA
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }    
    @Override
    public void actionPerformed(ActionEvent e){
     if(e.getSource() == this.VistaLista.btnIngresarCliente){
         this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                 this.VistaLista.txtNombre.getText());
         
        //MOSTRAR LOS DATOS EN EL TEXT AREA
         Queue ListaLocal = this.ModeloLista.ListarClientes();
         this.VistaLista.txtListaClientes.setText(ListaLocal.peek().toString());
     }        
    }
}
