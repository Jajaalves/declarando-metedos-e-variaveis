public class Metedos {

    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Lima";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        int resultado = soma(12, 13);
        System.out.println(resultado);
    }
    public static String nomeCompleto(String primeiroNome,String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }
    public static int soma (int numero1,int numero2){
        return numero1 + numero2;
    }
    
}
//nessa classe Metedos tem dois metodos, o primeiro é nomeCompleto que concatena o primeiro e segundo nome, e o segundo é soma que soma dois numeros inteiros. O metodo main chama esses metodos e imprime os resultados no console.
// nessa aula aprendemos sobre metodos, que são blocos de codigo que realizam uma tarefa especifica e podem ser reutilizados em diferentes partes do programa. Os metodos podem ter parametros de entrada e retornar um valor. A sintaxe para declarar um metodo é: tipoDeRetorno nomeDoMetodo(tipo parametro1, tipo parametro2) { // corpo do metodo } onde tipoDeRetorno é o tipo de dado que o metodo retorna (pode ser void se não retornar nada), nomeDoMetodo é o nome do metodo, e os parametros são opcionais. Para chamar um metodo, basta usar seu nome seguido de parenteses e passar os argumentos necessários.
// O metodo main é o ponto de entrada do programa e é onde os metodos são chamados. Os metodos podem ser sobrecarregados, ou seja, podem ter o mesmo nome mas com diferentes tipos ou quantidades de parametros. Isso permite criar metodos com funcionalidades semelhantes mas que aceitam diferentes tipos de dados. Além disso, os metodos podem ser recursivos, ou seja, podem chamar a si mesmos para resolver problemas mais complexos. É importante lembrar que os metodos devem ser bem nomeados e documentados para facilitar a leitura e manutenção do codigo.