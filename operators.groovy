class Operators{
    static main(args) {
        def ageVote = 18;
        // regular if
        if(ageVote < 18) println('cant vote');
            else println('can vote');

        // terinary operator
        println(ageVote<18?'cant vote':'can vote');

        def user = [
            'username' : 'mark',
            'pass' : "123",
            'account' : 'admin'
        ]

        println(user.account);

        println(user?.city); // null safe does not give null pointer exception

    }
}