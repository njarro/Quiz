
package ejerciciofamilia;

public class Familia {
    private String apellido;
    private Persona[] miembros;
    
    public Familia ( String apellido ) {
        this.apellido = apellido;
        this.miembros = new Persona[4];
    }
    
    public String consultarFamilia( String apellido ) {
        
        if (apellido.equals(this.apellido)) {
            String infoCompleta = "";
            for (int i = 0; i < 4; i++) {
                infoCompleta += "Rol: " + miembros[i].getRol() + "\n";
                infoCompleta += miembros[i].getInfoCompleta();
            }
            return infoCompleta;
        }
        return "Este apellido no pertenece a alguna familia registrada.";
    }
    
    public String consultarMiembro( String nombre ) {
        String infoCompleta = "";
        int posicion = 0;
        boolean encontrado = false;
        for (int i = 0; i < 4; i++) {
            if (nombre.equals(miembros[i].getNombre())) {
                encontrado = true;
                infoCompleta += "Informacion del miembro:\n" + miembros[i].getInfoCompleta();
                posicion = i;
            }
        }
        
        if (encontrado) {
            for (int i = 0; i < 4; i++) {
                if (posicion != i) {
                    if (i < 2) infoCompleta += "Parentezco: " + miembros[i].getRol() + "\n";
                    else {
                        infoCompleta += "Parentezco: ";
                        infoCompleta += ((miembros[i].getSexo()).equals("Masculino")) ? "Hermano\n":"Hermana\n";
                    }
                    infoCompleta += miembros[i].getInfoCompleta();
                }
            }
            return infoCompleta;
        } else {
            return "No existe un integrante con el nombre ingresado.";
        }
        
    }
    
    public boolean agregarMiembro( String nombre, String apellido, int edad, int sexo, int rol ) {
        if (miembros[rol] == null) {
            String rol_p = "", sexo_p;
            switch (rol) {
                case(0):
                    rol_p = "Padre";
                    break;
                case(1):
                    rol_p = "Madre";
                    break;
                case(2):
                    rol_p = "Hijo mayor";
                    break;
                case(3):
                    rol_p = "Hijo menor";
                    break;
            }
            if (sexo == 1) sexo_p = "Masculino";
            else sexo_p = "Femenino";

            miembros[rol] = new Persona( nombre, apellido, edad, sexo_p, rol_p );
            return true;
        } else return false;
    }
    
    public String getApellido() {
        return apellido;
    }
}
