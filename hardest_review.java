
public class hardest_review
{
    public static double hard(int [][]ratings){
     int sum=0;
     int hard=100;
     int reviewer=0;
     for(int r=0;r<ratings.length;r++){
         for(int c=0;c<ratings[r].length;c++){
             sum=sum+ratings[r][c];
            }
            if(sum<hard){
                hard=sum;
                reviewer=r;
        }
        sum=0;
    }
    return reviewer;
}
 public static void check(){
        int [][]avg={{7,9,4,8},{6,9,3,7},{4,6,2,5}};
        System.out.print(hard(avg));
    }
}
