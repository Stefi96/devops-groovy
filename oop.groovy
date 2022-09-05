class OOP{
    static main(args) {
        
        //def king = new Animal(name: "king", sound: "growl");

        def pc = new Computer("PC", "fast");

        println("$pc.name is $pc.performance")

        pc.setPerformance("slow")

        println("$pc.name is $pc.performance")

        def android = new Smartphone("google pixel", "medium", "android")

        android.isFast();
    }
}