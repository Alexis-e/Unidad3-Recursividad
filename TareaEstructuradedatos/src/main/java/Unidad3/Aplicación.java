package Unidad3;

public class Aplicación {
    
    public static void main(String args[]){
        
        CharPrioridad object1 = new CharPrioridad('e' , 2);
        CharPrioridad object2 = new CharPrioridad('c' , 3);
        CharPrioridad object3 = new CharPrioridad('d' , 3);
        CharPrioridad object4 = new CharPrioridad('a' , 3);
        CharPrioridad object5 = new CharPrioridad('b' , 3);
        CharPrioridad object6 = new CharPrioridad('f' , 2);
        CharPrioridad object7 = new CharPrioridad('i' , 1);
        CharPrioridad object8 = new CharPrioridad('h' , 2);
        CharPrioridad object9 = new CharPrioridad('j' , 1);
        CharPrioridad object10 = new CharPrioridad('g' , 1);
        
        CharPrioridad object11 = new CharPrioridad('k' , 1);
        CharPrioridad object12 = new CharPrioridad('Ñ' , 3);
        CharPrioridad object13 = new CharPrioridad('m' , 1);
        
        CharPrioridad[] vector = new CharPrioridad[10];
        Prioridad Cola1 = new Prioridad(vector);
        
        Cola1.insert(object1);
        Cola1.insert(object2);
        Cola1.insert(object3);
        Cola1.insert(object4);
        Cola1.insert(object5);
        Cola1.insert(object6);
        Cola1.insert(object7);
        Cola1.insert(object8);
        Cola1.insert(object9);
        Cola1.insert(object10);
        
        Cola1.delate();
        Cola1.delate();
        Cola1.delate();
        
        Cola1.insert(object11);
        Cola1.insert(object12);
        Cola1.insert(object13);
        
        CharPrioridad[] vector2 = Cola1.getVectorComplete();
        
        for(int i = Cola1.getIni(); i < Cola1.getFin(); i++){
            if(i > vector2.length -1){ 
                i = 0;
            }
            System.out.println(vector2[i].getDato() + " + " + vector2[i].getNivel());
        }
    }
}
