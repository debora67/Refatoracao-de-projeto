package CodigoRefatorado.FactoryMethod;

import CodigoRefatorado.Aluno;

public class AlunoFactory implements EntidadeFactory<Aluno> {
    @Override
    public Aluno criar(String nome, String senha) {
        return new Aluno(nome, senha);
    }
}
