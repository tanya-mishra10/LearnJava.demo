package javaLibraryExamples;

interface Nose {
    public int IMethod();
}
abstract class picasso implements Nose{
    public int IMethod(){
        return 7;
    }
}
class clowns extends picasso{ }

class Act extends picasso{
    @Override
    public int IMethod() {
        return 5;
    }
}

