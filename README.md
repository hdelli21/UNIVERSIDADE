# UNIVERSIDADE

🚀 Começando
Uma conceituada universidade calcula a nota final de seus alunos de duas formas a depender da quantidade de avaliações.

Até 2 avaliações a nota final será a média aritmética das notas. Caso tenha 3 notas será a média ponderada, onde a segunda nota tem o dobro do peso da primeira e a terceira tem o dobro do peso da segunda.

Caso haja 4 notas, ac1, ac2, ag e af, a nota final será dada pela equação:

MF = (ac1 * 0,15) + (ac2 * 0,30) + (ag * 0,10) + (af * 0,45).

Nessa mesma universidade, um aluno será aprovado se sua nota for >= 5 e possuir ao menos 75% de presença. Contudo, nas disciplinas no formato EAD, não há presença e a aprovação será apenas baseada na nota, com o mesmo valor de corte das disciplinas presenciais.

Crie a classe aluno que implementa essas funções e os atributos que julgar necessários. Além disso, crie construtores e um método que imprime o nome, RA, nota final e situação (Aprovado/Reprovado).

📋 Pré-requisitos

jdk - 17.0.11_windows 
Eclipse IDE for Java Developers - 2023 -12

🔧 Instalação
Dar exemplos

1. Instalar o download do JDK 17
2. Instalar o Elipse IDE for Java Developers
3. Abrir o Eclipse
4. Ir até window -> Preferences -> Java -> Installed JREs
5. Adicionar JDK 17a lista de ambientes JRE

Explicação de como deve ser utilizado o projeto

A classe UNIVERSIDADE representa um aluno, contendo informações como nome, RA, número de faltas e se a disciplina é EAD. O aluno pode calcular sua nota final com base em notas recebidas, utilizando média aritmética ou uma média ponderada específica. A aprovação é verificada de acordo com a nota final e as faltas: se for EAD, a aprovação depende apenas da nota; se for presencial, o aluno deve ter menos de 25% de faltas e uma nota igual ou superior a 5. A classe também inclui métodos para acessar e modificar os atributos do aluno.

🛠 Construído com

jdk - 17.0.11_windows 
JRE System Libary [JavaSE-17]



IDE Eclipse
📌 Versão
jdk - 17.0.11_windows 
Eclipse IDE for Java Developers - 2023 -12


Versão 1.0 caso seja atualizado manter a descrição inicial e inserir uma nova linha com descrição da atualização.
Versão 1.1 - Refatoração data 09/09/24
✒ Autor

Henrick Delli Colli Honorato Silva -ETAPA 5 UNIVERSIDADE - Atividade individual Lista de Exercícios - Etapa 5
