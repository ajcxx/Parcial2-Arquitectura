/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.CloseEvent;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
 
@ManagedBean
@ViewScoped
@RequestScoped
public class DashboardView implements Serializable {
     
    private DashboardModel model;
     
    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
         
        column1.addWidget("horas_contadas");
        column1.addWidget("zootopia");
        column1.addWidget("dioses_de_egipto");
        
        column2.addWidget("deadpool");
        column2.addWidget("zoolander");
        column2.addWidget("la_jugada_maestra");
        
        column3.addWidget("el_renacido");
        column3.addWidget("el_bosque_siniestro");
        column3.addWidget("las_aparicio");
        
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
    }
     
    public void handleReorder(DashboardReorderEvent event) {
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        message.setSummary("Reordered: " + event.getWidgetId());
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex()
                + ", Sender index: " + event.getSenderColumnIndex());
         
        addMessage(message);
    }
     
    public void handleClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'"
                + event.getComponent().getId() + "'");
         
        addMessage(message);
    }
     
    public void handleToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() 
                + " toggled", "Status:" + event.getVisibility().name());
         
        addMessage(message);
    }
     
    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public DashboardModel getModel() {
        return model;
    }
    
    public String navega() {
        int numero=1;
      if (numero<=2) {
         return "Cine2.xhtml";
      } else {
         return "Cine1.xhtml";
      }
   }
     public String regresa() {
        int numero=1;
      if (numero<=2) {
         return "Cine1.xhtml";
      } else {
         return "Cine2.xhtml";
      }
   }
     
     //Empieza compra de boletos
     private String nombre;
     private String tarjeta;
     private String pelicula;
     private String boletos;
     
      public String comprar() {
        int numero=1;
      if (numero<=2) {
         return "Cine3.xhtml";
      } else {
         return "Cine1.xhtml";
      }
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getBoletos() {
        return boletos;
    }

    public void setBoletos(String boletos) {
        this.boletos = boletos;
    }
}