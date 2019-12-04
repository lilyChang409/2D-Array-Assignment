
public class movie_average_rating
{
    public static double movieAvgRating(int [][] ratings, int movie){
        double sum=0;
        for(int r=0;r<ratings.length;r++){
            sum=sum+ratings[r][movie];
        }
        
       return sum/ratings.length;
    }
    public static void check(){
          int [][]avg={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
        int movie=2;
        int rate=movieAvgRating(avg,movie);
    System.out.print("movie"+movie+"'s average is:"+rate);
    }
}
