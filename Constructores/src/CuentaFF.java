
import java.util.UUID;

public class CuentaFF {
    //Atributos
    UUID id;
    String nombre;
    String email;
    boolean activo;



    //Constructor canonico
    public CuentaFF(String nombre,String email){
        this(UUID.randomUUID(),nombre,email);

    }
    public CuentaFF(UUID id, String nombre,String email){
        this(id,nombre,email,true);

    }
    public CuentaFF(UUID id, String nombre, String email, boolean activo){
        this.nombre=nombre;
        this.email=email;
        this.id=id;
        this.activo=activo;
    }
    public void radiografia(){
        String reporte= """
                Id: %s
                Nombre: %s
                Email: %s
                Ativa: %b
                """;
        System.out.println(reporte.formatted(this.id,this.nombre,this.email,this.activo));
    }







}
