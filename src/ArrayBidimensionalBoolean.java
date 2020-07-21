public class ArrayBidimensionalBoolean {

    private boolean [][] myArrayBoolean;

    public ArrayBidimensionalBoolean(int filas,int columnas){
        myArrayBoolean= new boolean[filas][columnas];
    }

    public void rellenar(){
        if(myArrayBoolean.length%2==1){
            for (int i = 0; i < myArrayBoolean.length; i++) {
                for (int j = 0; j < myArrayBoolean.length; j++) {
                    if(i==myArrayBoolean.length/2 && j==myArrayBoolean.length/2){
                        myArrayBoolean[i][j]=true;
                    }else{
                        myArrayBoolean[i][j]=false;
                    }
                }
            }
        }else{
            for (int i = 0; i < myArrayBoolean.length; i++) {
                for (int j = 0; j < myArrayBoolean.length; j++) {
                   if((i==(myArrayBoolean.length/2)||i==(myArrayBoolean.length/2)-1) &&
                           j==(myArrayBoolean.length/2)||j==(myArrayBoolean.length/2)-1){
                       myArrayBoolean[i][j]=true;
                   }else{
                       myArrayBoolean[i][j]=false;
                   }
                }
            }
        }

    }

    public void draw(){
        for (int i = 0; i < myArrayBoolean.length; i++) {
            for (int j = 0; j < myArrayBoolean.length; j++) {
                System.out.print(myArrayBoolean[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
