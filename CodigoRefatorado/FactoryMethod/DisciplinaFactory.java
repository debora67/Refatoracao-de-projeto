package CodigoRefatorado.FactoryMethod;

import CodigoRefatorado.Disciplina;

public class DisciplinaFactory {
    public Disciplina criar(String nome, int valor) {
        return new Disciplina(nome, valor);
    }
}
