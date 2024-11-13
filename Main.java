public class Main {
    public static void main(String[] args) {
        int [][] multipTable=new int[10][10];
        for (int i=0;i< multipTable.length;i++){
            for (int j=0;j< multipTable[i].length;j++){
                multipTable[i][j]=(i+1)*(j+1);
            }
        }
        for (int i=0;i< multipTable.length;i++){
            System.out.println();
            for (int j=0;j< multipTable[i].length;j++){
                System.out.print(multipTable[i][j]+" ");
            }
        }
    }
}