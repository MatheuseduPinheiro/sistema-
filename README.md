
    <h1>Sistema de Postagens usando Spring REST API</h1>

    <p>Este é um sistema de postagens desenvolvido com Spring Boot, MongoDB e PostgreSQL como bancos de dados, e Postman para visualizar os dados JSON armazenados no MongoDB.</p>

    <h2>Funcionalidades</h2>
    <p>O sistema simula a criação de postagens (imagens simuladas por títulos) onde outros usuários podem interagir por meio de comentários. As principais funcionalidades incluem:</p>
    <ul>
        <li>Criação de Postagens: Os usuários podem criar novas postagens, simuladas por títulos, para compartilhar conteúdo na plataforma.</li>
        <li>Comentários: Os usuários podem fazer comentários nas postagens de outros usuários, permitindo interações e discussões.</li>
        <li>Respostas a Comentários: Além de comentar nas postagens, os usuários podem responder a comentários existentes, promovendo conversas mais detalhadas.</li>
    </ul>

    <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li>Spring Boot: Framework para desenvolvimento de aplicativos Java baseados em Spring.</li>
        <li>MongoDB: Banco de dados NoSQL utilizado para armazenar as postagens e comentários.</li>
        <li>PostgreSQL: Banco de dados relacional utilizado para armazenar outras informações do sistema, como usuários e autenticação.</li>
        <li>Postman: Ferramenta utilizada para testar e visualizar os dados JSON armazenados no MongoDB.</li>
    </ul>

    <h2>Como Executar</h2>
    <p>Para executar o projeto localmente, siga as etapas abaixo:</p>
    <ol>
        <li>Certifique-se de ter o MongoDB e o PostgreSQL instalados e em execução na sua máquina.</li>
        <li>Clone este repositório:</li>
        <code>git clone https://github.com/MatheuseduPinheiro/sistema_de_postagens.git</code>
        <li>Navegue até o diretório do projeto:</li>
        <code>cd sistema_de_postagens</code>
        <li>Execute a aplicação Spring Boot:</li>
        <code>mvn spring-boot:run</code>
        <li>Utilize o Postman ou outro cliente HTTP para fazer solicitações à API REST.</li>
    </ol>
    <p>Certifique-se de que o MongoDB e o PostgreSQL estejam em execução antes de iniciar a aplicação.</p>

