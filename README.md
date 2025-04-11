## 📄 Leitura de Arquivos com `BufferedReader` e `FileReader` em Java

Este projeto demonstra a leitura de arquivos de texto utilizando as classes `BufferedReader` e `FileReader` em Java.
O programa realiza duas leituras distintas: uma de um arquivo com conteúdo do tipo `String`, e outra de um arquivo contendo números inteiros (`Integer`), exibindo cada item lido no console.

---

### ✅ Técnicas e Conceitos Aplicados

#### 1. **Leitura de Arquivos com `BufferedReader`**
- Utilização do `BufferedReader` em conjunto com `FileReader` para realizar a leitura de arquivos linha por linha.
- Esta abordagem é eficiente para leitura de grandes volumes de dados, pois o `BufferedReader` faz leitura em buffer, reduzindo o acesso ao disco.

#### 2. **Tratamento de Exceções com `try-with-resources`**
- A estrutura `try-with-resources` garante que os recursos (neste caso, o `BufferedReader`) sejam automaticamente fechados após a leitura, mesmo que ocorra uma exceção.
- Isso evita vazamentos de recursos e torna o código mais limpo e seguro.

```java
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    // leitura
}
```

#### 3. **Armazenamento em Listas Genéricas (`List<String>` e `List<Integer>`)**
- As linhas lidas são armazenadas em coleções do tipo `List` para posterior manipulação ou exibição.
- Uso de `ArrayList` por ser uma implementação simples e eficiente para leitura sequencial.

#### 4. **Conversão de Dados (`String` → `Integer`)**
- Os dados lidos como `String` são convertidos para `Integer` usando `Integer.parseInt()`, permitindo o processamento de dados numéricos.
- Essa conversão é feita dentro do laço de leitura, logo após a leitura de cada linha.

#### 5. **Estrutura de Controle (`while` loop)**
- Utilização de um laço `while` para percorrer todas as linhas do arquivo até encontrar o final (`null`).
- Técnica eficiente e direta para ler até o final de um arquivo.

---

### 📁 Estrutura Esperada dos Arquivos

- `in.String.txt`: Arquivo de texto onde cada linha contém uma `String`.
- `in.Integer.txt`: Arquivo de texto onde cada linha contém um número inteiro válido.

---

### 🧼 Boas Práticas Aplicadas

- **Separação de responsabilidades**: cada bloco de leitura trata de um tipo específico de dado.
- **Tratamento de erros**: o programa captura e exibe mensagens de erro caso a leitura do arquivo falhe.
- **Código comentado**: todas as etapas estão devidamente comentadas para facilitar o entendimento.

---

### 🚀 Sugestões de Melhoria

- Refatorar o código usando **métodos genéricos** e **expressões lambda** para evitar duplicação (como apresentado anteriormente).
- Criar uma classe utilitária para leitura genérica de arquivos.
- Adicionar validação de entrada para conversões (ex: tratar `NumberFormatException` ao fazer `parseInt`).

---

### 💡 Exemplo de Saída

```text
Conteúdo de in.String.txt:
João
Maria
Carlos

Conteúdo de in.Integer.txt:
10
20
30
```
