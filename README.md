🚀 ContaBanco

Um projeto simples em Java que recebe informações bancárias via terminal e exibe uma mensagem personalizada ao usuário.
📌 Funcionalidades

✅ Solicita ao usuário os seguintes dados:

    Número da conta

    Agência

    Nome do cliente

    Saldo

✅ Exibe uma mensagem confirmando a criação da conta com os dados informados.
🛠️ Tecnologias

    Java (versão mínima recomendada: 8)

    Scanner (para entrada de dados no terminal)

📂 Estrutura do Projeto

📦 ContaBanco
 ┣ 📂 .idea/               # Configurações do IntelliJ IDEA
 ┣ 📂 src/                 # Código-fonte do projeto
 ┃ ┗ 📂 com
 ┃   ┗ 📂 projeto
 ┃      ┗ 📂 dio           # Pacote do projeto
 ┃         ┣ 📜 Main.java  # Classe principal para execução do programa
 ┃         ┗ 📜 ContaTerminal.java # Classe responsável pelos dados da conta bancária
 ┣ 📜 .gitignore           # Arquivos ignorados pelo Git
 ┣ 📜 README.md            # Documentação do projeto
 ┗ 📜 ContaBanco.iml       # Arquivo de configuração do IntelliJ IDEA
🚀 Como Executar

    Baixe o projeto ou clone o repositório:

git clone https://github.com/F-Alexandre/DIO---Trilha-Java-Conta-Bancaria
cd DIO---Trilha-Java-Conta-Bancaria/ContaBanco

Compile o código:

javac ContaTerminal.java
javac Main.java

Execute o programa:

    java Main

    Insira os dados solicitados no terminal e veja a saída formatada.

📌 Exemplo de Uso

Por favor, digite o número da Agência!
➡ 067-8  

Por favor, digite o número da Conta!
➡ 1021  

Por favor, digite seu nome!
➡ MARIO ANDRADE  

Por favor, digite seu saldo!
➡ 237.48  

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco,  
sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.

✨ Contribuições

Sinta-se à vontade para abrir issues e enviar pull requests!

📌 Autor: FELIPE ALEXANDRE
