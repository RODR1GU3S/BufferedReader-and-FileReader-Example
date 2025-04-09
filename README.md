# 📄 Leitura de Arquivos com `BufferedReader` e `FileReader` em Java

Este projeto demonstra como utilizar as classes `BufferedReader` e `FileReader` para ler arquivos texto linha por linha em Java.

## 💡 Objetivo

Ler um arquivo texto (`in.txt`) e armazenar cada linha em uma lista. Em seguida, exibir cada linha no console.

---

## 🛠️ Técnicas Utilizadas

### `FileReader`

A classe `FileReader` é usada para abrir e ler o conteúdo de um arquivo caractere por caractere.
 Ela serve como ponte entre o arquivo e o Java, permitindo acessar os dados de forma básica.

### `BufferedReader`

A classe `BufferedReader` envolve o `FileReader` e adiciona uma camada de buffer.
 Isso significa que os dados são lidos em blocos maiores e armazenados em memória temporariamente, o que melhora o desempenho em relação à leitura caractere por caractere.

Além disso, o `BufferedReader` fornece métodos convenientes, como:

- `readLine()`: Lê uma linha inteira do arquivo por vez (até encontrar `\n` ou o fim do arquivo).

---

## 📌 Funcionamento do Código

```java
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while(line != null) {
        list.add(line);
        line = br.readLine();
    }
}
```

### Etapas:
1. Define-se o caminho do arquivo.
2. Cria-se um `BufferedReader` envolto em um `FileReader`.
3. Usa-se `readLine()` em um laço `while` para ler cada linha até o final do arquivo.
4. Cada linha lida é adicionada a uma lista de strings.
5. Fora do bloco `try`, todas as linhas armazenadas são exibidas no console.

---

## ✅ Benefícios do Uso de `BufferedReader` com `FileReader`

- **Eficiência**: O `BufferedReader` reduz chamadas ao sistema de arquivos, tornando a leitura mais rápida.
- **Facilidade**: O método `readLine()` simplifica a leitura por linha.
- **Leitura Segura**: O bloco `try-with-resources` garante o fechamento automático do arquivo, mesmo em caso de exceções.
- **Flexibilidade**: As linhas são armazenadas em uma lista, possibilitando processamento posterior com facilidade.

---

## 📂 Exemplo de Arquivo `in.txt`

```
João Silva,joao@gmail.com
Maria Oliveira,maria@hotmail.com
Carlos Souza,carlos@yahoo.com
```

---

## 🧪 Saída Esperada

```
Leitura da linha: João Silva,joao@gmail.com
Leitura da linha: Maria Oliveira,maria@hotmail.com
Leitura da linha: Carlos Souza,carlos@yahoo.com
```

---

## 🧠 Conclusão

A combinação de `FileReader` com `BufferedReader` é uma prática eficiente e comum em Java para leitura de arquivos texto.
 Ela é especialmente útil em cenários onde é necessário processar grandes quantidades de dados de forma performática e organizada.

---
