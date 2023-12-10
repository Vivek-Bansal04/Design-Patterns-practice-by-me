package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

//        // #1
//        List<Bird> birds = List.of(new Bird(),new Crow(),new Sparrow(),new Crow());
//        List<Bird> children = new ArrayList<>();
//
//        for(Bird parent : birds){
//            // so here is the issue if child class doesn't implement clone method then
//            // it will get parent clone method
//            children.add(parent.clone());
//        }

        //#2
        Bird bird1 = new Bird();
        bird1.setName("vivek");
        bird1.setColor("red");
        bird1.setWeight(40);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("blue");
        sparrow1.setLegSize("hey");

        Crow crow1 = new Crow();
        crow1.setWeight(10);
        crow1.setSound("kawwwww");

        List<Bird> birds = List.of(bird1,crow1,sparrow1);
        List<Bird> children = new ArrayList<>();

        for(Bird parent : birds){
            // so here is the issue if child class doesn't implement clone method then
            // it will get parent clone method
            children.add(parent.clone());
        }


        //#3 after creating registry
        Sparrow longLeggedSparrow = new Sparrow();
        longLeggedSparrow.setLegSize("hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("chirppppp");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow",sweetSoundCrow);
        birdRegistry.registerBird("longLeggedSparrow",longLeggedSparrow);

        List<String> getBirdsOfType = List.of(
                "longLeggedSparrow",
                "sweetSoundCrow",
                "longLeggedSparrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();
        for (String type : getBirdsOfType){
            requestedBirds.add(birdRegistry.getBird(type));
        }

        System.out.println("Done");
    }
}
