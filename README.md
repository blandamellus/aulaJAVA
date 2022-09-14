## [13-09-2022] Terça Aula 15


#### Segunda parte da aula:
    
Evoluímos nosso **Projeto Batalha Naval**, e implementamos as seguintes regras [Resolução com novas regras](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula15_ProjetoBatalhaNaval.java)
- Procurar uma coordenada no tabuleiro e verificar se existe algum objeto;
- Retornar uma mensagem se acertou ou errou;
- Alterar o tabuleiro com os tiros já dados;
    - Legenda:
    - |N| = Navio
    - |H| = Helicóptero
    - |B| = Barquinho
    - |A| = Água
    - |*| = tiro na água. Quando usuário não acerta
    - |X| = tiro certeiro. Quando usuário acerta algo.

#### Primeira parte da aula: 

Resolução de exercícios que toquem todos os conteúdos já estudados
- Operadores
    - Aritméticos
    - Precedência
    - Operadores Lógicos
    - Operadores Relacionais
    - Operadores de Igualdade
- Tipos de dados
    - Int, Double, char, String
- Estruturas de Decisão
    if / else / switch
Estruturas de Repetição
    - For / While / Do While

**🚴‍♀️Exercitando tudo junto e misturado nos exercícios abaixo:🚴‍♀️**

- **Exercício 1** Faça um programa que retorne o valor digitado por extenso, limitando-se a número de 1 a 9. [Resolução](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula15_exercicio_1.java)

- **Exercício 2** Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa. [Resolução](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula15_exercicio_1.java)

- **Exercício 3** Faça um Programa que leia 4 notas, mostre as notas e a média na tela. [Resolução](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula15_exercicio_1.java)

- **Exercício 4** Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.


## [10-09-2022] Sábado Aula 14

