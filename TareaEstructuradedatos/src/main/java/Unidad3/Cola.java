package Unidad3;

public class Cola {
    
    private CharPrioridad vector[];
    private int ini;
    private int fin;
    
    public Cola(CharPrioridad vector[]){
        this.vector = vector;
        this.ini = -1;
        this.fin = -1;
    }
    
    public boolean insert(CharPrioridad dato){
        if(fin == this.vector.length  -1 && ini == 0){
            return false;
        }
        
        fin++;
        
        if(fin > this.vector.length -1) fin = 0;
        if(ini == -1) ini = 0;
            
        this.vector[fin] = dato;
        
        return true;
    }
    
    public boolean delate(){
        if(this.ini == -1 && fin == -1){
            return false;
        }
        
        if(this.ini == this.fin){
            this.ini = -1;
            this.fin = -1;
            return true;
        }
        
        this.ini++;        
        if(ini > this.vector.length -1) ini = 0;
        
        return true;
    }
    
    public CharPrioridad[] getVectorComplete(){
        return this.vector;
    }
    
    public void setVectorComplete(CharPrioridad[] vector){
        this.vector = vector;
    }
    
    public int getIni(){
        return this.ini;
    }
    
    public int getFin(){
        return this.fin;
    }
}
