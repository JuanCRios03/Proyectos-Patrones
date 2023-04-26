package observador;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
   class ObserverPatternEx {

        public static void main(String[] args) {
           
            //crear un observador y un sujeto
            Observer ob1 = new Observer();
            Observer ob2 = new Observer();
            Subject sub = new Subject();
            
            //// Se registra el observador en el sujeto
            System.out.println("Registrando un observador");
            sub.register(ob1);
            
            //Cambiar el estado de flag
            System.out.println("Estado inicial de flag: " + sub.getFlag());
            sub.setFlag(1);
            
            //cambiamos la configuracion del flag y se lo notificamos al observador
            System.out.println("estado del Flag = 10 ");
            sub.setFlag(10);
            
            //Cambiamos la configuracion del flag y de nuevamente se lo notificamos al observador
            System.out.println("estado del Flag = 20 " );
            sub.setFlag(20);
            
            // Desregistramos el observador del sujeto
            sub.unregister(ob1);
            //Cambiamos la configuracion del flag pero no se notifica porque desregistramos el observador
            System.out.println("estado del Flag = 30 ");
            sub.setFlag(20);
            //Suscribr el nuevo observador 2
            System.out.println("Registrando observador 2");
            sub.register(ob2);
            
            //Cambiar el estado de flag
            System.out.println("Estado inicial de flag: " + sub.getFlag());
            sub.setFlag(2);
            
            //cambiamos la configuracion del flag y se lo notificamos al obsrvador
            System.out.println("estado del Flag = 15 ");
            sub.setFlag(15);
            
            //cambiamos la configuracion del flag y nuevamente se lo notificamos al observador
            System.out.println("estado del Flag = 30 ");
            sub.setFlag(30);
            
            // Desregistramos el observador del sujeto
            sub.unregister(ob2);
            
            //Cambiamos la configuracion del flag pero no se notifica porque desregistramos el observador
            System.out.println("estado del Flag = 45 ");
            sub.setFlag(45);
            
            
            
            
        }
    }