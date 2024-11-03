Este projeto é uma aplicação Java que utiliza o Spring Framework. A seguir, estão as instruções para configurar, construir e executar a aplicação.

# **Pré-requisitos**

Certifique-se de que os seguintes softwares estão instalados em seu sistema:

Java Development Kit (JDK): Versão 8 ou superior.
Maven: Ferramenta de automação de compilação para projetos Java.
Configuração
Clonar o repositório:

### **bash**
git clone https://github.com/pedroarchilha/java_sprint_pipeline.git
Navegar até o diretório do projeto:

### **bash**
cd java_sprint_pipeline
Construção
Para construir o projeto, execute o seguinte comando:

### **bash**
mvn clean install
Este comando compilará o código-fonte, executará os testes e gerará o arquivo JAR na pasta target/.

### **Execução**
Após a construção bem-sucedida, execute a aplicação com o seguinte comando:

### **bash**
java -jar target/nome-do-arquivo.jar
Substitua nome-do-arquivo.jar pelo nome real do arquivo JAR gerado na etapa de construção.

### **Testes**
Para executar os testes unitários, utilize o comando:

mvn test
Este comando executará todos os testes definidos no projeto.

# **Integração Contínua**
Este projeto está configurado para integração contínua utilizando o Azure Pipelines. O arquivo azure-pipelines.yml contém a definição do pipeline. Para configurar o pipeline no Azure DevOps:

Acesse o Azure DevOps.
Crie um novo projeto ou selecione um existente.
Navegue até a seção de Pipelines e clique em "Criar Pipeline".
Selecione o repositório do GitHub e autorize o acesso.
O Azure Pipelines detectará automaticamente o arquivo azure-pipelines.yml e configurará o pipeline de acordo.
Para mais detalhes sobre a configuração de pipelines Java com o Azure Pipelines, consulte a documentação oficial.


### **Licença**
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.
