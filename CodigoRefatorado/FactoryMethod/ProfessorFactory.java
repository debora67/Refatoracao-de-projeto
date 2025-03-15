package CodigoRefatorado.FactoryMethod;

import CodigoRefatorado.Professor;

public class ProfessorFactory implements EntidadeFactory<Professor> {
    @Override
    public Professor criar(String nome, String senha) {
        return new Professor(nome, senha);
    }
}

