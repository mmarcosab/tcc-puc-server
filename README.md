# tcc-puc-server

Projeto desenvolvido para obtenção do 



**Requisitos Funcionais**

Uma vez que você escolhe o tema a ser abordado no seu TCC, apresentamos um conjunto genérico de funcionalidades que a sua aplicação deve apresentar. 
Cabe a você escolher em qual funcionalidade você irá incorporar os requisitos apresentados na relação a seguir. São eles:  

|ID	  |  Requisito Funcional	                |  Descrição |
|-----|---------------------------------------|-----------------|
RF-01	|  Login e registro de usuários	        | O sistema deve oferecer funcionalidade de login de usuários com a possibilidade do registro de novos usuários de forma autônoma por pessoas que ainda não estão cadastradas |
RF-02	|  Controle de acesso a funcionalidades	| O sistema deve controlar o acesso a funcionalidades a partir dos perfis de usuários como, por exemplo, os seguintes: administrador do sistema, gestor/gerente/operador e usuário |
RF-03	|  Menu do sistema	                      | O sistema deve apresentar um menu de opções que dê acesso a todas as funcionalidades que o sistema provê |
RF-04	|  Telas de cadastro	                    | O sistema deve ser estruturado com pelo menos 5 entidades para as quais devem ser fornecidas telas de cadastro completas cumprindo os seguintes itens: A tela deve oferecer todas as operações de CRUD (Create/Retrieve/Update/Delete), a menos que haja uma regra de negócio que justifique não poder excluir ou alterar os dados diretamente. A tela deve oferecer funcionalidade de exportação de dados em formato Excel ou PD . Nos campos do cadastro que estão associados a outras entidades do sistema, deve ser fornecido um mecanismo de lookup dos dados da outra entidade (combobox ou janela de seleção), além da possibilidade de se informar o respectivo código da entidade associada. |
RF-05	|  Tela mestre/detalhe	                  | O sistema deve apresentar pelo menos uma tela em que seja feito cadastro de dados em estrutura mestre/detalhe (duas entidades associadas)|
RF-06	|  Telas de transações	                  | O sistema deve apresentar pelo menos 3 telas de processamento de transações com suas respectivas regras de negócio a partir das entidades do sistema.|
RF-07	|  Relatório gráfico de estatísticas	    | O sistema deve apresentar pelo menos uma tela de relatório com as estatísticas do sistema de forma gráfica (gráfico de barras, gráfico de linhas, etc.) em que sejam mostrados pelo menos 5 indicadores (Ex: número  de consultas por mês, total de vendas por mês ou por loja, total de eventos da semana ou por categoria).|


**Requisitos não funcionais**

Além das funcionalidades apresentadas acima, o sistema deverá apresentar as seguintes características:

|ID	  |  Requisito Não Funcional	            | Descrição       |
|-----|---------------------------------------|-----------------|
|RNF-01 |	Integração OAuth	             |      Integração do login com algum servidor de autenticação baseado em OAuth (Google Accounts, Facebook, Linkedin, etc) |
|RNF-02 |	Responsividade	               |     A interface completa do sistema deve apresentar nível avançado de responsividade, sendo corretamente apresentado em dispositivos móveis como tablets e celulares, além de desktops |
RNF-03	| Banco de dados	                 |    Os dados do sistema devem ser armazenados em um banco de dados relacional ou noSql |


**Restrições Técnicas**

As restrições técnicas  limitam o que poderá ser empregado por você no desenvolvimento da sua aplicação. São elas:

|ID	    | Restrição	                       |     Descrição                |
|-------|----------------------------------|------------------------------|
|RT-01	|  Aplicação 100% Web	             |     O sistema deve ser 100% compatível com a Web, utilizando navegadores/browsers como clientes e servidores Web como ambiente de armazenamento de dados |
|RT-02	| Tabelas de Bancos de Dados	     |    O banco de dados do sistema deverá ter no mínimo 8 tabelas associadas ao propósito principal da solução.  No caso de projetos que usem bancos noSQL, devem ser retratadas pelo menos 6 entidades. IMPORTANTE: Não entram nesta conta as tabelas relacionadas a usuários e controle de acesso. |
|RT-03	|  Plataformas de Gestão de Conteúdo	 |   Para o cumprimento dos requisitos funcionais NÃO poderá ser utilizada uma plataforma pronta de gestão de sites de conteúdos como Wordpress, Drupal, Joomla ou similar |
|RT-04	|  Linguagens de Programação	     |       As linguagens de programação utilizadas no desenvolvimento dos módulos de Back-End e Front-end devem constar da relação 
apresentada nas disciplinas do curso. É vedado o uso de linguagens de programação diferentes daquelas vistas no curso |
