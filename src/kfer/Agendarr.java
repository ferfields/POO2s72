package kfer;

import java.io.ObjectInputFilter.Status;

public class Agendarr implements CCD {
    private CDental mediator; 
  
    public Agendarr(CDental mediator) { 
        this.mediator = mediator; 
    } 
  
    public void Cita() { 
        if (mediator.isCitaOk()) { 
            System.out.println("Agendado Con Exito!."); 
            mediator.setCitaStatus(true); 
        
        } else {
            System.out.println("Esperando para agendar");
        }
    } 
  
    public void getReady() { 
        System.out.println("Listo para Agendar"); 
    }
}