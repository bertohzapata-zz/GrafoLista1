/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafolista;

/**
 *
 * @author bertohzapata
 */
public class GrafoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grafo grafoLista = new Grafo(5);
        grafoLista.nuevoVertice("1");
        grafoLista.nuevoVertice("2");
        grafoLista.nuevoVertice("3");
        grafoLista.nuevoVertice("4");
        grafoLista.nuevoVertice("5");
        
        try {
            grafoLista.nuevoArco("1", "3");
            grafoLista.nuevoArco("1", "4");
            
            grafoLista.nuevoArco("5", "1");
            grafoLista.nuevoArco("5", "2");
            grafoLista.nuevoArco("5", "4");
            
            for (int i = 0; i < grafoLista.tablAdc.length; i++) {
                System.out.println("Posición del vector: " + i);
                for (int j = 0; j < grafoLista.tablAdc[i].lad.size(); j++) {
                    System.out.println(grafoLista.tablAdc[i].lad.get(j));
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
