package Controladores;

import Modelos.Clientes;
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
         
         //TRAE LA LISTA CLIENTES DESDE EL MODELO
         Queue<Clientes> listalocal = this.ModeloLista.ListarClientes();
         
         //RECORRE LA LISTA Y ASIGNA A TEXT AREA
            String Cadena = "";
         for(Clientes MiListaClientes : listalocal){
             Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombres()+"\n";
             this.VistaLista.txtListaClientes.setText(Cadena);
         }
         
     }        
    }
}
