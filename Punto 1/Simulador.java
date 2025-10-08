public class Simulador {

    public static void main(String[] args) {
        OfertaCursosEDCO edco = new OfertaCursosEDCO();

        WebmasterAndrea andrea = new WebmasterAndrea();
        PeriodistaLuzDary luzDary = new PeriodistaLuzDary();
        CommunityManagerLaura laura = new CommunityManagerLaura();

        edco.registrarObservador(andrea);
        edco.registrarObservador(luzDary);
        edco.registrarObservador(laura);
        
        Curso cursoIA = new Curso("Inteligencia Artificial en Educacion", "Aprende a usar IA para aprendizaje."); // 1  
        edco.agregarCurso(cursoIA);

        Curso cursoCiudades = new Curso("Ciudades Inteligentes y Sostenibles", "Urbanismo del futro."); // 2
        edco.agregarCurso(cursoCiudades);

        System.out.println("\nLaura (Community Manager) se desuscribe temporalmente."); // 3
        edco.removerObservador(laura);

        edco.eliminarCurso(cursoIA); // 4
        
        System.out.println("\nLaura (Community Manager) regresa y se vuelve a suscribir."); // 5
        edco.registrarObservador(laura);
        
        Curso cursoPedagogia = new Curso("Pedagogia Decolonial", "nuevas perspectivas educativas."); // 6
        edco.agregarCurso(cursoPedagogia);
    }
}

// En las simulaciones corresponden a:
// 1. EDCO agrega un nuevo curso 
// 2. EDCO agrega otro curso
// 3. Community Manager Laura se desuscribe temporalmente
// 4. EDCO elimina un curso
// 5. Community Manager Laura regresa y se vuelve a suscribir
// 6. EDCO agrega un nuevo curso
