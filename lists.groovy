class Hello{
    static void main(String[] args){
        
        // list holds a list of objects with an index for each object
        def primes = [2,3,5,7,11,13];
        println('second element in primes is ' + primes[1]);
        for (num in primes) {
            println(num);
        }

        primes.add(31);

        primes - [31];

        def employees = ['mark','ethan','angela','marie'];
        for (employee in employees) {
            println(employee);
        }

    }
}