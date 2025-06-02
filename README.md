
# Shopzy Quality Assurance

🚀 Projeto de automação de testes focado em garantir a qualidade do sistema **Shopzy**, desenvolvido como parte de uma atividade acadêmica.

## 📝 Descrição

Este projeto tem como objetivo aplicar práticas de testes unitários e de integração para validar funcionalidades do sistema. 
A implementação foca em garantir que os componentes essenciais do **Shopzy** estejam funcionando corretamente, contribuindo para a estabilidade e confiabilidade do software.

## 🛠 Tecnologias e Ferramentas

- **Java 21**
- **JUnit 5**
- **Maven** (gerenciador de dependências e build)
- **JaCoCo** (para análise de cobertura de testes)

## 📊 Acessando Relatórios de Testes

Após rodar o CI/CD, os **resultados dos testes** podem ser visualizados na aba **"Actions"** do GitHub.  
Para visualizar o relatório de cobertura JaCoCo:

1. Vá até a aba **"Actions"** no GitHub.
2. Acesse o último workflow rodado.
3. Baixe o artefato **JaCoCoCoverage** e explore os relatórios dentro de `target/site/jacoco/`.


## 🔄 CI/CD Automatizado

Este projeto utiliza **GitHub Actions** para automação de testes. Sempre que um código é atualizado na branch `main`, os testes são executados automaticamente, garantindo a qualidade do software.


## 📂 Estrutura do Projeto

```
shopzy-quality-assurance/
├── src/
│   ├── main/        # Código fonte (se houver)
│   └── test/        # Testes unitários e de integração
├── pom.xml          # Gerenciador de dependências Maven
├── README.md        # Descrição do projeto
```

## 🚀 Como Executar o Projeto

1. Clone este repositório:

```bash
git clone https://github.com/pedroleal2023/shopzy-quality-assurance.git
```

2. Acesse a pasta do projeto:

```bash
cd shopzy-quality-assurance
```

3. Compile o projeto:

```bash
mvn clean compile
```

4. Execute os testes:

```bash
mvn test
```

## 🧠 Aprendizados

- Práticas de testes automatizados com JUnit.
- Integração de ferramentas de análise de cobertura.
- Organização de projetos Java utilizando Maven.
- Aplicação dos conceitos de qualidade de software.

## 🧑‍💻 Autor

| [Pedro Leal](https://github.com/pedroleal2023) |
|:------------------------------------------------:|
