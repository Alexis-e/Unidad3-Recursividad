package Unidad3;

public class Prioridad extends Cola{
    
    public Prioridad(CharPrioridad[] vector) {
        super(vector);
    }
    
    @Override
    public boolean insert(CharPrioridad dato){
        boolean value = super.insert(dato);
        
        if(value = false){
            return value;
        }
        
        priorityAnalitics(super.getVectorComplete());
        return value;
    }
    
    private void priorityAnalitics(CharPrioridad ArrayPrioridad[]){
        int t1 = super.getFin();
        int t2 = t1 -1;
        
        if(t1 < 0){
            t1 = ArrayPrioridad.length -1;
        }

        if(t2 < 0){
            t2 = ArrayPrioridad.length -1;
        }
        
        for(t1 = super.getFin(); t1 != super.getIni() && ArrayPrioridad[t1].getNivel() > ArrayPrioridad[t2].getNivel(); t1--){            
            t2 = t1 - 1;
            
            if(t1 < 0){
                t1 = ArrayPrioridad.length -1;
            }

            if(t2 < 0){
                t2 = ArrayPrioridad.length -1;
            }

            CharPrioridad backup;

            backup = ArrayPrioridad[t1];                   
            ArrayPrioridad[t1] = ArrayPrioridad[t2];          
            ArrayPrioridad[t2] = backup;           
        }
        
        super.setVectorComplete(ArrayPrioridad);
    }

    @Override
    public int getIni() {
        return super.getIni();
    }

    @Override
    public int getFin() {
        return super.getFin();
    }   
}
