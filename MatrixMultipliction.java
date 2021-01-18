import java.lang.*;

  public class MatrixM

  {
      public Static void main(String arg[ ])
       {
    
       inta[ ][ ] = { {1,1,1},{2,2,2},{3,3,3}};

      intb[ ][ ] ={ {1,1,1},{2,2,2},{3,3,3}};

         intc [ ][ ] = new int [3] [3];

         for(int i=0;i<3 ; i++) 
       {
     for(intj=0;j<3;j++)
        {
        c[i] [j]= 0;
        for(intk=0;k<3;k++)
          {
             c[i] [j]+ =a[i][k]*b[j][k] ;
           }
      System.out.print(c[i][j]+" ");
          }
     System.out.print( );
  }
 
 }
 }