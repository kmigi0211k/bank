# 🏦 Banco API

**Banco API** es una aplicación RESTful desarrollada en **Spring Boot** que simula las operaciones básicas de un sistema bancario, incluyendo la gestión de clientes, cuentas, depósitos, retiros, transferencias y cálculo de intereses.  
Su propósito es ofrecer una arquitectura limpia, modular y escalable para la práctica de desarrollo de servicios backend en Java.

## 📘 Descripción General

**Appbank** es una aplicación desarrollada en **Java** con **Spring Boot**, que simula las operaciones básicas de un sistema bancario digital.  
El sistema permite la gestión de clientes, la creación de cuentas (de ahorro o corriente), depósitos, retiros, transferencias y aplicación de intereses.

Su arquitectura se basa en el modelo **MVC (Modelo-Vista-Controlador)** y sigue principios de **programación orientada a objetos (POO)** y **buenas prácticas de diseño**, como separación de responsabilidades y uso de interfaces.

## 🧩 Paquetes Principales

🧱 Estructura de Paquetes del Proyecto Appbank
🏁 com.logsoluprobl.appbank

#Función:
Contiene la clase principal que inicia toda la aplicación Spring Boot.
Aquí está el punto de entrada del programa: AppbankApplication.java.
👉 Su funcion iniciar el contexto de Spring, cargar los beans y lanzar el servidor embebido.

🌐 com.logsoluprobl.appbank.controller

#Función:
Maneja las peticiones HTTP del usuario (API REST).
Define los endpoints del sistema y se comunica con los servicios para ejecutar operaciones bancarias.

##Clase principal:

BankController.java → recibe solicitudes como crear clientes, abrir cuentas, depositar, retirar, transferir dinero y consultar transacciones.
👉 su funcion servir como interfaz entre el cliente (Postman o frontend) y la lógica del sistema.

⚠️ com.logsoluprobl.appbank.exception

#Función:
Centraliza el manejo de errores personalizados del dominio.
Permite lanzar excepciones controladas cuando se presentan casos como saldo insuficiente o cliente inexistente.

##Clase:
DomainException.java → excepción personalizada para capturar errores específicos del negocio.
👉 su principal funcion mejorar el manejo de errores y la claridad del código.


🧩 com.logsoluprobl.appbank.model

#Función:
Contiene las entidades del dominio (modelos del mundo real dentro del sistema bancario).

##Clases principales:

Customer.java → representa un cliente (id, nombre, email, lista de cuentas).

Account.java → clase abstracta base para las cuentas (atributos comunes como saldo y número de cuenta).

SavingsAccount.java → cuenta de ahorros, tiene tasa de interés y método applyInterest().

CheckingAccount.java → cuenta corriente, permite sobregiro hasta un límite definido.

Money.java → clase para manejar cantidades monetarias.

Transaction.java → representa un movimiento financiero (fecha, monto, tipo de operación).

👉 definir la estructura de los datos y las reglas básicas de cada entidad del sistema.


💾 com.logsoluprobl.appbank.repository

#Función:
Encargado del almacenamiento y recuperación de datos.
Simula la persistencia de información usando archivos JSON o texto (sin base de datos real).

##Clases principales:

JsonRepository.java → guarda y carga información en formato JSON.

FileManager.java → gestiona la lectura y escritura en archivos locales.

👉  actuar como capa de persistencia, separando el acceso a datos del resto de la lógica del sistema.

⚙️ com.logsoluprobl.appbank.service

#Función:
Contiene la lógica de negocio del sistema bancario.
Aquí se definen y ejecutan las reglas que controlan las operaciones.

##Clases principales:

BankService.java → interfaz que define las operaciones del banco (crear cliente, depositar, transferir, etc.).

BankServiceImpl.java → implementación de la interfaz, con toda la lógica real.

InterestStrategy.java → interfaz del patrón Strategy para definir estrategias de cálculo de interés.

👉 procesar las operaciones del banco, aplicar validaciones, y coordinar los repositorios.

📈 com.logsoluprobl.appbank.service.strategy

#Función:
Define las estrategias concretas para calcular intereses.
Permite intercambiar diferentes formas de cálculo sin alterar el código principal.

##Clase:

SimpleRateStrategy.java → aplica una tasa de interés fija a las cuentas de ahorro.

TieredRateStrategy → aplica tasas variables según el saldo (por ejemplo, 3% hasta cierto monto, 5% si supera un umbral).
Ideal para bancos que premian saldos más altos.

 proporcionar flexibilidad para definir distintas formas de calcular intereses.

🧰 com.logsoluprobl.appbank.util

#Función:
Contiene clases auxiliares y utilitarias que apoyan la funcionalidad del proyecto.
Suele incluir funciones estáticas reutilizables en distintas capas.

##Clase:
JsonUtil  gestiona conversiones entre objetos Java y JSON (por ejemplo, usando Gson o Jackson).
