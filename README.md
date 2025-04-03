# Princípio da Segregação de Interfaces (ISP) - Estudos com Java

Este repositório tem como objetivo explorar o Princípio da Segregação de Interfaces (ISP), um dos princípios do SOLID, aplicados ao desenvolvimento em Java. O estudo será baseado em cenários que inicialmente violam o ISP e, em seguida, serão corrigidos para seguir boas práticas de design de software.

## 📌 O que é o Princípio da Segregação de Interfaces (ISP)?

O ISP (Interface Segregation Principle) estabelece que uma interface não deve obrigar uma classe a implementar métodos que ela não utiliza. Em outras palavras, é preferível ter várias interfaces pequenas e especializadas do que uma interface grande e genérica. Isso melhora a coesão, reduz dependências desnecessárias e evita a necessidade de implementar métodos irrelevantes para certas classes.

### ✨ Benefícios do ISP:
- Evita a implementação de métodos desnecessários em classes que não precisam deles.
- Aumenta a flexibilidade e reutilização do código.
- Torna o código mais fácil de entender e manter.
- Reduz o acoplamento entre classes e interfaces.

---

## 🚀 Casos de Estudo

### 📌 Caso 1: Interface `Worker`
#### ❌ Problema:
Uma interface única (`Worker`) exigia que todas as classes implementassem métodos como `work()`, `eat()` e `sleep()`, mesmo quando nem todas precisavam dessas funcionalidades. Por exemplo, um robô, que só trabalha, era forçado a implementar métodos de alimentação e sono, levando a exceções ou métodos vazios.

#### ✅ Solução:
A interface foi dividida em três menores (`Workable`, `Eatable` e `Sleepable`), garantindo que cada classe implementasse apenas as funcionalidades que realmente fazem sentido para ela.

---

### 📌 Caso 2: Interface `Printer`
#### ❌ Problema:
A interface `Printer` exigia que todas as impressoras implementassem funções de impressão, digitalização e envio de fax, mesmo que algumas só precisassem imprimir. Isso gerava código desnecessário e violações do princípio da segregação de interfaces.

#### ✅ Solução:
A interface foi separada em três interfaces especializadas: `Printable`, `Scannable` e `Faxable`. Dessa forma, cada classe de impressora passou a implementar apenas as interfaces que fazem sentido para suas capacidades.

---

### 📌 Caso 3: Interface `NotificationSender`
#### ❌ Problema:
A interface `NotificationSender` definia métodos para envio de notificações por e-mail, SMS e push, obrigando todas as classes a implementarem métodos que poderiam não ser necessários.  
Exemplo de problemas:
- Um serviço que só envia e-mails era forçado a implementar métodos de SMS e push, resultando em exceções ou métodos vazios.  
- Isso tornava o código rígido e contrário ao princípio da segregação de interfaces.  

#### ✅ Solução:
A interface foi segmentada em `EmailSender`, `SMSSender` e `PushNotificationSender`, garantindo que cada implementação tenha apenas os métodos necessários. Agora, classes que enviam notificações podem escolher quais interfaces implementar, sem carregar métodos desnecessários.

---

## 📚 Contribuições
Se desejar sugerir melhorias ou novos casos para estudo, sinta-se à vontade para abrir uma issue ou enviar um pull request.

---

## 👨‍💻 Autor
Danilo Takeo Kanizawa