Revisão do conteúdo de vetores e matrizes, [apresentação da Aula 14.](https://github.com/blandamellus/aulaJAVA/blob/main/materialAula/Aula%2014.pdf)
    
#### Vetores
- **Exercício 1** Faça um Programa que leia um vetor de 5 números inteiros e mostre-os. [Resolução](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula14_exercicio_1.java)

- **Exercício 2** Faça um programa de caixa de mercado, onde o atendente informe o código dos produtos da compra (posições) e o programa retorne o valor total a ser pago. [Resolvido](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula14_exercicio_2.java)
        
#### Matrizes

- Revisão da estrutura
- Exemplo de uma matriz [2x2] [Resolução v1](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula14_exemplo_matriz.java)

**Projeto Jogo de Batalha Naval!** [Regras](https://www.javaprogressivo.net/2012/09/jogo-batalha-naval-em-java.html?m=1)
    
- Legenda pro usuário:
    - = : água no bloco. Ainda não foi dado tiro.
    - \* : tiro dado, não há nada ali.
    - X : tiro dado, havia um navio ali.
    
**Atividade** Construir nosso próprio jogo de batalha naval. Quais as regras básicas?
    
1. Temos um tabuleiro de tamanho 5x5.
2. Devemos iniciar o tabuleiro sem peças. 
3. E para testar, vamos colocar algumas variáveis com valores fixos para não precisar validar a entrada ainda.
4. O jogo se batalha naval consiste em darmos um palpite de uma coordenada, e então verificar se acertamos ou não um navio. Para isso, precisamos primeiro, percorrer nossa matriz atrás de um objeto na matriz. 
5. Depois se encontrar esse objeto, precisamos verificar se é o nosso ou alguma das outras opções.
    


## [08-09-2022] Quinta-Feira Aula 13

Confira nossa [aula 13](https://github.com/blandamellus/aulaJAVA/blob/main/materialAula/Aula%2013.pdf) para ver os desenhos da explicação.

Conteúdo novo: 
- Vetores

    - [Exemplo 1 com vetores](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula13_EntendendoVerores_1.java)
    - [Exemplo 2 com vetores](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula13_EntendendoVerores_2.java)
    - [Exemplo 3 com vetores](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula13_EntendendoVerores_3.java)

- Matrizes
    - [Exemplo 1 com Matrizes](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula13_EntendendoMatrizes_1.java)
    - [Exemplo 2 com Matrizes](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/Aula13_EntendendoMatrizes_2.java)

- Desenho em plano cartesiano

**Atividade** agora que aprendemos como guardar mais informações do que uma única varíavel, utilizando um vetor, e que é possível guardar informações em mais dimensões (como em uma plano cartesiano), vamos explorar como representar algumas figuras em um plano para entender como funcionam as coordenadas em uma matriz.

- **Material** [Coordenadas do plano cartesiano](https://docs.google.com/file/d/0B7DeV8K6VL-uVjFnTjlwYVlKTzQ/edit?pli=1&resourcekey=0-GXS0bJTRUXFkxNPl15xoRg). Copie as coordenadas e vamos criar nossas matrizes para descobrir como ficam os desenhos!
- **Entrega** Após finalizado vamos resolver em conjunto!


## [01-09-2022] Terça-Feira Aula 11

Aula para prática e exercícios de fixação, exercícios na [Apresentação Aula 11](https://github.com/blandamellus/aulaJAVA/blob/main/materialAula/Aula%2011.pdf).


#### Atividade
Profissões do futuro. Pesquisar sobre um dos temas abaixo anteriores e escrever um relatório respondendo as seguintes perguntas:
- Quem trabalha nessa função/cargo tem quais atividades? 
- Quais tecnologias precisa saber?
- Quais faculdades costuma cursar?
- Existem empresas no Brasil? E no mundo?
- Usa alguma linguagem de programação como principal?
- Qual o salário médio atual?

#### Temas para escolher
**Escolha 1 e avise no grupo para não repetir os temas!**
- Desenvolvedor Fullstack (Valentina)
- Desenvolvedor Backend (Cauan)
- Desenvolvedor Frontend
- Desenvolvedor Mobile (Maiara) (Arthur)
- Qualidade de software (pablo)
- Gerente de projetos
- Cientista de Dados (Eric)
- Analista de dados
- Engenheiro de dados
- Especialista UI e UX
- Administrador de Banco de Dados (DBA)
- DevOps
- Scrum Master
- Administrador de Redes/Infraestrutura


##### Data de Entrega 

Entrega do relatório até a próxima aula de **sábado (dia 10/09)**. Enviar por whatsApp ou para o e-mail: blandamellus@gmail.com


## [30-08-2022] Terça-Feira Aula 10 

Revisamos em aula [Apresentaçao Aula 10](https://github.com/blandamellus/aulaJAVA/blob/main/materialAula/Aula%2010.pdf)

- Correção de exercícios e dúvidas para usar o [hackerhank](https://www.hackerrank.com/domains/java?filters%5Bsubdomains%5D%5B%5D=java-introduction&filters%5Bdifficulty%5D%5B%5D=easy)
- Visão geral tutorial e documentação, onde tirar dúvidas? [Tutorialspoint/JAVA](https://www.tutorialspoint.com/java/index.htm)
- **Manipulação de Strings**
    - replace()
    - contains()
    - trim()
    - length()
    - toUpperCase
    - substring()
    - equals()
    - [Confira os Códigos de Exemplo](https://github.com/blandamellus/aulaJAVA/blob/main/blanda/src/EntendendoString.java)

- **Exercícios para fixar**
    - Increment e Decrement
    - IF/ELSE
    - Switch/Case
    - For
    - While e Do While
    

## [27-08-2022] Sábado Aula 9 

**Atividade** Na página 13 da [Apresentaçao Aula 9](https://github.com/blandamellus/aulaJAVA/blob/main/materialAula/Aula%209.pdf) tem um print dos exercícios iniciais que podem ser feitos. 

- [Exercícios Hackerrank Introdução](https://www.hackerrank.com/domains/java?filters%5Bsubdomains%5D%5B%5D=java-introduction)
- **Ferramenta** Para resolver, usar o próprio site do Hackerrank, depois de resolver ele salva a solução de vocês.
- **Entrega** Vamos resolver as dúvidas em aula!


Revisamos em aula [Apresentaçao Aula 9](https://github.com/blandamellus/aulaJAVA/blob/main/materialAula/Aula%209.pdf)
- Regras e Nomes
- Anatomia do Código
- Comentário linha e bloco
- Incremento e Decremento
- IF/ELSE
- Switch/Case
- For/IF/ELSE aninhados

### Arquivos das resolução de exercícios

- [ConceitoNotas.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/ConceitoNotas.java)
- [EstruturaFor.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/EstruturaFor.java)
- [HomensMulheres.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/HomensMulheres.java)
- [IncrementoDecremento.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/IncrementoDecremento.java)
- [Switch.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/Switch.java)
- [Temperatura.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/Temperatura.java)
- [UsoConstantes.java](https://github.com/blandamellus/aulaJAVA/blob/main/emAula/src/UsoConstantes.java)


## [25-08-2022] Quinta-feira Aula 8 

- Revisão geral e Configuração do Github da turma


## [23-08-2022] Terça-feira Aula 7 - Exercícios de Repetição: 

**Atividade** Escolher 2 exercícios e deesnvolver em casa para a próxima aula. 

- **Exercícios** (https://wiki.python.org.br/EstruturaDeRepeticao)
- **Ferramenta** Para resolver, vocês podem utilizar aquele site, e fazer os exercícios online: [onlineGDB](https://www.onlinegdb.com/), mas não esqueçam de salvar os códigos. 
- **Entrega** Os dois exercícios escolhidos, encaminhar por WhatsApp ou adicionar em nosso drive! 
