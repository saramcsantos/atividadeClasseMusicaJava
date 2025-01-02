# Atividade: classe Music

## Descrição
Este repositóro é dedicado ao desenvolvimento da classe Music, atividade do curso de Java: aplicando orientação a objetos. A proposta dessa atividade é iniciar o estudos em orientação a objetos,
por meio da criação de uma classe Music, com os atributos: titulo, artista, ano de lançamento. Incialmente ela não houve o encapsulamento de atributos e nem de métodos. A ideia dessa atividade é 
explicar o conceito de classe e objeto.

## Detalhes técnicos
Para a realização dessas atividades foi utilizada a IDE Intellij. Não houve instalação de bibliotecas externas. A versão do Java utilizada nas atividades é: Java 21. 

## Pré-requisitos
Antes de executar os códigos Java presentes neste repositório, é necessário instalar o JDK (Java Development Kit).
O JDK é indispensável para compilar o código-fonte (.java) e gerar arquivos .class, que contêm os bytecodes essenciais para que a máquina execute o programa. O bytecode é uma linguagem intermediária compreendida pela Máquina Virtual Java (JVM), mas não diretamente pelos seres humanos. Essa conversão da linguagem Java para bytecode ocorre durante a compilação, por isso a instalação do JDK é imprescindível.

Caso este repositório já incluísse os arquivos .class gerados a partir do código-fonte, seria necessário apenas instalar o JRE (Java Runtime Environment). O JRE fornece o ambiente necessário para executar o bytecode, dispensando a necessidade de compilação. Da mesma forma, se o repositório contivesse um arquivo .jar (um executável Java), apenas a instalação do JRE seria suficiente.

Essas instalações, tanto do JDK quanto do JRE, são importantes porque incluem a Máquina Virtual Java (JVM), responsável por interpretar e executar o bytecode, garantindo a execução do programa Java.

**Link de instalação do JDK e JRE:**
1. JDK: https://www.oracle.com/br/java/technologies/downloads/
2. JRE: https://www.java.com/pt-BR/download/manual.jsp
   
*Importante: ao instalar o JDK escolha a versão com suporte, ela é identificada pela sigla LTS*

**Link de instalação do Intellij e tutorial de uso:**
1. Instalação: https://www.jetbrains.com/pt-br/idea/
2. Tutotrial de uso: https://www.youtube.com/watch?v=0_e9Egeyk2E

*Importante: ao instalar o Intellij escolha a edição community, ela é gratuita*

## Sobre a atividade
Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

## Conteúdo estudado e aprendido com o desenvolvimento dessa atividade
Em programação existe dois paradigmas: estrutural e orientado a objetos. A linguagem de programação que faz uso do paradigma estrutural desenvolvem em uma programação estruturada, com este paradigma temos as linguagens: C, Cobol, Pascal e Basic, por exemplo. Esse paradigma compreende que o programa deve seguir uma estrutura formada por:


 - Sequências: são comandos escritos de forma sequencial para serem executados;
 - Condições: sequências que só devem ser executada se uma condição for satisfeita;
 - Repetições: sequências que devem ser executadas repetidamente até que uma condição seja satisfeita;


Além disso em programação estruturada o programa é escrito em rotinas (funções) que recebem um bloco de instruções que contém uma ou todas as estruturas citadas acima. Essa rotinas podem ser quebradas em subrotinas. Essas subrotinas podem ser chamadas dentro de rotinas as quais se tornam responsáveis por executar todo o programa. Segue abaixo um exemplo do uso de programação estruurada usando a linguagem C:
```
// exemplo de programação estruturada usando a Linguagem C (sem uso de rotinas):

#include <stdio.h>

int main() {
    // sequência de comandos
    int dividendo, divisor;

    printf("Digite o valor de dividendo: ");
    scanf("%d", &dividendo);

    printf("Digite o valor de divisor: ");
    scanf("%d", &divisor);
    
    // estrutura de condição para verificar se dividendo é divisível por divisor
    if (divisor == 0) {
        printf("Divisão por zero não é permitida.\n");
    } else {
        if (dividendo % divisor == 0) {
            printf("%d é divisível por %d.\n", dividendo, divisor);
        } else {
            printf("%d não é divisível por %d.\n", dividendo, divisor);
        }
    }

    return 0;
}
```
```
// exemplo de programação estruturada usando a Linguagem C (com uso de rotinas):

#include <stdio.h>

// rotina (função) para verificar se dividendo é divisível por divisor
void verificarDivisibilidade(int dividendo, int divisor) {
    
    // estrutura de condição para verificar se dividendo é divisível por divisor
    if (divisor == 0) {
        printf("Divisão por zero não é permitida.\n");
    } else if (dividendo % divisor == 0) {
        printf("%d é divisível por %d.\n", dividendo, divisor);
    } else {
        printf("%d não é divisível por %d.\n", dividendo, divisor);
    }
}

int main() {

    // sequência de comandos
    int dividendo, divisor;

    printf("Digite o valor de dividendo: ");
    scanf("%d", &dividendo);

    printf("Digite o valor de divisor: ");
    scanf("%d", &divisor);

    // chamada da rotina (função)
    verificarDivisibilidade(dividendo, divisor);

    return 0;
}

```
O objetivo do paradigma orientado a objetos é aproximar as estruturas de um programa com as coisas do mundo real, além de fornecer uma maior proteção das variáveis utilizando o princípio de encapsulamento, isso não é visto e nem utilizado em programação estruturada, na verdade a programação estruturada se limita apenas a dizer se uma variável é vísivel ou não dentro de uma função. Além desse princípio existem outros que norteiam o paradigma de orientação a objetos. 

Para aproximar as estruturas de um programa com as coisas do mundo real, a POO como é chamada a programação orientada a objetos, definiu o conceito de classe e de objeto. Sendo a classe responsável por comportar os atributos (características) e métodos (comportamentos) de um objeto, servindo posteriormente de molde para a criação de objetos os quais tem tais atributos e fazem uso de tais métodos que podem ou não alterar o seu estado inicial.

Na atividade proposta criamos a classe Music com os atributos: titulo, artista e ano de lançamento. Também criamos os métodos: exibeFichaTécnica, registraAvaliacoes e calculaMediaDasAvaliacoes ambos os métodos não alteram o estado do objeto. O método exibeFichaTécnica apenas apresenta informações do objeto, enquanto que registraAvaliacoes faz a soma de todas as avaliações para posteriormente calcular a média das avaliações usando o método calculaMediaDasAvaliacoes.

Hoje em dia a maioria dos sistemas são desenvolvidos utilizando o paradigma de orientação a objetos, e a linguagem Java foi a pioneira no uso deste paradigma que revolucionou o reúso do código, a manutenção do código e a escrita do código. 

*Não foi dado exemplo de programação orientada a objetos pela razão de haver o código da atividade sobre o assunto*

## Entendendo o código
| Palavra-Chave  | Conceito |
| ------------- | ------------- |
| Main.java | código em que é instanciado um objeto da classe Music |
| Music.java | código em que está a classe Music |
| void | indica um método sem retorno |
| double | indica que o método retorna um dado do tipo double¹ |
| new | instancia um objeto da classe Music² |

¹*O mesmo vale para: int, String, boolean e float*

²*instanciar é o mesmo que criar um objeto*


## Referências usadas para a elaboração desta documentação
**Artigo sobre Orientação a Objetos:** [Artigo da Alura](https://www.alura.com.br/artigos/poo-programacao-orientada-a-objetos?srsltid=AfmBOoqZjVNt8nPtFAt0LFlfnhWQHJYHp9cwkibk2cTSP_QMhWmORV5I)
