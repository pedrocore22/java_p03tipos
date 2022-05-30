public class c02conversionimplicita {
    public static void main(String[] args) {
        // Los cambios de tipos en Java se realizan de dos
        // formas: Implícita (sin código) o Explícita (casting)
        // Forma Implícita
        // 1.- Todos los primitivos se pueden convertir excepto boolean
        // 2.- El tipo de destino debe tener mayor o igual tamaño que el
        // de origen
        // 3.- El tipo de origen es numérico y el de destino char no compilará
        // 4.- El tipo de origen es flotante y el de destino entero no compilará
        short a = 2;
        int b = a; // OK
        char c = 'A';
        int d = c; // OK
        System.out.println(d);
        int e = 13;
        double f = e; // OK
        // Ejemplos de incumplimientos
        boolean esMayorEdad = false;
        // int g = esMayorEdad; Error porque boolean no se puede convertir
        int h = 20;
        // short i = h; Error porque short es más pequeño que int
        // char j = h; Error origen numérico y destino char
        float k = 13.4f;
        // int m = k; Error origen flotante y destino entero
    }

    
}
