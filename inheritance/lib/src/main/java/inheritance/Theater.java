package inheritance;

import java.util.ArrayList;
import java.util.HashSet;

public class Theater{
    String []arrMovie={"PIG","DEAD PIGS","JOE ORIGINS","A NEW LEGACY","BLACK WIDOW"};
    HashSet<String>Movie=new HashSet<>();
    private int numberStar=0;
    private int oldStar=0;
    ArrayList<Integer> starAvg=new ArrayList<Integer>();
    ArrayList<String>allReview=new ArrayList<String>();;
    String nameOfMovie;


    public void arrOfMovie(){

        for (int i = 0; i < arrMovie.length; i++) {
            Movie.add(arrMovie[i].toUpperCase());
        }
    }
    public void addMovie(String name){
        if (Movie.size()==0){
            arrOfMovie();
           Movie.add(name.toUpperCase());
        }else {
            Movie.add(name.toUpperCase());

        }

    }

    public void removeMovie(String name){
        if(Movie.size()==0){

            arrOfMovie();
            if (Movie.contains(name.toUpperCase())){
                Movie.remove(name.toUpperCase());
            }else {
                System.out.println("please select from movie list:...");
                for (String s : Movie) {
                    System.out.println(s);
                }
            }
        }else if(Movie.contains(name.toUpperCase())){
                Movie.remove(name.toUpperCase());
            }else {
                System.out.println("please select from movie list:...");
                for (String s : Movie) {
                    System.out.println(s);
                }
            }

        }
//
    public void addReview(String name,String bodies, String authors, int stars){
//        System.out.println(this.nameOfMovie);

    if(Movie.size()==0){

        if(Movie.contains(name.toUpperCase())){
            this.nameOfMovie=name.toUpperCase();
            if(stars>=5){
                stars=5;
            }else if(stars<=0){
                stars=0;
            }
            this.oldStar=this.numberStar;
            starAvg.add(stars);
            int sum=0;
            for (int i = 0; i < starAvg.size(); i++) {
                sum+=starAvg.get(i);
            }
            this.numberStar=sum/starAvg.size();
            Review review=new Review(name,bodies,authors,this.numberStar);
            allReview.add(review.ReviewResult);
            System.out.println(addReviewTest());
        }else{
            System.out.println("please select from movie list:...");
            for (String s : Movie) {
                System.out.println(s);
            }
        }
    }else{
        if(Movie.contains(name.toUpperCase())){
            this.nameOfMovie=name.toUpperCase();
            if(stars>=5){
                stars=5;
            }else if(stars<=0){
                stars=0;
            }
            this.oldStar=this.numberStar;
            starAvg.add(stars);
            int sum=0;
            for (int i = 0; i < starAvg.size(); i++) {
                sum+=starAvg.get(i);
            }
            this.numberStar=sum/starAvg.size();
            Review review=new Review(name,bodies,authors,this.numberStar);
            allReview.add(review.ReviewResult);
            System.out.println(addReviewTest());
        }else{
            System.out.println("please select from movie list:...");
            for (String s : Movie) {
                System.out.println(s);
            }
        }
    }



    }
    public String addReviewTest(){
        return "Test add review for "+this.nameOfMovie+" movie: this is old star: "+oldStar+", and this new star after review: "+numberStar;
    }
    public void getMovie(){
        for (String s : Movie) {
            System.out.println(s);
        }
    }
    public void getReview(){
        System.out.println("this Review for: "+this.nameOfMovie+" movie........");
        for (int i = 0; i < this.allReview.size(); i++) {
            System.out.println(this.allReview.get(i));
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "Movie=" + Movie +
                '}';
    }
}
