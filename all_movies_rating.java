
public class all_movies_rating
{
    public static double all(int [][]ratings){
     double sum=0;
     double avg= ratings.length*ratings[0].length;
     for(int r=0;r<ratings.length;r++){
        for(int c=0;c<ratings[r].length;c++){
         sum=sum+ratings[r][c];   
        }
        }
        return sum/avg;
    }
    public static void check(){
        int [][]avg={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
        int a =2;
        System.out.print(all(avg));
    }
}
