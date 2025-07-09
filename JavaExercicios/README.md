Lista de Exercícios em Java (Fundamentos até Collections)

> Esta é uma lista de exercícios organizada por níveis (básico → intermediário → avançado), seguindo a ordem dos conteúdos estudados em Java, com o objetivo de fixar os conhecimentos e desenvolver experiência prática.  
> Ao final, há um mini projeto prático integrador.

✅ Conteúdos já estudados
- ✅ Fundamentos (variáveis, operadores, estruturas)
- ✅ Programação Orientada a Objetos (POO)
- ✅ Herança, Encapsulamento, Polimorfismo, Abstração
- ✅ Interfaces, Records, Enums
- ✅ Expressões Lambda
- ✅ Collections API (List, Set, Map, etc.)

🟢 Nível 1 – Exercícios Básicos
> Revisão de fundamentos + orientação a objetos

1. Produto
2. Conta Bancária
3. Formas Geométricas (Abstração)
4. Pessoa / Aluno / Professor (Herança)

🟡 Nível 2 – Exercícios Intermediários
> Aplicando recursos modernos da linguagem (interface, lambda, record, enum)

1. Interface Calculadora
2. Enum Operações
3. Record AlunoDTO
4. Lambda com filtro

🟠 Nível 3 – Exercícios Avançados
> Trabalhando com Collections (List, Set, Map, ordenação, busca)

1. Lista de Tarefas
2. Contador de Palavras
3. Agenda de Contatos
4. Ranking de Jogadores
5. Ordenação com Comparator

🟣 Projeto Final – Sistema de Biblioteca
> Projeto integrador simples para reforçar todos os conceitos

📚 Funcionalidades:
- Classes: `Livro`, `Usuario`, `Emprestimo`
- Armazenamento em listas
- Cadastro de livros e usuários
- Empréstimo e devolução de livros
- Busca por nome ou autor
- Enum para status (DISPONIVEL, EMPRESTADO)
- Lambda para filtros e ordenações
- Record `LivroResumo` com dados resumidos

💡 Estrutura Sugerida no GitHub:
```
/java-exercicios/
├── nivel-1-basico/
│   ├── Produto.java                      # Exercício 1
│   ├── ContaBancaria.java               # Exercício 2
│   ├── FormasGeometricas.java           # Exercício 3
│   └── PessoaAlunoProfessor.java        # Exercício 4
│
├── nivel-2-intermediario/
│   ├── CalculadoraInterface.java        # Exercício 1
│   ├── OperacaoMatematicaEnum.java      # Exercício 2
│   ├── AlunoDTORecord.java              # Exercício 3
│   └── FiltroComLambda.java             # Exercício 4
│
├── nivel-3-avancado/
│   ├── ListaTarefas.java                # Exercício 1
│   ├── ContadorPalavras.java            # Exercício 2
│   ├── AgendaContatosSet.java           # Exercício 3
│   ├── RankingJogadoresTreeMap.java     # Exercício 4
│   └── OrdenacaoLivrosComparator.java   # Exercício 5
│
├── projeto-biblioteca/
│   ├── Livro.java
│   ├── Usuario.java
│   ├── Emprestimo.java
│   ├── LivroResumo.java
│   └── Main.java
│
└── README.md
```
