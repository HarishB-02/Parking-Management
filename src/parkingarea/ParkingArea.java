package parkingarea;

public class ParkingArea {
    
    private static final int[][] arr=new int[10][10];

    public ParkingArea(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j%2==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
    }

    public static String allocateSlot(){

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                    char row = (char)(65-i);
                    String column = Integer.toString(j+1);
                    System.out.println(row+column);
                    return row + column;
                }
            }
        }

        return "";
    }   
}
