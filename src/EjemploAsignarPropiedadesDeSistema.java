import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps =  System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties"));
            System.out.println(System.getProperty("config.puerto.servidor"));

            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("No existe el archivo  = " + e);
        }

    }
}
