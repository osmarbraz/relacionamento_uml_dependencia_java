
public class ClasseA {

    public ClasseA() {
    }

    public void usaClasseB(ClasseB b) {
        //Usa o objeto b da ClasseB
    }

    public void instanciaClasseC() {
        ClasseC c = new ClasseC();
        //Usa o objeto c da ClasseC
    }

    public ClasseD retornaClasseD() {
        ClasseD d = new ClasseD();
        //Usa o objeto d da ClasseD e retorna
        return d;
    }

}
