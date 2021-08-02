package inheritance;

import java.util.ArrayList;

public class Restaurant {



    private String name;
    private int numberStar;
    private String priceGatogory;
    private int oldStar;
    ArrayList<Integer>starAvg;
    ArrayList<String>allReview;

    public String getName() {
        return name;
    }

    public Restaurant(String name, int star, int price) {
        if(star>=5){
            this.numberStar=5;
        }else if(star<=0){
            this.numberStar=0;
        }else {
            this.numberStar=star;
        }
        this.name=name.toUpperCase();
        if(price<=10&&price>=0){
            this.priceGatogory="$1-$10 per person";
        }else if(price<=20&&price>=11){
            this.priceGatogory="$11-$20 per person";
        }else if(price<=30&&price>=21){
            this.priceGatogory="$21-$30 per person";
        }else if(price>=31){
            this.priceGatogory="$31+ per person";
        }
        starAvg=new ArrayList<Integer>();
        allReview=new ArrayList<String>();
    }

    public void addReview(String bodies, String authors, int stars){
        if(stars>=5){
            stars=5;
        }else if(stars<=0){
            stars=0;
        }

//        ArrayList<Integer>this.name=new ArrayList<Integer>();
        this.oldStar=this.numberStar;
        starAvg.add(stars);
        int sum=0;
        for (int i = 0; i < starAvg.size(); i++) {
            sum+=starAvg.get(i);
        }
        this.numberStar=sum/starAvg.size();

        Review review=new Review(this.name,bodies,authors,this.numberStar);
//        System.out.println(review.ReviewResult);
        allReview.add(review.ReviewResult);
        System.out.println(addReviewTest());
    }
    public void getReview(){
        System.out.println("this Review for: "+this.name+" restaurant........");
        for (int i = 0; i < this.allReview.size(); i++) {
            System.out.println(this.allReview.get(i));
        }
    }

    public void test(){
        System.out.println("this is form restaurant: "+name);
    }
   public String addReviewTest(){
       return "Test add review restaurant: this is old star: "+oldStar+", and this new star after review: "+numberStar;
   }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberStar=" + numberStar +
                ", priceGatogory=" + priceGatogory +
                '}';
    }
}
