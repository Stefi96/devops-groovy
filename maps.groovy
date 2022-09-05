class Maps{
    static main(args) { //generating main with ctrl+space
        
        def paulName = [
            'name' : 'Paul',
            'age' : 23,
            'adress' : '123 Main St',
            'list' : [1,2,3]
        ];

        println(paulName.name);
        println(paulName['age']);
        println(paulName.list[1]);

        paulName.city = 'New York';

        paulName.each{entry -> println("$entry.key: $entry.value")}

    }
}