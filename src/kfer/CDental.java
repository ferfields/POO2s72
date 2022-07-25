package kfer;

public class CDental {
	private Agendarr agendar; 
    private Paciente paciente; 
    public boolean Cita; 
  
    public void registrarPaciente(Paciente paciente) { 
        this.paciente = paciente; 
    } 
  
    public void rregistrarAgendarr(Agendarr agendarr) { 
        this.agendar = agendarr; 
    } 
  
    public boolean isCitaOk() { 
        return Cita; 
    } 
  
    public void setCitaStatus(boolean status) { 
        Cita = status; 
    }
}