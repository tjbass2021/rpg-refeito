# Gerador de dados automáticos de Ficha de D&D

Este projeto terá seu back-end escrito em Java e tem como objetivo desenvolver um gerador de dados automáticos para o preenchimento da ficha de personagem de RPG com base nas regras do D&D 5.0.

Inicialmente o projeto retoranará apenas os valores numéricos calculados a partir das escolhas do jogador, quanto a raça e a classe do personagem. Em outro momento haverá um estudo mais aprofundado das regras do RPG em questão para uma ampliação das opções de criação de personagem através do programa.

O passo seguinte a conclusão da etapa de codificação em Java é a criação de uma interface web utilizando javascript.

Por enquanto, o projeto ainda está muito seminal, mas em breve estará com sua versão 1.0 no ar.

## Andamento do desenvolvimento

### Primeira fase (implementação sem GUI)

- [x]  Reorganizar os objetos em subdiretórios no diretório "objetos", onde cada subdiretório terá seu respectivo nome, contendo as respectivas classes e suas filhas.
- [x] Criar métodos na classe Cálculo de vida para cada classe;
- [x] Criar o método construtor das classes de raças
	- [x] Corrigir a escrita do método construtor das classes filhas já criadas
	- [x] Criar métodos abstratos de raça na classe Personagem;
	- [x] Criar métodos abstratos de classe em cada classe de Raça (estes métodos deverão ser instanciados em suas classes filhas, por consequência);
- [ ]  Criar classes para cada raça e suas respectivas classes de personagens:
	- [ ] Humano:
		- [x] Bárbaro
		- [ ] Bardo
		- [x] Bruxo
		- [ ] Clérigo
		- [ ] Druida
		- [ ] Feiticeiro
		- [x] Guerreiro
		- [ ] Ladino
		- [ ] Mago
		- [ ] Monge
		- [ ] Paladino
		- [ ] Patrulheiro
		
- [ ] Modularizar todos os métodos específicos das classes 
	- [X] Barbaro
	- [X] Classes mágicas (Bardo, Bruxo, Clérigo e Druida)
	- [ ] Mago
	- [ ] Paladino
- [ ] Desenvolver o MVP ainda sem GUI

### Segunda fase (implementação da GUI)

