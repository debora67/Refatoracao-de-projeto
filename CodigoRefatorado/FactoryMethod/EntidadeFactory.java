package CodigoRefatorado.FactoryMethod;

public interface EntidadeFactory<T> {
    T criar(String nome, String senha);
}
