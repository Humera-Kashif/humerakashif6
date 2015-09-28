
public class AnimalHouse {

	
	public static void main(String[] args){
		Dog Lassie=new Dog("bow wow","--i run");
		Bird Tweetybird=new Bird("tweet-tweet","--i fly");
		Animal cow=new Animal("Cow","mow-mow","--i walk");
		
		
		
		System.out.println(Lassie.speak());
		System.out.println(Tweetybird.speak());
		System.out.println(cow.speak());
		System.out.println(Lassie.move());
		System.out.println(Tweetybird.move());
		System.out.println(cow.move());
	}
	
	
	
}


