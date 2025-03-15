package CodigoRefatorado.FactoryMethod;

import CodigoRefatorado.Curso;

public class CursoFactory {
    public Curso criar(String nome, int credito) {
        return new Curso(nome, credito);
    }
}
