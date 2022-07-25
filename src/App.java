import kfer.*;
public class App {
	
	public static void main(String args[]) { 
  
        CDental mediator = new CDental(); 
        
        Agendarr Ahri = new Agendarr(mediator); 
        Paciente Alfredo = new Paciente(mediator);
        
        mediator.rregistrarAgendarr(Ahri); 
        mediator.registrarPaciente(Alfredo);
        
        Ahri.getReady();
        
        Alfredo.Cita(); 
        Ahri.Cita();
    }
}
