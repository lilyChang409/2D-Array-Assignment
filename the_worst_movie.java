
public class the_worst_movie
{
    public static double worst(int [][]ratings){
        int sum=0;
        int x=0;
        int hard=100;
        int movie=0;
      while (x<ratings.length){
       for(int c=0;c<ratings[x].length;c++){
           sum=sum+ratings[x][c];
        }
        if(sum<hard){
            hard=sum;
            movie=x;
    }
      x+=1;
      sum=0;
    }
    return movie;
}
     public static void check(){
        int [][]avg={{1,2,1,1},{0,1,1,1},{4,6,2,5}};
        System.out.print(worst(avg));
    }
}
