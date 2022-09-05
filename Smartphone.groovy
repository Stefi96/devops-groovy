class Smartphone extends Computer{

    def mobileOS;

    def Smartphone(name, performance, mobileOS){
        super(name, performance);
        this.mobileOS = mobileOS;
    }

    def isFast(){
        println("$name is not as fast as a PC");
    }

}