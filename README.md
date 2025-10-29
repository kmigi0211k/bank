# 🏦 Banco API- ProyectoBanco

**Banco API** es una aplicación **RESTful** hecha con Spring Boot que simula las funciones básicas de un banco, como manejar clientes, cuentas, depósitos, retiros, transferencias y calcular intereses. Está pensada como una herramienta práctica para aprender a desarrollar servicios backend en Java, con una estructura clara, modular y fácil de escalar.

Utilizamos programación orientada a objetos con el fin de aprender y aplicar esta técnica de desarrollo, lo que nos permitió comprender a fondo cómo funciona el proyecto. Para lograrlo, nos apoyamos en los conceptos básicos de la teoría como:

**Objetos:** que representan entidades reales dentro del sistema y nos permiten interactuar con sus propiedades y comportamientos.

**Abstracción:** para centrarnos en los aspectos esenciales de cada entidad, ocultando detalles innecesarios y facilitando la comprensión del sistema.

**Clases:** que definieron las estructuras principales del sistema, como clientes, cuentas y transacciones, sirviendo como plantillas para crear objetos se
pueden definir como los moldes que se van a usar para crear los metodos de las funciones del banco.

**Modelos:** que nos ayudaron a representar los datos de forma organizada y coherente, facilitando la comunicación entre la lógica del negocio.

**Herencia:** que permitió reutilizar código y establecer relaciones entre clases, haciendo el sistema más limpio, flexible y escalable.

## 📘 CONTENIDO DEL PROYECTO

**Appbank** es una aplicación desarrollada en **Java** con **Spring Boot**, que simula las operaciones básicas de un sistema bancario digital.  
El sistema permite la gestión de clientes, la creación de cuentas (de ahorro o corriente), depósitos, retiros, transferencias y aplicación de intereses.

Su arquitectura se basa en el modelo **MVC (Modelo-Vista-Controlador)** y sigue principios de **programación orientada a objetos (POO)** y **buenas prácticas de diseño**, como separación de responsabilidades y uso de interfaces.

**DOCUMENTACION DE LOS PAQUETES Y SUS FUNCIONES**
## 🧩 PAQUETES PRINCIPALES

🧱 Estructura de Paquetes del Proyecto Appbank
🏁 com.logsoluprobl.appbank

**Función:**
Contiene la clase principal que inicia toda la aplicación Spring Boot.
Aquí está el punto de entrada del programa: AppbankApplication.java.
👉 Su funcion iniciar el contexto de Spring, cargar los beans y lanzar el servidor embebido.

🌐 com.logsoluprobl.appbank.controller

**Función:** Maneja las peticiones HTTP del usuario **(API REST)**.
Define los endpoints del sistema y se comunica con los servicios para ejecutar operaciones bancarias.

**Clase principal:**

BankController.java → recibe solicitudes como crear clientes, abrir cuentas, depositar, retirar, transferir dinero y consultar transacciones.
👉 su funcion servir como interfaz entre el cliente (Postman o frontend) y la lógica del sistema.

⚠️ com.logsoluprobl.appbank.exception

**Función:** Centraliza el manejo de errores personalizados del dominio.
Permite lanzar excepciones controladas cuando se presentan casos como saldo insuficiente o cliente inexistente.

**Clase:** DomainException.java → excepción personalizada para capturar errores específicos del negocio.
👉 su principal funcion mejorar el manejo de errores y la claridad del código.


🧩 com.logsoluprobl.appbank.model

**Función:** Contiene las entidades del dominio (modelos del mundo real dentro del sistema bancario).

**Clases principales:**
Customer.java → representa un cliente (id, nombre, email, lista de cuentas).

Account.java → clase abstracta base para las cuentas (atributos comunes como saldo y número de cuenta).

SavingsAccount.java → cuenta de ahorros, tiene tasa de interés y método applyInterest().

CheckingAccount.java → cuenta corriente, permite sobregiro hasta un límite definido.

Money.java → clase para manejar cantidades monetarias.

Transaction.java → representa un movimiento financiero (fecha, monto, tipo de operación).

👉 se encarga de definir la estructura de los datos y las reglas básicas de cada entidad del sistema.


💾 com.logsoluprobl.appbank.repository

**Función:** Encargado del almacenamiento y recuperación de datos.
Simula la persistencia de información usando archivos JSON o texto (sin base de datos real).

**Clases principales:**

JsonRepository.java → guarda y carga información en formato JSON.

FileManager.java → gestiona la lectura y escritura en archivos locales.

👉 se encarga en actuar como capa de persistencia, separando el acceso a datos del resto de la lógica del sistema.

⚙️ com.logsoluprobl.appbank.service

**Función:** Contiene la lógica de negocio del sistema bancario.
Aquí se definen y ejecutan las reglas que controlan las operaciones.

**Clases principales:**

BankService.java → interfaz que define las operaciones del banco (crear cliente, depositar, transferir, etc.).

BankServiceImpl.java → implementación de la interfaz, con toda la lógica real.

InterestStrategy.java → interfaz del patrón Strategy para definir estrategias de cálculo de interés.

👉 su principal funcion procesar las operaciones del banco, aplicar validaciones, y coordinar los repositorios.

📈 com.logsoluprobl.appbank.service.strategy

**Función:** Define las estrategias concretas para calcular intereses.
Permite intercambiar diferentes formas de cálculo sin alterar el código principal.

