package inheritance;

public class Review {
    String body;
    String author;
    int numStarts;
    String nameOfRestaurant;
    String ReviewResult;

    public  Review (String bodies,String authors,int stars){
        this.body=bodies;
        this.author=authors.toUpperCase();
        if(stars>=5){
            this.numStarts=5;
        }else if(stars<=0){
            this.numStarts=0;
        }else {
            this.numStarts=stars;
        }

    }
    public Review(String name,String bodies,String authors,int stars){
        this.body=bodies;
        this.author=authors.toUpperCase();
        if(stars>=5){
            this.numStarts=5;
        }else if(stars<=0){
            this.numStarts=0;
        }else {
            this.numStarts=stars;
        }
        this.nameOfRestaurant=name.toUpperCase();
        this.ReviewResult=name+" Restaurant, "+body+", my Review is: "+numStarts+", this review from: "+author;
//        System.out.println(name+" Restaurant, "+body+", my Review is: "+numStarts+", this review from: "+author);
    }

public  String test(){

    return "this review from: "+author;
}

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numStarts=" + numStarts +
                ", nameOfRestaurant='" + nameOfRestaurant + '\'' +
                '}';
    }
    //    @Override
//    public String toString() {
//        return "Review{" +
//                "body='" + body + '\'' +
//                ", author='" + author + '\'' +
//                ", numstarts=" + numStarts +
//                '}';
//    }

}
