package kfer;

public class Paciente implements CCD { 
    private CDental mediator; 
  
    public Paciente(CDental mediator) { 
        this.mediator = mediator; 
        mediator.setCitaStatus(false); 
    } 
  
    @Override
    public void Cita() { 
        System.out.println("Cita agendada con exito."); 
        mediator.setCitaStatus(true); 
    } 
}
