public class c03conversionexplicita {
    public static void main(String[] args) {
        // La conversión explícita o casting
        // utiliza la sintaxis (tipo-destino)
        // Excepto boolean y conversion de objeto a primitivo
        // Ojo, el casting puede dar resultados inesperados
        int variable1 = 1222222;
        byte variable2 = (byte)variable1;
        System.out.println(variable2);
        // No se puede hacer con booleans
        boolean esMayorEdad = false;
        // int variable3 = (int)esMayorEdad; Error
        // No podemos castear un objeto a primitivo
        String variable4 = "Juan";
        // char variable5 = (char)variable4; Error
    }
}
