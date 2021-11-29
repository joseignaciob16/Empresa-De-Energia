
/** @author Jose Ignacio */

public class Modelo {

    int NumUsuarios;
    int IdPropietario[];
    String Propietario[];
    String Direccion[];
    String Telefono[];
    int Estrato[];
    float Consumo[];

   public Modelo(int c) {
        NumUsuarios = c;
        IdPropietario = new int[NumUsuarios];
        Propietario = new String[NumUsuarios];
        Direccion = new String[NumUsuarios];
        Telefono = new String[NumUsuarios];
        Estrato = new int[NumUsuarios];
        Consumo = new float[NumUsuarios];
    }
   
    public int TraeCantUsuarios() {
        return NumUsuarios;
    }

    public void LlevaId(int id, int pos) {
        IdPropietario[pos] = id;
    }

    public int TraeId(int pos) {
        return IdPropietario[pos];
    }

    public void LlevaPropietario(String Nom, int pos) {
        Propietario[pos] = Nom;
    }

    public String TraePropietario(int pos) {
        return Propietario[pos];
    }

    public void LlevaDireccion(String dir, int pos) {
        Direccion[pos] = dir;
    }

    public String TraeDireccion(int pos) {
        return Direccion[pos];
    }

    public void LlevaTelefono(String tel, int pos) {
        Telefono[pos] = tel;
    }

    public String TraeTelefono(int pos) {
        return Telefono[pos];
    }

    public void LlevaEstrato(int estr, int pos) {
        Estrato[pos] = estr;
    }

    public int TraeEstrato(int pos) {
        return Estrato[pos];
    }
    
    public void LlevaConsumo(float consu, int pos) {
        Consumo[pos] = consu;
    }

    public float TraeConsumo(int pos) {
        return Consumo[pos];
    }
   
    public int BuscaCodigo(int Codi) {
        int posicion = -1;
        int i = 0;
        while ((i < TraeCantUsuarios()) && (posicion == -1)) {
            if (IdPropietario[i] == Codi) {
                posicion = i;
            } else {
                i++;
            }
        }
       return posicion;
    }          
}
    
    

   


