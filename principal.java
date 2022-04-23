import java.util.Scanner;
import java.util.Random;
public class principal{
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int reglas = sc.nextInt();
    public static void main(String[] args){
        principal.mostrarMenu();
    }
    public static void mostrarMenu(){
        Zombie z1 = new Zombie();
        Ubicacion u1 = new Ubicacion();
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese un número:\n "
                 + "De acuerdo al número ingresado:\n"
                 + "Si ingresa 0 la ejecución se detendrá\n"
                 + "Si ingresa 1 se agregará un nuevo zombie\n"
                 + "Si ingresa 2 se mostrará por pantalla la información de todos los zombies almacenados hasta el momento\n"
                 + "Si ingresa 3 se mostrará por pantalla la información de la cantidad de zombies creados hasta el momento\n"
                 + "Si ingresa 4 se mostrará por pantalla la información de todos los zombies que tengan tipo de sangre O+ o AB+\n"
                 + "Si ingresa 5 se mostrará por pantalla la información de todos los zombies que nacieron después del 2000\n"
                 + "Si ingresa 6 se disminuye a la mitad la salud de todos los zombies\n"
                 + "Si ingresa 7 se agregará una ubicación\n"
                 + "Si ingresa 8 se mostrará la información de todas las ubicaciones almacenadas hasta el momento\n"
                 + "Si ingresa 9 se mostrará la información de la ubicación mas segura de la ciudad\n"
                 + "Si ingresa 10 se mostrará la información de todas las ubicaciones de la ciudad ordenadas de menor a mayor a Alexandria\n"
                 + "Si ingresa 11 se mostrará por pantalla una frase aleatoria sobre zombies\n"
                 + "Si ingresa 12 se mostrará\n");   
        
         Menu:
         while(true){
            int reglas = sc.nextInt();
  
            Switch:
            switch(reglas){
                case 0:
                    break Menu;
                case 1:    
                Zombie z2 = new Zombie();
                System.out.println("ingrese nombre");
                String nombre =  sc.next();
                z2.setNombre(nombre);
                System.out.println("ingrese salud");
                int salud =  sc.nextInt();
                z2.setSalud(salud);
                System.out.println("ingrese fecha de nacimiento en formato AAAA/MM/DD");
                String fechaNacimiento =  sc.next();
                z2.setFechadeNacimiento(fechaNacimiento);
                System.out.println("ingrese tipo de sangre");
                String TipoSangre =  sc.next();
                z2.setTipodeSangre(TipoSangre);
                z1.setBasedeDatosZombies(z2);                
                break Switch;
                case 2:
                for(int i = 0; i < z1.getBasedeDatosZombies().size(); i++){
                    System.out.println( z1.getBasedeDatosZombies().get(i)); 
                }
                break Switch;
                case 3:
                    System.out.println(z1.contadorZombies);
                break Switch;
                case 4:
                String comparador;
                for(int i = 0; i < z1.getBasedeDatosZombies().size(); i++){
                comparador = z1.getBasedeDatosZombies().get(i).getTipodeSangre();
                    if(comparador.equals("O+") || comparador.equals("AB+")){
                        System.out.println(z1.getBasedeDatosZombies().get(i));
                    }
                } 
                break Switch;
                case 5:
                for(int i = 0; i < z1.getBasedeDatosZombies().size(); i++){
                String nacimientoEspecifico;
                
                nacimientoEspecifico = z1.getBasedeDatosZombies().get(i).getFechadeNacimiento().substring(0, 4);
                int convertidor = Integer.valueOf(nacimientoEspecifico);
                     if(convertidor > 2000){
                        System.out.println(z1.getBasedeDatosZombies().get(i));
                    }
                }
                break Switch;
                case 6:
                for(int i = 0; i < z1.getBasedeDatosZombies().size(); i++){
                int disminuirVida;
                disminuirVida = z1.getBasedeDatosZombies().get(i).getSalud();
                z1.getBasedeDatosZombies().get(i).setSalud(disminuirVida/2);
                }  
                break Switch;
                case 7:
                    Ubicacion u2 = new Ubicacion();
                System.out.println("ingrese nombre");
                String Nombre =  sc.next();
                u2.setNombre(Nombre);
                System.out.println("ingrese Distancia en metros");
                float Distancia =  sc.nextInt();
                u2.setDistancia(Distancia);
                System.out.println("ingresecantidad de zombies en la zona");
                int CantidadZombies =  sc.nextInt();
                u2.setCantidadZombies(CantidadZombies);
                u1.setBasedeDatosUbicacion(u2);
                break Switch;
                case 8: 
                    for(int i = 0; i < u1.getBasedeDatosUbicacion().size(); i++){
                    System.out.println( u1.getBasedeDatosUbicacion().get(i)); 
                }
                break Switch;
                case 9:
                    
                    Ubicacion m = u1.BaseDeDatosUbicacion.get(0);
                    
                    for(int i = 1; i < u1.BaseDeDatosUbicacion.size(); i++){
                        
                        if(u1.BaseDeDatosUbicacion.get(i).getCantidadZombies() < m.getCantidadZombies() ){
                            m = u1.BaseDeDatosUbicacion.get(i);
                        }
                        
                    }
                    System.out.println("La ubicacion mas segura es " + m);
                    
                break Switch;
                case 10:
                
                case 11:
                String[] fraseAleatoria = new String[5];
                fraseAleatoria[1] = "Estas rodeado de zombies, esas son las malas noticias";
                fraseAleatoria[2] = "Cuando los muertos echan a andar, ¿para qué obstinarse en matarlos? No hay formas de vencerlos";
                fraseAleatoria[3] = "Viven para la noche, viven para matar, y ... viven siempre";
                fraseAleatoria[4] = "Cuando ya no quede sitio en el infierno, los muertos caminarán por la tierra";
                fraseAleatoria[5] = "¡Odio las momias, nunca juegan limpio!";
                Math.random();
                }
            }
        }
    }