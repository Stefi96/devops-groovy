class Computer {
    def name;
    def performance;

    def run(){
        println("$name runs")
    }

    def isPerf(){
        println("$name is $performance")
    }

    def Computer(name,performance){
        this.name = name;
        this.performance = performance;
    }
    
}