class Regex{
    static main(args) {
        
        def example = "Groovy" =~ "Groovy";
        
        if (example) {
            println example[0]; // different syntax for pring
        } else {
            println "no match";
        }

        def commitMessage = "SEC-123, DEV-180, commit message here, QWE-123, asd";
        def match = (commitMessage =~ /[A-Z]{3}-\d{1,3}/).findAll();
        
        if (match) {
            println match;
        } else {
            println "no match";
        }

    }
}