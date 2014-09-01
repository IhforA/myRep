package tic_tac_toe;

public class Field {
    final int size = 6;
    boolean counter; //define whos turn
    private int[] F; // 0=empty_cell; 1=X's_cell; 2=0's_cell
    
    Field()
    {
        counter = true; // true=X's_turn false=0's_turn
        F = new int [size];
        for(int i : F) i=0;
    }
        
//        for(int i = 0; i<size; i++)
//        {for(int j = 0; j<size; j++)
//            {F[i][j]=0;}
    
    public boolean turn(int cell)
    {
        if(F[cell]==0) 
        {
            if(counter) F[cell]=1;
            else F[cell]=2;
            counter = !counter;
            return true;
        }
        else{return false;}
    }
    
    public boolean check()
    {
        
    }
    
}

   