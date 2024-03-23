# Sistema de Postagens usando Spring REST API

Este é um sistema de postagens desenvolvido com Spring Boot, MongoDB e PostgreSQL como bancos de dados, e Postman para visualizar os dados JSON armazenados no MongoDB.

## Funcionalidades

O sistema simula a criação de postagens (imagens simuladas por títulos) onde outros usuários podem interagir por meio de comentários. As principais funcionalidades incluem:

- Criação de Postagens: Os usuários podem criar novas postagens, simuladas por títulos, para compartilhar conteúdo na plataforma.
- Comentários: Os usuários podem fazer comentários nas postagens de outros usuários, permitindo interações e discussões.
- Respostas a Comentários: Além de comentar nas postagens, os usuários podem responder a comentários existentes, promovendo conversas mais detalhadas.

## Tecnologias Utilizadas

- Spring Boot: Framework para desenvolvimento de aplicativos Java baseados em Spring.
- MongoDB: Banco de dados NoSQL utilizado para armazenar as postagens e comentários.
- PostgreSQL: Banco de dados relacional utilizado para armazenar outras informações do sistema, como usuários e autenticação.
- Postman: Ferramenta utilizada para testar e visualizar os dados JSON armazenados no MongoDB.

## Como Executar

Para executar o projeto localmente, siga as etapas abaixo:

1. Certifique-se de ter o MongoDB e o PostgreSQL instalados e em execução na sua máquina.
2. Clone este repositório:

   ```bash
   git clone https://github.com/MatheuseduPinheiro/sistema_de_postagens.git
