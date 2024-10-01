# Galactic Voyagers - Sistema de Gerenciamento de Naves Espaciais

## Descrição do Projeto

O **Galactic Voyagers** é um sistema desenvolvido para gerenciar e construir naves espaciais personalizadas para viagens intergalácticas. Com três tipos de naves principais e um conjunto variado de opções de personalização, o sistema oferece uma solução escalável que utiliza os padrões de design **Singleton**, **Builder**, e **Abstract Factory** para criar uma experiência de reserva e construção de naves de alta flexibilidade e controle.


Você foi contratado para desenvolver um sistema de gerenciamento e construção de naves espaciais para uma empresa de viagens espaciais chamada Galactic Voyagers, que oferece pacotes turísticos intergalácticos. Esse sistema deve permitir a reserva de diferentes tipos de naves espaciais e pacotes de exploração do espaço com funcionalidades personalizadas e armamamentos especificos ou personalizaveis, usando os padrões de projeto Singleton, Builder e Abstract Factory.

Cenário
A empresa oferece três tipos de naves espaciais:

Explorador Lunar – para viagens curtas à Lua.
Viajante Interplanetário – para destinos como Marte, Júpiter e outros planetas no sistema solar.
Cruzeiro Interestelar – para viagens fora do sistema solar, em galáxias distantes.
Cada tipo de nave tem um conjunto de características que podem ser personalizadas pelo cliente, como:

Capacidade de passageiros
Sistema de propulsão (fótons, íons, ou dobra espacial)
Armamentos (Arma Laser, Canhão de Plasma, Misseis Termicos)
Tecnologia de entretenimento a bordo (VR, hologramas)
O sistema deve ser escalável para a criação de novas naves no futuro, com diferentes tecnologias, capacidades e armamentos.


O sistema foi projetado para ser escalável, permitindo a adição de novos tipos de naves e tecnologias no futuro.

---

## Padrões de Projeto Utilizados / Design Patterns Used

Este projeto utiliza três padrões de design fundamentais:

### 1. Singleton
O padrão **Singleton** garante que existe um único ponto de controle centralizado para o sistema de gerenciamento de naves. O sistema de controle de naves espaciais deve ter um ponto único de gerenciamento para garantir consistência nas operações.

### 2. Builder
O padrão **Builder** permite a construção flexível de diferentes tipos de naves, possibilitando personalizações nas características como armamentos, sistemas de propulsão e tecnologias de entretenimento a bordo.

### 3. Abstract Factory
O padrão **Abstract Factory** é usado para criar famílias de naves espaciais sem especificar suas classes concretas. Isso permite a criação de novas naves e tecnologias no futuro, mantendo a flexibilidade e escalabilidade do sistema.

