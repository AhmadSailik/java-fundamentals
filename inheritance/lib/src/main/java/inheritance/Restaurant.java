package inheritance;

public class Restaurant {



    private String name;
    private int numberStar;
    private String priceGatogory;
    int oldStart;

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

    }

    public void addReview(String bodies, String authors, int stars){
        this.oldStart=this.numberStar;
        if(stars>=5){
            this.numberStar=5;
        }else if(stars<=0){
            this.numberStar=0;
        }else {
            this.numberStar=stars;
        }
        Review review=new Review(this.name,bodies,authors,stars);
        System.out.println(addReviewTest());
    }

    public void test(){
        System.out.println("this is form restaurant: "+name);
    }
   public String addReviewTest(){
       return "Test add review: this is old star: "+oldStart+", and this new star after review: "+numberStar;
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
