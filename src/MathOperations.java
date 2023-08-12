public class MathOperations {
    public static void main(String[] args){
        double pow  = Math.pow(2, 2);
        System.out.println("Pow: " + pow);

        System.out.println("PI: " + Math.PI);

        System.out.println("ceil: " + Math.ceil( 1.1 ));
        System.out.println("floor: " + Math.floor( 1.1 ));
        System.out.println("round: " + Math.round( 1.1 ));
        System.out.println("sqrt: " + Math.max(16, 2) );
        System.out.println(": " + Math.max(5, 2) );

        /*
        *
            CONVERSIONES ENTRE TIPOS
            NO PERDEMOS INFORMACIÓN
            De char —> int.
            De byte —> short —> int —> long
            De int —> double
            De float —> double
            PERDEMOS INFORMACIÓN
            De int —> float
            De long —> float
            De long —> double
        * */

    }
}
