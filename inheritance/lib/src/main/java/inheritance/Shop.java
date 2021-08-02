package inheritance;

import java.util.ArrayList;

public class Shop {



        private String name;
        private String description;
        private String priceGatogory;
        private int numberStar=0;
         private int oldStar=0;
        ArrayList<Integer> starAvg;
        ArrayList<String>allReview;
        public Shop(String name, String descriptions, int price) {

            this.name=name.toUpperCase();
            this.description=descriptions;
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
            System.out.println("this Review for: "+this.name+" Shop........");
            for (int i = 0; i < this.allReview.size(); i++) {
                System.out.println(this.allReview.get(i));
            }
        }

        public void test(){
            System.out.println("this is form shop: "+name);
        }
        public String addReviewTest(){
            return "Test add review for shop: this is old star: "+oldStar+", and this new star after review: "+numberStar;
        }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceGatogory='" + priceGatogory + '\'' +
                '}';
    }
}