**Clase:**
SimpleRateStrategy.java → aplica una tasa de interés fija a las cuentas de ahorro.

TieredRateStrategy → aplica tasas variables según el saldo (por ejemplo, 3% hasta cierto monto, 5% si supera un umbral).
Ideal para bancos que premian saldos más altos.

👉 se encarga de proporcionar flexibilidad para definir distintas formas de calcular intereses.

🧰 com.logsoluprobl.appbank.util

**Función:** Contiene clases auxiliares y utilitarias que apoyan la funcionalidad del proyecto.
Suele incluir funciones estáticas reutilizables en distintas capas.

**Clase:**
JsonUtil  gestiona conversiones entre objetos Java y JSON (por ejemplo, usando Gson o Jackson).

👉 su responsabilidad es facilitar tareas comunes sin mezclar lógica de negocio.

**POSTMAN PARA VER EJECUCIONES**

🔧 Principios clave de una API RESTful
Uso de métodos HTTP estándar que veremos en las siguiente ejecuciones que hice en el aplicativo postman.

**GET:** Obtener datos.

**POST:** Crear nuevos clientes.

**PUT:** Actualizar.

**DELETE:** Eliminar.

**🚀 ¿Por qué Postman es tan útil en el desarrollo de APIs?**

**🧪 Pruebas rápidas y efectivas**
probar endpoints RESTful **(GET, POST, PUT, DELETE)** en segundos.
Muestra respuestas detalladas con códigos de estado, tiempos de ejecución y estructuras JSON.

**✅ Flexibilidad**
Su interfaz gráfica permite crear y enviar peticiones HTTP sin necesidad de escribir código.

**CREAR CLIENTES**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/37377933-de3b-42d1-b9a7-247c68229d84" />



**LISTAR CLIENTES**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c1a9ff77-4ed3-407a-8c92-825d43d28e9c" />




**BUSCAR CLIENTE POR ID**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/9745d9f1-fd4f-4549-968b-640c3e04a2b8" />



**CREAR CUENTA AHORROS**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/19e794d8-27e1-460d-baf3-3ef178758eb5" />



**CREAR CUENTA CORRIENTE**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/e01d0d4f-7dc0-430e-b0a4-7cb8b6450b3c" />


**DEPOSITAR DINERO**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/cb681783-ab75-4a5f-9be8-9074aa0dd060" />


**RETIRAR DINERO**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/8f8fff73-39a5-455f-9c61-b825b6359fb4" />


**TRANSFERIR DINERO**
<img width="1366" height="765" alt="image" src="https://github.com/user-attachments/assets/5655510e-837d-4361-ab1c-56418ab9a943" />


**VER TRANSACCIONES**
<img width="1364" height="768" alt="image" src="https://github.com/user-attachments/assets/9aea2f7b-077e-4b44-b539-0bd6f5f1f591" />


**APLICAR INTERESES**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/deef55d2-80ea-4000-8439-6381643d6cbb" />

**#PRUEBAS SWAGGER**
**💡 ¿Qué es Swagger?**

Swagger es una herramienta que sirve para documentar, visualizar y probar APIs REST de forma gráfica y automática.
Cuando tu proyecto usa Swagger, puedes abrir una página como esta tenemos que tener en cuenta que esta es una dependencia
por lo tanto hay que asignarla en el archivo pom.xml.

**pom.xml
</dependency>
		<dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.2.0</version>
        </dependency>
		<dependency>**

    

 **Esta es la ruta para ver la documentacion**
http://localhost:8080/swagger-ui/index.html



**1️ GET /api/bank/customers**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/0a84f960-c1c0-40ea-907c-3febf0c077a9" />

**2️ POST /api/bank/customers**
<img width="1364" height="768" alt="image" src="https://github.com/user-attachments/assets/39ea903d-8596-4ea9-9252-62d228cda167" />

**3️ GET /api/bank/customers/{customerId}/accounts**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/7988ccc7-0539-407a-8511-6916c170d5da" />

**4️ POST /api/bank/customers/{customerId}/accounts**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/fb58582b-acb6-4205-940c-9362abe00286" />

**5️ POST /api/bank/accounts/{fromAccountId}/transfer**
<img width="1366" height="767" alt="image" src="https://github.com/user-attachments/assets/6241f8d9-0eed-4d91-863b-6624be11e505" />

**6️ POST /api/bank/accounts/{accountId}/withdraw**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c605706c-d15b-4a83-b32d-121d2650b0ff" />

**7️ POST /api/bank/accounts/{accountId}/deposit**
<img width="1365" height="768" alt="image" src="https://github.com/user-attachments/assets/16ba0375-b99b-4ebb-9e6d-30a39265fc9a" />

**8️ POST /api/bank/accounts/{accountId}/apply-interest**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/a9ef2ce3-760e-4c45-9cb3-ffb93ab4b199" />


**9️ GET /api/bank/customers/{customerId}**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c2f118b6-0ffc-463a-a832-42a1b2850e3c" />


**10 GET /api/bank/accounts/{accountId}**
<img width="1365" height="765" alt="image" src="https://github.com/user-attachments/assets/6f93711d-25a8-4b82-833d-db949efc5603" />


**1️1 GET /api/bank/accounts/{accountId}/transactions**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/cabf11ef-96fa-4bf1-8538-a14b800cca6b" />














