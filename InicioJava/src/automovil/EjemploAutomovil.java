package automovil;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor( 2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL );
        Automovil mazda = new Automovil("Mazda","BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45 ));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();

        //Agregar ruedas para auto subaru
        for (int i = 0; i < 5; i++) {
            subaru.addRueda(new Rueda("Rueda 1", 16, 7.5));
            subaru.addRueda(new Rueda("Rueda 2", 16, 7.5));
        }

        //Agregar ruedas para auto mazda
        for (int i = 0; i < 5; i++) {
            mazda.addRueda(new Rueda("Rueda 3", 16, 7.5));
            mazda.addRueda(new Rueda("Rueda 4", 16, 7.5));
        }

        //Agregar ruedas para auto nissan
        Rueda [] ruedasNissan = {
                new Rueda("Rueda 5", 16, 7.5),
                new Rueda("Rueda 6", 16, 7.5),
        };
        nissan.setRuedas(ruedasNissan);

        System.out.println("¿Son iguales? " + (nissan == nissan2));
        System.out.println("¿Son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro = " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro = " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilómetros por litro = " + nissan.calcularConsumo(300, 60));
    }
}
