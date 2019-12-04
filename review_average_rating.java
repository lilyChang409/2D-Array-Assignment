
public class review_average_rating
{
    public static double reviewAvgRating(int[][] ratings, int review){
        double sum=0;
        double cols=ratings[review].length;
            for (int r=0;r<ratings[review].length;r++){
                     sum=sum+ratings[review][r];
            }
             sum=sum/cols;
            return sum;
    
    }
    public static void check(){
        int [][]avg={{4,6,2,5},{7,9,4,8},{6,9,3,7}};
        int a =2;
    System.out.print(reviewAvgRating(avg,a));
    }
    }

