# 🏦 Banco API- ProyectoBanco

**Banco API** es una aplicación RESTful hecha con Spring Boot que simula las funciones básicas de un banco, como manejar clientes, cuentas, depósitos, retiros, transferencias y calcular intereses. Está pensada como una herramienta práctica para aprender a desarrollar servicios backend en Java, con una estructura clara, modular y fácil de escalar.

Utilizamos programación orientada a objetos con el fin de aprender y aplicar esta técnica de desarrollo, lo que nos permitió comprender a fondo cómo funciona el proyecto. Para lograrlo, nos apoyamos en los conceptos básicos de la teoría como:

**Objetos:** que representan entidades reales dentro del sistema y nos permiten interactuar con sus propiedades y comportamientos.

**Abstracción:** para centrarnos en los aspectos esenciales de cada entidad, ocultando detalles innecesarios y facilitando la comprensión del sistema.

**Clases:** que definieron las estructuras principales del sistema, como clientes, cuentas y transacciones, sirviendo como plantillas para crear objetos se
pueden definir como los moldes que se van a usar para crear los metodos de las funciones del banco.

**Modelos:** que nos ayudaron a representar los datos de forma organizada y coherente, facilitando la comunicación entre la lógica del negocio.

**Herencia:** que permitió reutilizar código y establecer relaciones entre clases, haciendo el sistema más limpio, flexible y escalable.

## 📘 Descripción General

**Appbank** es una aplicación desarrollada en **Java** con **Spring Boot**, que simula las operaciones básicas de un sistema bancario digital.  
El sistema permite la gestión de clientes, la creación de cuentas (de ahorro o corriente), depósitos, retiros, transferencias y aplicación de intereses.

Su arquitectura se basa en el modelo **MVC (Modelo-Vista-Controlador)** y sigue principios de **programación orientada a objetos (POO)** y **buenas prácticas de diseño**, como separación de responsabilidades y uso de interfaces.

**DOCUMENTACION DE LOS PAQUETES Y SUS FUNCIONES**
## 🧩 Paquetes Principales

🧱 Estructura de Paquetes del Proyecto Appbank
🏁 com.logsoluprobl.appbank

**Función:**
Contiene la clase principal que inicia toda la aplicación Spring Boot.
Aquí está el punto de entrada del programa: AppbankApplication.java.
👉 Su funcion iniciar el contexto de Spring, cargar los beans y lanzar el servidor embebido.

🌐 com.logsoluprobl.appbank.controller

**Función:** Maneja las peticiones HTTP del usuario (API REST).
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







